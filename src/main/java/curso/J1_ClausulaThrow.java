package curso;

public class J1_ClausulaThrow {


	/*
	 * Clausula throw permite lanzar un exepcion en aluna parte del
	 * codigo, tener claro que, cuando se lee la linea donde lanzamos
	 * la exepcion, inmediatamente se saldra de la funcion
	 * 
	 * No confundir la clausula throw con throws(se ubica en la firma del metodo).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int resultado = J1_ClausulaThrow.sumar(10, 5);
		System.out.println("La suma es : " +  resultado);
		
		
	try {
	 	    // TODO: handle exception
			int resultado2 = J1_ClausulaThrow.sumar(0, 5);
			System.out.println("La suma es : " +  resultado2);
			
		} catch (Exception e) {
			
			System.out.println("Error : " +  e);
		}
			
	}

	
	
	
	/*
	 * Lanza una excepcion Unckequed(No es obligatorio tratarla)
	 */
	public static int sumar(int numero, int numero2)  throws IllegalArgumentException{
		
		int resultado = numero +  numero2;
		
		if(resultado>=7)
			return resultado;
		
		/*
		 * Lanzar una excepcion, aunque el tipo  excepcion que se lanza no tiene coerencia.
		 * 
		 * Se deberia crear nuestras propias excepciones
		 */
		throw new IllegalArgumentException("Perdio el año"); 
	
	}
	
	
	
}
	
	




