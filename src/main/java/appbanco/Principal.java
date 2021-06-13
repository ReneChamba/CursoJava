package appbanco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco banco = new Banco(100);
		
		for (int i =0; i<100;i++) {
			
			TransferirDinero transferirDinero = new TransferirDinero(banco, i, 2000);
			Thread hilo = new Thread(transferirDinero);
			hilo.start();
		
		}
	}

}
