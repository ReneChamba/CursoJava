package cursoEspecial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class ApiStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Interfaz Stream : posse varios metodos que permiten operaar sobre los elementos de una coleccion
		 * Predicado : Es un intefaz funcional, por lo cual podemos utlizar una fucniona lambda
		 * 
		 * Tener en cuenta que retorna cada una de los metodos de stream() segun su retorno se puede seguir
		 * operando esa coleccion.
		 * 
		 * Ejem
		 * 	lista
		 *       .stream()
		 *       .filter(predicado) -- esto devulve una coleccion strem(), x ende puedo segui operando
		 * 		 .foreach() ....
		 * 
		 *  lista
		 *  	.stream()
		 *       .allMatch(); --> esto devuelve un booleano , x ende ya no puede seguir operando(concatendando) mas funciones
		 * 
		 */
		List<Integer> lista = Arrays.asList(18,21,3,4,51,6,7,8,9,10);
		
		
		
		
		// ------------------- Imprimir todos los elementos de la lista --------------
		
		// Utilizando strem(como no voy a operar sobre ningun elemento de la coleccion,  
		// no tiene mucho sentido el stresm()  aqui)
		lista
			.stream()
			.forEach( (x) -> System.out.print( " " +x));
		System.out.println();
		
		// Imprimir directamente
		lista.forEach( x -> System.err.print( " " +x));
		
		// ------------------- Imprimir  solo los numeros mayores o iguale a 5
		System.out.println();
		lista
			.stream()
			.filter( x -> x >=5)
			.forEach(x -> System.out.print(" " +x));
		
		// ------------------- Imprimir  solo los numeros mayores o iguale a 5, ordenados inversamente
		System.out.println();
		lista
			.stream()
			.filter( x -> x >=5)
			.sorted( ( n1, n2) -> -(n1.compareTo(n2)))
			.forEach(x -> System.out.print( " "+x));
			
		
		// -----------------Verificar si todos los elementos de una coleccion cumplen con un predicado
		
		System.out.println();
		boolean estado = lista
			.stream()
			.allMatch( x -> x>10);
		
		System.out.println("Valor :" + estado);
		
		// ---------------Verificar si almenos un elemento de una coleccion cumplen con un predicado
		
		boolean estado2 = lista
							   .stream()
							   .anyMatch( x -> x !=100);
		
		System.out.println("Valor 2 :" + estado2);
		
		
		// ------------------- Cuantos elementos hay en la lista
		long cantNum = lista
						  .stream()
						  .count();
		
		System.out.println("Longitud lista: " +  cantNum);
		
		// -------------Cuantos elementos hay mayor a 11
		
		int numFitler = (int) lista
								.stream()
								.filter( x -> x>11)
								.count();
								 
		System.out.println("Longitud lista mayor >11: " +  numFitler);
		
		// --------------- Sumar los elementos --------------
		
		int suma = lista
						.stream()
						.mapToInt( x -> x++ )
						.sum();
		System.out.println("Suma de valores: " +  suma);
		
		// ------------ Sumo los elemtos  que sean menor a 10 y sumo uno a esos elemtos
		System.out.println(lista);
		int  sumaDos = lista
						.stream()
						.filter(x -> x<10)
						.mapToInt( x  -> x )
						.sum();
		System.out.println("Suma de valores menores a 10 : " +  sumaDos);
	
		
		
		
	}

}
