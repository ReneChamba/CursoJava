package curso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class J7_Serializable1 {

	/*
	 * Serializacion: Transfiriendo archivos
	 * 
	 * La serializacion, consiste en convertir un objeto en una sucesion de bytes, con el objetivo
	 * de poder almacenar ese objeto en un medio de almacenaniemnto.
	 * 
	 * Se debe implementar la interfaz Serializable a la clase que desea serializar objetos
	 * 
	 * Tener claro que lo que se serializará son los objetos de una clase.
	 * 
	 * Clases utilizadas:
	 * 
	 * ObjectOutputStream : Crea un flujo de datos mediante el cual 
	 * permite trasferi un objeto desde java hacia un medio de almacenamiento externo
	 *  Metodo: writeObject()
	 * 
	 * ObjectInputStream : Crea un flujo de datos mediante el cual 
	 * permite trasferi un objeto desde fuera (un medio de almacenamiento externo) haci java (restaurar esa sucesion de bytes)
	 * Metodo: readObject()
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona person1 =  new Persona("Ronny", "Chamba", 23);
		Persona person2 =  new Persona("Rene", "Pullaguari", 25);
		Persona person3 =  new Persona("Viviana", "Loor", 33);
		
		Persona[] listaPersona =  {person1, person2, person3};

		
		
		try {
			
			
			// -------------------- ESCRIBIR FICHERO -----------------------------
			File file = new File("R:\\RONNY\\objeSerializable.txt");
			
			
			FileOutputStream filaOut = new FileOutputStream(file);
			
			// Crear un flujo de datos para escribir , flujo de salida
			 ObjectOutputStream escribiendoFichero = new ObjectOutputStream(filaOut);
			 
			 // Especificar el objeto que se desea serializable
			 escribiendoFichero.writeObject(listaPersona);
			 
			 escribiendoFichero.close();
			
			 
			 
			 // ....................... Leer fichero -----------------------
			 
			 
			File fileLeer = new File("R:\\RONNY\\objeSerializable.txt");
				
			
			FileInputStream fileInput = new FileInputStream(fileLeer);
			
			// Crear un flujo de datos para leer, flujo de entrada
			ObjectInputStream recuperandoFichero = new ObjectInputStream(fileInput);
				 
			
			// Recupear el fichero , tener en cuenta que tipo de objeto se esta recuperando para hacer el casting
			Persona [] personasRecuperadas =  (Persona[]) recuperandoFichero.readObject();
			 
			// Cerrar flujo de datos
			recuperandoFichero.close();
			
			
			
			for (Persona persona: personasRecuperadas) {
				
				
				System.out.println(persona);
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		
			System.out.println("Error: " + e.getClass());
		}
	}

}








