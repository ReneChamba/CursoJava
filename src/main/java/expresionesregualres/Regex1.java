package expresionesregualres;

public class Regex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Resultado un numero(0): " + Expresiones.valUnNumero("0"));
		System.out.println("Resultado un numero(Cualquier numero +): " + Expresiones.valSoloDigitoPositivo("9"));
		System.out.println("Resultado un numero(Cualquier numero + || -): " + Expresiones.valSoloDigitoNatural("1"));
		
		System.out.println("Ejemplo 1: " + Expresiones.valEjemplo1("1235454787433545458"));
		System.out.println("Ejemplo 1: " + Expresiones.valEjemplo1("1235743B"));
		
		System.out.println("\nEjemplo 2: " + Expresiones.valEjemplo2("9632563201"));
		System.out.println("Ejemplo 2: " + Expresiones.valEjemplo2("963256323"));
		System.out.println("Ejemplo 2: " + Expresiones.valEjemplo2("963256323d"));
		
		System.out.println("\nEjemplo 3: " + Expresiones.valEjemplo3("2021/12/15"));
		System.out.println("Ejemplo 3: " + Expresiones.valEjemplo3("2021-1-12"));
		System.out.println("Ejemplo 3: " + Expresiones.valEjemplo3("2021/02/1"));
		
		System.out.println("\nEjemplo 3: " + Expresiones.valEjemplo3("202/12/15"));
		System.out.println("Ejemplo 3: " + Expresiones.valEjemplo3("2021/123/1"));
		System.out.println("Ejemplo 3: " + Expresiones.valEjemplo3("2021/0/122"));
		System.out.println("Ejemplo 3: " + Expresiones.valEjemplo3("2021*01/12"));
		
		System.out.println("\nEjemplo 4: " + Expresiones.valEjemplo4("Ronny Rene Chamba pUllAGUrI" ));

	}

}


class Expresiones{
	
	
	
	
	public static boolean valUnNumero(String cedula) {
		
		return cedula.matches("0");
		
	}
	public static boolean valSoloDigitoPositivo(String cedula) {
		
		/*
		 * Patron que admite solo un numero entero positivo
		 */
		return cedula.matches("[0-9]");
		
	}
	public static boolean valSoloDigitoNatural(String cedula) {
		
		/*
		 * Patron que admite solo un numero entero positivo o negativo
		 * -? : indica que es opcional
		 */
		return cedula.matches("-?[0-9]");
		
	}
	public static boolean valEjemplo1(String cedula) {
		
		/*
		 * Patron que admite n cantidad numeros  enteros o negaitvo
		 * -? : indica que es opcional
		 * +: indica  una o más veces 
		 */
		return cedula.matches("-?[0-9]+");
		
	}
	public static boolean valEjemplo2(String cedula) {
		
		/*
		 * Patron que admite 10 digitos  numricos
		 * {10} indica 10 digitos exactemente
		 * {1,10} indica 1 vez ó maximo 10
		 * {1,} indica almenos 1 ó hasta n
		 */
		return cedula.matches("[0-9]{10}");
		
	}
	
	public static boolean valEjemplo3(String dato) {
		
		/*
		 * Patron que admite 10 digitos  numricos
		 * {10} indica 10 digitos exactemente
		 * {1,10} indica 1 vez ó  maximo 10
		 * {1,} indica almenos 1 ó hasta n
		 */
		
		// 2021/12/13
		// 2021/1/13
		// 2021/12/8
		
		//return dato.matches("^[0-9]{4}/[0-9]{1,2}/[0-9]{1,2}$"); // admite solo el separador /
		return dato.matches("^[0-9]{4}(/|-)[0-9]{1,2}(/|-)[0-9]{1,2}$"); // admite los separdores  / or -
		
	}
	
	public static boolean valEjemplo4(String dato) {
			/*
			 * validar un nombre
			 * 
			 * ronny
			 * ronny rene 
			 * ronny rene chamba
			 * ronny rene chamba pullaguari
			 * 
			 */
			
		//( Admite n letras, seguido opcionalmente de 0 ó n espacios en blanco(\\s)) y todo eso se repite desde 1 a n veces
		return dato.matches("^([a-zA-Z]+\\s{0,})+$");
	
	}

	
	
	
}