package curso;

import java.util.ArrayList;

public class J9_ProgramacionGenericaArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Los arrayList solo permite alamacenar objetos, No datos primitivos(Se debe utilizar las Clase Wrapper del tipo primitivo)
		 * 
		 * Los arrayList ya tiene sobreescrito su metodo toString()
		 */
		
		// Crea una lista con la capacidad inicial para 10 elementos
		ArrayList<String> lista = new ArrayList<String>(20);
		
		// Define la capacidad del arrayList, pero puede crecer
		///lista.ensureCapacity(13);
		lista.add("Ronny");
		lista.add("Rene");
		lista.add("Chamba");
		lista.add("Chamba");
		lista.add("Loqui");
		lista.add("Duque");
	
		
		System.out.println("------------ Listando valores -----------------------");
		lista.forEach(x -> System.out.println(x));
		
		//lista.trimToSize() ; // corta la memoria sin usar del arrayList 
		
		
		System.out.println("------------------ ---------------");
		// Reemplazar un elemento en una pos especifica, el elemento donde  establece Jandry, sera reemplazado.
		lista.set(1, "Jandry");
		lista.forEach(x -> System.out.println(x));
	}

}


