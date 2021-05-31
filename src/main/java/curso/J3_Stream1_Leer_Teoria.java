package curso;

import java.io.File;
import java.io.FileReader;

/*
 * - Los Stream (Secuencias) o tambien llamados flujo de datos
 * 
 * Utilizados para enviar informacion desde java hacia un sitio remoto en la red.
 * Ademas nos permiten leer ficheros externos o para escribir archivos.
 * 
 * - Como abordar los streams en java
 * 
 *   Se puede abordar los streams como 'flujo de bytes' o 'flujo de caracteres',
 *   esto quere decir que, cuando deseamos escribir o leer un archivo lo podemos
 *   hacer como flujo de bytes o flujo de caracteres   
 * 
 * 	- Flujo de bytes: Cuando lo unico que se desea es enviar informacion 
 *  - Flujo de caracteres:  Cuando deseamos nosotros leer/esribir la informacion 
 * 
 *  
 *  -Para flujo de bytes:
 *  
 *  InputSteam: para leer la informacion de bytes de un archivo
 *  OutputStream: Para escribir informacion en byte
 *  
 *  - Para Flujo de caracteres
 *  
 *  Reader - Para leer la informacion de caracteres
 *  Writer - Para escribiir informacion de caracteres
 *  
 *  
 *  Las clases antes mencionadas pertenecen al paquete java.io, y son clases
 *  abstractas, por lo general se suele utilizar clases que hereden de una de 
 *  ellas.
 *  
 *  
 */


public class J3_Stream1_Leer_Teoria {

	public static void main(String ...rene) {
		
		
		Leer   obj1 = new Leer();
		
		try {
			
			obj1.leerEjemplo1();
			System.out.println("----------------------------");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName());
			e.printStackTrace();
		}
		
	}
	
}
class Leer{
	
	
	public void leerEjemplo1() throws Exception {
		
		
		// Crear un archivo File
		File archivo = new File("R:\\RONNY\\PruebaTexto.txt");
		
		// Leer un archivo
		FileReader fileArhico = new FileReader(archivo);
		
		int codigo = 0;
		
		// Leer carateres: retorna el codigo de cada caracter , y -1 cuando llega al final
		while( (codigo = fileArhico.read()) !=-1  ) {
			
			// Cast el codigo de la letra a caracter
			char caracter = (char) codigo;
			
			System.out.println( "Codigo letra: " +  codigo + " Letra: " + caracter) ;
			
		}
		
		
		// Librerar recurso
		fileArhico.close();
		
		
		
		
		
	}
	
}











