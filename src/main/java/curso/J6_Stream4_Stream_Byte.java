package curso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.ImageIcon;

public class J6_Stream4_Stream_Byte {

	
	/*
	 * Manejo de streams como Flujo de bytes
	 * 
	 * Clases Utilizadas 
	 *  FileInputStream:  Utilizada para leer byte: metodos read() , close()
	 *  FileOutputStream :Utilizada para escribir bytes:  metodos write(), close()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			
			Ejemplo.leerByte();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error : " +  e.getClass());
		}
		
		
	}

}

class  Ejemplo {
	
	
	public static void leerByte()  throws Exception{
		
		File file = new File("R:\\RONNY\\icono\\logoVideo\\html2.jpg");
		FileInputStream archivo = new FileInputStream(file);
		
		
		// avaialable() Devuelve el numero de bytes que restante por leer, 
		// es importante utizar este metodo available()  antes de leer(read) los bytes,
		// available() devuelve el numero de bytes que estan por leer, x eso es imporaten 
		// llamarlo antes de leer, ya que de lo contrario available, retorna 0 , xq ya no hay bytes x leer
	    int numeroBytesEstimados = archivo.available();
	    
		System.out.println("NUmero de bytes: " + numeroBytesEstimados);
	   int datosEntrada[] = new int[numeroBytesEstimados];
	    
	    int i =0;
	    int contador =0;
	    // leer los byte
	    while( (i= archivo.read())  !=-1 ) {
			
	    	  // Almacenar el  byte leido  en el arreglo
	    	 datosEntrada[contador] = i;
	    	 contador++;
		}
		
	    
	    archivo.close();
	    
	    
	    // Esribir byte
	     escribirByte(datosEntrada);
	
	}
	
	
	public static void escribirByte(int datosbyte[]) throws Exception {
		
		File file = new File("R:\\RONNY\\icono\\imagenCreada.jpg");
		FileOutputStream ficheroNuevo = new FileOutputStream(file);
		
		for (int byteLeido: datosbyte) {
			
			// Escribir cada byte
			ficheroNuevo.write(byteLeido);
			
		}
		
		ficheroNuevo.close();
		
	}
	
	
	
}
