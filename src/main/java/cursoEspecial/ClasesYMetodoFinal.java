package cursoEspecial;

public class ClasesYMetodoFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * CLASES FINAL Y METODOS FINAL
		 * 
		 * 1)Una clase puede ser declarada final si su definici�n est� completa y no se desean o requieren sub clases.
		 * 
		 * 2) Una clase final es simplemente una clase que no puede ser heredada.(no tiene sublclases)
		 * 
		 *  METODOS FINAL
		 *  
		 * 1) Son aquellos metodos que no podran sobreescribirse en las subclases, estos metodos si podran llamarse | invocarse
		 *   // para ser utilizados ,pero no podran cambiar su comportamiento(x eso se dice que no puede sobreescribirse) 
		 * 
		 * 
		 */

	}

}

class  Mamiferos {
	
	private String nombre;
	private String habitad;
	
	public Mamiferos(String nombre, String habitad) {
		super();
		this.nombre = nombre;
		this.habitad = habitad;
	}
	public Mamiferos() {}
	
	// Metodo final, no podra ser sobrrescito por las subclase, 
	public final String getNombre() {
		return nombre;
	}
	

}

//Definimos la clase Gato como final, quiere decir que ninguna clase 
// podra heredar de Gato.

final class Gato extends Mamiferos{

	public Gato(String nombre, String habitad) {
		super(nombre,habitad);
		
	}
	
	public Gato() {}
	
	public void imprimirDatos() {
		
		// getNombre() es un metodo definido como final en la clase padre( Mamiferos) , x ende, en la clase Gato no podra
		// existir un metodo llamda igual a getNombre(), la subclases , no podra
		// sobreescriir dicho metodo, si podran llamarlo/invocarlo.
		System.out.println( super.getNombre());
	}
	
}

/* 
 * Esto no se puede hacer, ya que la clase Gato es final, x ende 'frodito'  no puede heredar de ella.
 * 
class frodito extends Gato{
	
}
*/

