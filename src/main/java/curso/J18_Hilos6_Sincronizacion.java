package curso;

public class J18_Hilos6_Sincronizacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ContadorNumeros hilo1 = new ContadorNumeros("A");
		ContadorNumeros hilo2 = new ContadorNumeros(hilo1, "B");
		ContadorNumeros hilo3 = new ContadorNumeros(hilo2, "C");
		ContadorNumeros hilo4 = new ContadorNumeros(hilo3, "D");
		ContadorNumeros hilo5 = new ContadorNumeros(hilo4, "E");
		ContadorNumeros hilo6 = new ContadorNumeros(hilo5, "F");
		ContadorNumeros hilo7 = new ContadorNumeros(hilo6, "G");
		ContadorNumeros hilo8 = new ContadorNumeros(hilo7, "H");
		ContadorNumeros hilo9 = new ContadorNumeros(hilo8, "I");
		
		
		hilo9.start();
		hilo8.start();
		hilo7.start();
		hilo6.start();
		hilo5.start();
		hilo4.start();
		hilo3.start();
		hilo2.start();
		hilo1.start();
		
		System.out.println("final de la aplicación");
		
	}

}


class  ContadorNumeros extends Thread {
	
	// Recibe el hilo que se va a tomar como referencia para sincronizar
	public ContadorNumeros(Thread hiloTareaAnterior, String caracter) {
		
		this.hiloTareaAnterior = hiloTareaAnterior;
		this.caracter = caracter;
	}
	
public ContadorNumeros(String caracter) {
		this.caracter = caracter;
	}
	
	@Override
	public void run() {
		
		/*
		 * Lo que hara esque  la tarea de este hilo,  se realizara despues de que finalize 
		 * la tarea del hilo que se le pasa por parametro al constructor 
		 */
		
		try {
			
			if (hiloTareaAnterior !=null)
				hiloTareaAnterior.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			System.out.println(getName() + " Caracter: " + caracter);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	
	private Thread hiloTareaAnterior;
	
	private String caracter;
}

