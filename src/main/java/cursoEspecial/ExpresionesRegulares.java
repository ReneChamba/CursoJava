package cursoEspecial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "hola,como,estas";
		String cedula = "1723774640  ";
		
		String []pedazos = cadena.split(",");
		for (String e : pedazos)
			System.out.println(e);

		
	     String str = "blanco-rojo:amarillo.verde_azul";
	     String [] cadenas = str.split("[-:._]");                                                                     
	     for(int i = 0; i<cadenas.length; i++){
	         System.out.println(cadenas[i]);                                                                          
	     }
		
		System.out.println("\n----------------------------------------\n");
		 // Crear un patron de busqueda y compilar
		 Pattern pat = Pattern.compile("^[0-9]{5,}");
	     //
		 Matcher mat = pat.matcher(cedula);
	    
		
	     if (mat.matches()) {
	    	 System.out.println("si ");
	     }else System.out.println("no");
		
		
	     System.out.println("\n---------------------------");
	     
	     System.out.println("Hola " + "Hola".contains("Hol") );
	    
	     
	}

}
