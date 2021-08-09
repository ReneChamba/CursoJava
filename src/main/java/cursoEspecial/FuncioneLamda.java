package cursoEspecial;

import java.util.Arrays;
import java.util.List;

public class FuncioneLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> lista = Arrays.asList(18,21,3,4,51,6,7,8,9,10);
		
		// Imprimi lista 
		lista.forEach( x -> System.out.print( " " +x));
		
		System.out.println();
		
		lista.forEach( (x) -> {
			// Validar
			if (x>5) System.out.print( " " +x );
		} );
		
		/*
		// Interfaz Comparator | tambien hay le interfaz Comparable
		 * Ordenar lista utilizando intefaz Comparator , implementando una clase anonima
		lista.sort( new Comparator<Integer>() {

			// Clase anonima
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return  o1.compareTo(o2);
			}
			
			
		});
		*/
		
		// Ordenar utilizando intefaz Comparator pero con una expresion lambda
		
		System.out.println();
		
		// 
		//lista.sort( (Integer  v1, Integer v2) -> v1.compareTo(v2) );
		
		//  S puede omitir el tipo de dato de los parametros, Java implicitamente  
		// sabra  que son Integer los parametros , esto es porque la  lista esta especificada con Integer)
		lista.sort( (v1, v2) -> v1.compareTo(v2) );
		
		
		
		
		
		// Imprimi lista 
		lista.forEach( x -> System.out.print( " " +x));
		
		

	}

}
