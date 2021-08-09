package cursoEspecial;

import java.util.Arrays;

public class ComparateTo {

	/**
	 * ORDENAR UN ARREGLO: INTEFACE COMPARABLE
	 * Para ordenar elementos de una array , java proporciaona varios  metodos  estaticos sort( Object []),
	 * perteneciente a la clase {@link Arrays} que se encuenta en el paqeute java.lang
	 * 
	 * Para que el metodo sort(Object []) puede ordenar los elementos , los elementos deberan implementar
	 * la interfaz Comparable, y sobreescribir su unico metodo compareTo(T)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elefante [] misElefa = new Elefante[5];
		misElefa[0] = new Elefante(69, "Mario");
		misElefa[1] = new Elefante(20, "Pedro");
		misElefa[2] = new Elefante(15, "Juan");
		misElefa[3] = new Elefante(10, "Julio");
		misElefa[4] = new Elefante(2, "Sebastian");
		
		
	
		
		for(Elefante e : misElefa)
			System.out.println(e.toString());
		
		System.out.println("--------------------------");
		
		// Ordenar el arreglo 
		Arrays.sort(misElefa);
		
		for(Elefante e : misElefa)
			System.out.println(e.toString());
		
	}

}


// Implementamos la intefaz Comparable
class Elefante  implements Comparable{
	
	private int edad;
	private String nombre;
	
	public Elefante(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}

	// Implementamos el metodo de la interfaz Comparable
	
	
	@Override
	public int compareTo(Object o) {
		
		// Casting
		Elefante otroElefante = (Elefante) o;
		
		 // Seleccionamos el campo a comparar, siempre se ordena de forma 
		   //ascende(podemos cambiar este compartamiento)
		   
		 //* Si el campo a comparar es numerico, lo ordena de mayor a menor
		 //* Si el campo a comparar es texto, lo ordena de la A a la Z
		
		
		// -----------------Ordenar de Menor a mayor--------------
		if (this.edad<otroElefante.edad) 
			return -1;
		
		if (this.edad>otroElefante.edad) 
			return 1;
		
		/*
		// -----------------------Ordenar de Mayor a menor--------------
		
		if (this.edad<otroElefante.edad) 
			return 1;
		
		if (this.edad>otroElefante.edad) 
			return -1;
		
		 */
		// Si son iguales retorno 0	
		return 0;
	}

	 
	
	@Override
	public String toString() {
		return "Elefante [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	
	
	
}