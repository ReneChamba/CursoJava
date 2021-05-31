package curso;

import java.util.ArrayList;
import java.util.List;

public class J14_Hilos2 implements Runnable {

	
	/*
	 * Practica de consola con hilos
	 */
	
	/*
	 * 	
	 * Algunos metodos de la clase Thread para las interrupciones
	 * 
	 * void interrup() solicita la interrupcion de un hilo 
	 * boolean isInterrupted():  verifica si este hilo esta detenido o no, se aplica a una instancia en concreto
	 * static boolean interrupted() verifica si un hilo cualquiera hilo, al hilo actual
	 * stop() : metodo acutualmente obsoleto, utilizado para interrumpir un hilo
	 *
	 * 
	 * Notas:
	 * No se puede solicitar la interrupcion de un hilo, cuando el hilo esta pausado(sleep()), osea se esta utilizando 
	 * el metodo sleep(), lanzara un excepcion si se intenta hacer aquello.
	 * 
	 * Cuando se utiliza el metodo Thread.sleep(), lo que sucede esque el hilo se bloquea y no es posible solicitar su 
	 * interrupción, si aún así se solicita la interrupción, es en ese momento que el metodo sleep() lanza una excepcion
	 * de tipo InterruptedException 
	 * 
	 */
	 
	private boolean selectOperacion;
	public J14_Hilos2(boolean selectOperacion){
		
		this.selectOperacion = selectOperacion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = new J14_Hilos2(true);
		Thread hilo = new Thread(runnable);
		
		Runnable runnable2 = new J14_Hilos2(false);
		Thread hilo2 = new Thread(runnable2);
		
		
	
		// star() : Llama el metodo run
		hilo2.start();
		hilo.start();
		
	
	}
	
	
	
	
	public void mostrar() {
		
		System.out.println("holaaa");
	}
	
	public List<Persona> getListaPersonas() {
		
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Ronny", "Chamba", 67));
		personas.add(new Persona("Rene", "Ordoñes", 44));
		/*personas.add(new Persona("Juan", "Gavilanez", 38));
		personas.add(new Persona("Mayra", "Pullaguari", 30));
		personas.add(new Persona("Viviana", "Santos", 18));
		personas.add(new Persona("Maria", "Villafuerte", 48));
		personas.add(new Persona("Dayana", "Gonzales", 24));
		personas.add(new Persona("Melanie", "Garcia", 22));
		*/
		return personas;
			
	}


    public void saludar() {
    	System.out.println("Buenos dias jjeje");
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		

		for (int i=1;i<=10;i++) {
			
			
			System.out.println("Hilo: " + i);
			 
					
		}
		
		
		
		
	}

}
