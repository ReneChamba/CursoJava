package curso;

public class J12_MetodoGenerico {

	
	/*
	 * Un metodo generico puede estar en una clase Generica o que no sea.
	 * Para espeficiar que el metodo es generico, ubicar <T> 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombres [] = {"Ronny", "Rene", "Santos", "Adrian"};
		System.out.println(MisMatrices.getElementos(nombres));
		
		
		Persona [] personas  = new Persona[4];
		personas[0] = new Persona("Ronny", "Chamba", 23);
		personas[1] = new Persona("Adrian", "Gonzales", 30);
		personas[2] = new Persona("Viviana", "Chavez", 10);
		personas[3] = new Persona("Jandry", "Gavilanes", 2);
		System.out.println(MisMatrices.getElementos(personas));
		
	
		// Obtener el elemento menor
		System.out.println(MisMatrices.esMenor(nombres));
		
		// La clase Persona debererá implementar Interfaz Comparable para 
		// utilizar el metodo esMeno(dd)
		//System.out.println(MisMatrices.esMenor(personas));
		
		
		
		
	}

}


class MisMatrices{
	
	
	// Metodo generico de devuelve un String
	public static <T> String getElementos(T[] arreglo) {
		
		return "El array tiene " + arreglo.length;
	
	}
	
	
	
	/* 
	 * Metodo generico que devuelve un valor generico, 
	 * Con <extends Comparable>, establecemos que los objetos que se le pasen por parametros 
	 * estan obligados a implemetar la interfaz Comparable, esto es asi, SOLO porque en la logica
	 * estamos utilizando el metodo compareTo  que pertenece a Comparable.
	 * Hay varias clases de java que ya implementan a Comparable , asi que no habrá problemas, pero
	 * para nuestras clases propias debemos implementar Comparable.
	 * 
	*/
	public static <T extends Comparable<T>>  T esMenor(T[] arreglo) {
			
		
		// Obtengo el primero elemento para empesar a comparar
		T elementoMenor = arreglo[0];
		
		for(int i = 1; i<arreglo.length;i++) {
			
			
			if (elementoMenor.compareTo(arreglo[i]) >0 ) {
				
				elementoMenor = arreglo[i];
			}
		}
			
		
		
		return  elementoMenor;
		
		}
		
	
	
	
	
	
}
