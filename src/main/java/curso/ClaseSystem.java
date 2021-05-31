package curso;

public class ClaseSystem {

	/*
	 * Clase System: 
	 * Es una clase final
	 * No puede instanciar(No objetos)
	 * Todos sus metodos son static(obvio ya que no se pude instanciar)
	 * 
	 * Metodos:
	 *	currentTimeMillis(); 
	 * 
	 *  	Metodo devuelve un valor tipo log, indica la hora actual en milisegundos(Osea la
	 *      hora de cuando lee la linea que invoca al metodo currentTimeMillis())
	 *
	 *
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClaseSystem.usarCurrentTimeMillis();
	}
	
	public static void usarCurrentTimeMillis() {
		
		// Obtener la hora de inicio(hora actual cuando leer esta linea)
		long tiempoInicio = System.currentTimeMillis();
		 System.out.println( "Tiempo inicio: "+  tiempoInicio);
		 
		/*try {
			
			  Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		 long tiempoFinal = System.currentTimeMillis();
		 System.out.println( "Tiempo inicio: "+  tiempoFinal);
		 
		 // Obtener el tiempo en segundos que ah trascuerrido entre 
		 // entre bloque de codigo( divido entre 1000 para tranforma los milisegundos a segundos)
		 long tiempoResultado = (tiempoFinal -  tiempoInicio)/1000;
		 System.out.println("Resultado: " + tiempoResultado);
	}

}
