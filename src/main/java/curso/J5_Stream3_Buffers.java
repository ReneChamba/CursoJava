package curso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class J5_Stream3_Buffers {

	
	/*
	 * Los buffer, tambien llamados filtro
	 * 
	 * Los buffers permite leer o escribir de forma mas eficiente, un buffer es como una memoria interna
	 * que se coloca fisicamente intermedias entre nuestro programa de java y el archivo externo  del 
	 * que deseamos leer o escribir.
	 * 
	 * Los buffer se recomienda utilizar cuando vamos a leer o escribir bastante contenido, caso contrario, 
	 * cuando escribiremos/leeremos pocas lineas, no es tan necesario, pero de todas formas, si se puede.
	 * 
	 * - Como trabaja el buffer, de la siguente manera:
	 * Cuando deseamos leer un archivo, lo que hace es que los datos del archivo se vuelva enteramente 
	 * al buffer y se almacena integramente, entonces es nuestro programa java quien interactura con el buffer y no 
	 * con el archivo directamente.
	 * 
	 *   Lo mismo sucede cuando deseamos escribir, primero los datos a escribir de vuelcan a buffer y luego será
	 *   el buffer quien escribira en el archivo.
	 *   
	 *   Clase utilizadas:
	 *   
	 *  BufferedReader -leer  
	 *  BufferedWriter -escribir 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			UtilizarBUffer.bufferLeer();
			System.out.println("----------------------");
			UtilizarBUffer.bufferedEscribir();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " +  e.getClass().getName());
		}
	}

}

class UtilizarBUffer{
	
	
	
	public static void bufferLeer()  throws Exception{
		
		
		
		FileReader fileReader = new FileReader("R:\\RONNY\\escribir.txt");
		
		// Crear ese memoria intermedia donde se alamcenara todo la informacion del archivo a leerr
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		
		String lineaLeida="";
		
		
		
		// leer el buffer(Interactuando el buffer con nuestro programa java)
		while( (lineaLeida = bufferedReader.readLine()) !=null ) {
			
			System.out.println(lineaLeida);
		}
		
		
		
		if (bufferedReader!=null) {
			bufferedReader.close();
		}
		
		
		
	}
	
	
	public static void bufferedEscribir()  throws Exception{
		
		
		
		FileWriter fileReader = new FileWriter("R:\\RONNY\\escribiendoNuevo.txt");
		
		// Crear ese memoria intermedia donde se almacenara los datos a escribir
		BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
		
		
		
		String textoEscribir="ESto es información escrita desde java  utilizando la clase BufferedWriter ";
		
		 bufferedWriter.write(textoEscribir);
		
		 bufferedWriter.newLine();
		 bufferedWriter.write("Esto es otra linea que estamos agreando");
		 bufferedWriter.close();
		
		
		
		
		
	
		
		
		
	}
	
	
	
}
