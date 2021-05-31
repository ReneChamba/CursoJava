package curso;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lista de string
		List<String> numeroTexto = Arrays.asList("1", "2", "3", "44", "45","65", "13","65", "15","12","12", ".", "A");
		
		numeroTexto.forEach( x ->{
			System.out.println("Valor: " + x + " Tipo clase: "  + x.getClass().getName());
		});
		
		System.out.println("FITRO ");
	    // Filtrar string diferente al "3"
		numeroTexto.stream()
						   .filter( x -> !x.contains("3"))
						   .forEach( x -> System.out.println(x));
		
		// Covertir lista de String  a una Lista de enteros
		List<Integer> numeroEnteros = numeroTexto.stream()
														 .filter( x -> x.matches("[0-9]+"))
														 .map(Integer::parseInt)
														 .collect(Collectors.toList());
														 
			
		System.out.println("FITRO ENTERO ");
		numeroEnteros.stream().forEach( x  ->{
			System.out.println("Valor: " + x + " Tipo clase: "  + x.getClass().getName());
		});
		
		
		// Contar cuantos valores pasan un filtro dado, numeros > 5
		int cantidadMayores = (int) numeroEnteros.stream()
													.filter( x -> x>5)
													.count();
										
		System.out.println("numero mayores a cinco: " +  cantidadMayores);
		
		

		System.out.println("VERIFICAR SI TODOS LOS ELEMENTOS DE UN SECUENCIA CUMPLEN UN PATRO DADO");
		
		boolean todoNumero = numeroTexto.stream()
												.allMatch( x -> x.matches("[0-9]+"));
		System.out.println("tODOS NUMERO? " +  todoNumero);
		
		// Verifica sí almenos un elemento cumple un patron dado
		boolean AlmenosNumero = numeroTexto.stream()
												.anyMatch( x -> x.matches("[0-9]+"));
		System.out.println("Almenos un  NUMERO? " +  AlmenosNumero);
		
		
		// Filtrar solo item que sean numero y que no sean repetidos
		System.out.println("\nUSO DE DISTINC");
		numeroTexto.stream()
						   .filter( x -> x.matches("[0-9]+"))
						   .distinct()
						   .forEach( x -> System.out.println(x));
		
		
		// peek permite consumir el item que se esta iterando y ademas devuelve el strem
		List<Integer> datoNuevo = numeroEnteros.stream()
							.peek(x  -> System.out.println(x))
							.collect(Collectors.toList());
		
		
		
		
		
		
		
	}

}
