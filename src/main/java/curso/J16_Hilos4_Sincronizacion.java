package curso;

public class J16_Hilos4_Sincronizacion {

	
	/*
	 * Estados de una hilo
	 * 
	 * 1: Nuevo: En cuando un hilos ha sido recien creado(osea se ah utilizado la palabra new), per todabia no se ha utilizado
	 *  el metodo star()
	 * 
	 * 2: Ejecutable: Es cuando un metodo esta en ejecucion, ya se hizo uso del metodo star()
	 * 
	 * 3: Bloqueado: Cuando un hilo es bloqueado mediante el metodo sleep()
	 * 
	 * 4: Muerto: Cuando en metodo run() finaliza su tarea normalmente, el hilo muere(finaliza), o tambien 
	 * se denominada el estado muerto de un hilo, cuando ocurre alguna excepion y no es captura, el hilo finaliza abruptamente.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// Estado nuevo del hilo
		EjemploUno hilo1 = new EjemploUno();
		
		// Estado ejecutable de hilo
		hilo1.start();
		
		try {
			
			// join()  hará que finalize el hilo1 en su totalidad(osea que muera) para que se ejecute
			// el hilo2
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// -------------------------------------------------------------------------------
		// Estado nuevo del hilo
		EjemploUno hilo2 = new EjemploUno();
		
		// Estado ejecutable de hilo
		hilo2.start();
		
		try {
			// join()  hará que finalize el hilo2 en su totalidad(osea que muera) para que se ejecute
			// las lineas del hilo del main(osea lo que esta debajo) recordan que el main es otro hilo que
			// se esta ejecutando, pero esto no es tan buena practica, porque el hilo de main estara 'bloqueado' hasta que
			// se termien las tareas, pero funciona.
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fin de la aplicación");
		
	}

}

class EjemploUno extends Thread{
	
	public EjemploUno() {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i =0;i<5;i++) {
			
			System.out.println("Nombre: " + getName() + " Valor: " + i);
			try {
				
				// Estado bloqueado del hilo
				Thread.sleep(400);
				
				// Luego de terminar los 400 mls del bloqueo del hilo
				// vuelve al estado ejecutable el hilo
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Finaliza la tarea: estado muerto de hilo
	}
}
