package cursoEspecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparaTo2 {

	/**
	 * ORDENAR UNA COLECCION: INTEFACE COMPARABLE
	 * Para ordenar elementos de una coleccion , java proporciaona varios  metodos  estaticos sort( Object []),
	 * perteneciente a la clase {@link Collections} 
	 * 
	 * Para que el metodo sort(Object []) puede ordenar los elementos , los elementos deberan implementar
	 * la interfaz Comparable, y sobreescribir su unico metodo compareTo(T)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Docentes> docentes = new ArrayList<Docentes>();
		
		docentes.add(new Docentes("Juan",10 ));
		docentes.add(new Docentes("Pedro",15 ));
		docentes.add(new Docentes("Rene",25 ));
		docentes.add(new Docentes("Pablo",20 ));
		docentes.add(new Docentes("Sanos",5 ));
		docentes.add(new Docentes("Jandry",2 ));
		
		
		// Ordenar la listaollections.sort(List)
		// nota , se debe tener ya implementado la interfaz
		// Comparable, antes de utilizar este metodo.
		Collections.sort(docentes);

		
		for (Docentes d : docentes) 
			
			System.out.println(d.toString());
	
		
		
		
	}

}

// Implementat la interfaz Comparable, '<>' no es necesarios
class Docentes implements Comparable<Object>{
	
	private String nombre;
	private int anioServicio;
	
	
	public Docentes(String nombre, int anioServicio) {
		super();
		this.nombre = nombre;
		this.anioServicio = anioServicio;
	}
	

	@Override
	public String toString() {
		return "Docentes [nombre=" + nombre + ", anioServicio=" + anioServicio + "]";
	}


	// Sobreescribir el metodo 
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		
		/* 
		 * Seleccionamos el campo a comparar, siempre se ordena de forma 
		   ascende(podemos cambiar este compartamiento)
		   
		 * Si el campo a comparar es numerico, lo ordena de mayor a menor
		 * Si el campo a comparar es texto, lo ordena de la A a la Z*/
		
		
		Docentes temp = (Docentes)o;	
		
		
		// -----------------Ordenar de Menor a mayor--------------
		if(this.anioServicio<temp.anioServicio) 
			return -1;
		if(this.anioServicio>temp.anioServicio)
			return 1;
		
		// -----------------------Ordenar de Mayor a menor--------------
		/*
		if(this.anioServicio<temp.anioServicio) 
			return 1;
		if(this.anioServicio>temp.anioServicio)
			return -1;
		*/
		
		// Si son iguales retorna 0
		return 0;
	}
	
	
}
