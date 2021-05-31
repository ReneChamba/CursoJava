package curso;

import java.io.File;
import java.io.FileWriter;

public class J4_Stream2_Escribir {

	
	public static void main(String ...rene) {
		
		try {
			
			Escribir.ejemploUno();
			Escribir.ejemploDos();
			Escribir.ejemploTres();
			Escribir.ejemploCuatro();
			System.out.println("Archivos escritos correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getClass().getName());
		}
	}
	
}

 class Escribir{
	 
	 
	 
	 public static void ejemploUno()  throws Exception{
		 
		 // Escribir sobre un archivo nuevo, si no existe el archivo, lo creará 
		 
		 String frase = "Esto es un texto escrito desde java, escribiendo un string";
		 
		 File file = new File("R:\\RONNY\\escribir.txt");
		 
		 FileWriter fileWriter = new FileWriter(file);
		 
		 // Escribe un string completo
		 fileWriter.write(frase);
		 
		 fileWriter.close();
		 
	 }
	 
	 
	 public static void ejemploDos()  throws Exception{
		 
		 // Escribir sobre un archivo nuevo, si no existe el archivo, lo creará 
		 String frase = "Texto escrito desde java, escribiendo caracter a caracter";
		 
		 File file = new File("R:\\RONNY\\escribir2.txt");
		 
		 FileWriter fileWriter = new FileWriter(file);
		 
		 
		 for (int i =0;i<frase.length();i++) {
			 
			 // Escbiendo caracter a caracter del string
			 fileWriter.write(frase.charAt(i));
		 }
		 
		
		 
		 fileWriter.close();
		 
	 }
	 
	 public static void ejemploTres()  throws Exception{
		 
		// Escribir sobre un archivo nuevo, se debe pasar un segundo argumento 'true' al constructo de FileWrite 
		 String frase = "Utilizando un archivo existe, escribiendo  en un archivo exitente";
		 
		 File file = new File("R:\\RONNY\\escribir2.txt");
		 
		 // Segundo arguemnto especifica que se escribira sobre un archivo existente
		 FileWriter fileWriter = new FileWriter(file, true);
		 
		 
		 for (int i =0;i<frase.length();i++) {
			 
			 // Escbiendo caracter a caracter del string
			 fileWriter.write(frase.charAt(i));
		 }
		 
		
		 
		 fileWriter.close();
		 
	 }
	 
	 public static void ejemploCuatro()  throws Exception{
		 
		// Escribir sobre un archivo nuevo
		 String frase = "Simplificando la escriitura, escribiendo  en un archivo exitente";
		
		 FileWriter fileWriter = new FileWriter("R:\\RONNY\\escribir3.txt");
		 
		
		 for (int i =0;i<frase.length();i++) {
			 
			 fileWriter.write(frase.charAt(i));
		 }
		 
		 fileWriter.close();
		 
	 }
	 
	 
	 
	 
	 
 }
