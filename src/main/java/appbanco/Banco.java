package appbanco;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {

	
	private final double  [] cuentas ;
	
	// La clase ReentrantLock implementa la interfaz Lock
	private Lock cierreBanco = new ReentrantLock();
	
	private Condition saldoSuficiente;
	public Banco(int numeroCuentas) {	
		cuentas = new double[numeroCuentas];
		setSaldoInicial();
		
		saldoSuficiente = cierreBanco.newCondition();
		
	}
	private void setSaldoInicial(){
		
		for (int i =0;i<cuentas.length;i++) 		
			cuentas[i]= 2000;
	}
	
	
	public void transferir(int cuentaOrigen, int cuentaDestino, double monto) throws InterruptedException {
		
		// bloquea el codigo para que sea leido solo por un hilo , el hilo que viene por detras 
		// se quedara a la espera, funciona como un semaforo, hasta que se desbloque el hilo que esta utilizando
		// esto reemplaza al uso del metodo join
		cierreBanco.lock();
		
		// Encerrar dentro del try, el codigo a blquear
		try {
		
			// Evalua que el saldo no sea menor al monto 
			/*if (cuentas[cuentaOrigen]<monto) {
			
				System.out.println("Monto inferior");
				return;
			}*/
			
			while(cuentas[cuentaOrigen]<monto) {
				
				// Pone a la espera el hilo, ademas libera el flujo para que otro hilo ingrese,
				// pero recordar que este hilo se queda a la escucha, osea no se pierde.
				 saldoSuficiente.await();
			}
			
				
			System.out.println("Hilo ejecutando: " + Thread.currentThread());
			System.out.println();
			// Cuenta que sale de la cuenta origen
			cuentas[cuentaOrigen] -= monto;
		
			System.out.printf("%10.2f de %d para %d", monto, cuentaOrigen, cuentaDestino);
			// Asignar saldo a la cuenta destino
			cuentas[cuentaDestino] += monto;
			System.out.println();
			System.out.printf("Saldo total: %10.2f%n", getSaldoTotal() );
		
			// Informa / despierta los hilos que estaban a la escucha 
			saldoSuficiente.signalAll();
			}finally{
				// Desbloquear el hilo, para que otro hilo ingrese 
				cierreBanco.unlock();
			}
	}
	
	
	public double getSaldoTotal() {
		
		double sumaCuentas =0;
		for (double saldo: cuentas) {
			
			sumaCuentas+= saldo;
		}
		
		return sumaCuentas;
	}
	
	
}

class TransferirDinero implements Runnable{

	
	 public TransferirDinero(Banco banco, int deLaCuenta, double cantidadMaxima) {
		// TODO Auto-generated constructor stub
		 
		 this.banco = banco;
		 this.deLaCuenta = deLaCuenta;
		 this.cantidadMaxima = cantidadMaxima;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			while(true) {
				int paraLaCuenta = (int) (100*Math.random());
				double monto = cantidadMaxima*Math.random();
				
				banco.transferir(deLaCuenta, paraLaCuenta, monto);
				
				Thread.sleep( (int) (10*Math.random()) );
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMaxima;
	
}

