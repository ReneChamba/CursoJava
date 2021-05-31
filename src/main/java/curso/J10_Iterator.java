package curso;

import java.util.ArrayList;
import java.util.Iterator;

public class J10_Iterator {

	/*
	 * 	Iterator<E> es un interfaz 
	 * Metetodos:
	 * hasNext() -> boolean
	 * next() -> E
	 * remove() ->void
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Boolean> listaEstados  = new ArrayList<Boolean>();
		listaEstados.add(true);
		listaEstados.add(true);
		listaEstados.add(false);
		listaEstados.add(true);
		listaEstados.add(false);
		
		// Obtener el iterator de la lista
		Iterator<Boolean> iteradorBool = listaEstados.iterator();
		
		
		while(iteradorBool.hasNext()){
			
			// Obtener el elemento
			Boolean temp = iteradorBool.next();
			System.out.println(temp);
			
			// Elimina el item actual(item que se trajo con next())
			if (!temp) iteradorBool.remove();
			
			
			
		}
		
		System.out.println("NUevos Elementos");
		listaEstados.forEach(x  -> System.out.println(x));
	}

}
