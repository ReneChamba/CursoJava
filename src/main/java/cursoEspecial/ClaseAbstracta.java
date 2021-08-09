package cursoEspecial;

public class ClaseAbstracta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		/*
		 * Clase Abstracta:
		 * 
		 * - DEFINICIONES Y TERMINOS
		 * 
		 * 1) Es una clase Padre, donde unicamente coloca   mos la estructura de una asbtraccion, una estructura
		 *    muy general, dejando que las clases hijas sean quienes definan los detalles.
		 *    
		 * 2) Es aquella que marca un patron de dise�o en la jerarquia de la herencia.
		 * 
		 * 3) Tienen poca funcionalidad y son menos especializadas, x eso se dice que es una clase muy general
		 * 
		 * 3) Por lo general se ubican en el nivel superior de la jerarquia de la herencia.
		 * 
		 * 4) Se las conoce como 'resumenes' en castellano.
		 * 
		 *  
		 *  - CARACTERISTICAS
		 *  
		 *  1) Puede tener atributos , metodos, contructor,ect(es como cualquier clase convencional de las que conocemos).
		 *  
		 *  2) No se pueden declarar constructores abstractos, o m�todos est�ticos abstractos.
		 *  
		 *  3) Puede poseer o no poseer n metodos abstractos.
		 *  
		 *  4) No puede ser instanciada (No puede crearse objetos de esa clase, No se puede hacer uso de new )
		 *  
		 *  5) Una clase abstracta solo se puede heredar.
		 *  
		 *  6) Aunque no se pueden crear instancias de las clases abstractas, s� que se pueden utilizar para 
		 *     crear referencias a objetos, ya que el polimorfismo de Java durante el tiempo de ejecuci�n se 
		 *    implementa mediante la referencia a las superclases.
		 *  
		 *  7) Una clase que tenga definido almenos un metodo abstracto,  obligatoriamente tendr� que
		 *     convertirse en una clase asbtracta.
		 *  
		 *  8) Una clase definida como abstracta, puede tener o no tener metodos abstractos definidos.
		 *  
		 *  - METODOS ABSTRACTOS
		 *  
		 *  1) No tienen cuerpo,(no van las llaves).
		 *  2) Definen que hacer, pero no como hacerlo(por eso no tiene cuerpo).
		 *  3) Solo pueden existir dentro de una clase Abstracta
		 *  4) Estos metodos tendra que ser implementados obligatoriamente en las subclases.
		 *  5) Un metodo abstracto, es un metodo que nunca va ser ejecutado porque no tiene cuerpo,
		 *     simplemente, un metodo abstracto referencia a otros metodos de  las subclases.
		 *     
		 *  - QUE IMPLICA HEREDAR DE UNA CLASE ASBTRACTA ?
		 * 
		 *    1) Toda clase que herede directamente de una clase Abstracta (sea hija directa), esta obligada a implementar todos
		 *      los metodos abstractos de esa clase, o bien declararse tambi�n como abstracta la clase. 
		 *     
		 *      
		 *     Ejemplo : Cuando es obligatorio implementar los metodos abstractos?
		 *    
		 *   � Una clase  'C' que herede de una clase 'B', y a su vez la clase 'B' herede de una clase abstracta 'A',
		 *     la clase 'C' no esta obligada a implementar el metodo abstracto, esto se debe a que su clase padre 'B'
		 *     no es una clase Abstracta, pero 'B' que hereda la clase Abstracta 'A', si tuvo que implementar los metodos
		 *     abstractos de 'A', entonces, ahora 'C' ya tiene ese metodo (lo hereda de 'B'), y puede sobreescribir dicho
		 *     metodo.
		 *     
		 *     Importante entener que implementar y sobreescrbir  metodos, tiene una leve diferencia
		 *     
		 *     - En la estructura o firma del metodo son iguales
		 *     - Implememtar: Una clase esta obligada a implementar ese metodo
		 *     - sobreescribir: Una clase NO esta obligada a implementar el metodo, si desea lo implememta o no. 
		 *      
		 *    
		 *    - Definici�n
		 *     public abstract class NombreClase{
		 *      		
		 *      	 - atributos
		 *           - contructores
		 *           - metodos normales
		 *      	
		 *      	public asbtract tipoRetorono soyUnMetodoAbstracto();
		 *      	public asbtract String soyUnOtroAbstracto();
		 *      
		 * 
		 *      }
		 *      
		 *  - COMO DETERMINAR SI UNA CLASE PUEDE SER O NO ABSTRACTA?    
		 *      
		 *     Supongamos que tenemos una clase Empleado, ademas tenemos dos clases que heredan de Empleado,
		 *     la clase Cajero y la clase Gerente, y que segun nuestro contexto, todo Empleado haya de ser
		 *     o biene Cajero o bien Gerente, es decir, no vallan a existir instancias(objetos) de la clase
		 *     Empleado, entonces, �Que sentido tendra tener una clase Empleado?.
		 *      
		 *     Entonces, Una clase de la que no se tenga intenci�n de crear instancias, si no que, unicamente
		 *     sirva para unificar datos u operaciones de subclases, esta clase puede declararse como Abstracta.
		 */
		
		
		
		Empleado emp = new Empleado("Ronny", 100, "EM1");
		
		System.out.println(emp.dameDescripcion());
		
		Gerente ger = new Gerente("Francisco", 300, "GE1", 10);
		System.out.println(ger.dameDescripcion());

		
	}
	
}

abstract class Persona {
	
	
	private String nombre;
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	// Metodo normal
	public String getNombre() {
		return nombre;
	}
	
	// Solo se define el metodo abstracto, no tiene cuerpo
	public abstract String dameDescripcion();
	
	
}


/**
 * La clase Empleado como hereda de Persona(clase abstract) esta obligada 
 * a implemntar los metodos abstractos de Persona.
 * 
 * Pero si la clase Empleado tambien fuera asbtract, NO esta obligada a 
 * implementar los metodos abstractos de Persona.(Ya probe este comportamiento)
 */
class Empleado  extends Persona{

	// Atributos propios de la clase Empleado
	private double sueldo;
	private String codEmpleado;
	
	public Empleado(String nombre, double sueldo, String codEmpleado) {
		
		// invocar al costructor de la clase padre (Persona) e inicializar sus atributos  
		super(nombre);
		
		this.sueldo = sueldo;
		this.codEmpleado = codEmpleado;
		
	}
	
	// Implementacon Oblgatoria de metodo abracto de Persona, 
	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return  "Hola soy un empleado normal ";
	}
	
	
}



class Gerente extends Empleado{
	
	private double comisiones;
	
	public Gerente (String nombre, double sueldo, String codEmpleado, double comisiones ) {
		
		// invocar al costructor de la clase padre (Empleado) e inicializar sus atributos  
		super(nombre, sueldo, codEmpleado);
		
	}

	public double getComisiones() {
		return comisiones;
	}
	
	/*
	 * La clase Gerente hereda el metodo abstacto que fue implementado en Empleado , 
	 * osea no es obligaotio implementar dicho metodo en Gerente, xq Gerente ya lo heredo atravez de Empleado,
	 * es decir, si desea Gerente lo sobreescribe o no ah dicho metodo.
	 * 
	 * Si Gerente no sobreescribe el metodo heredado a travez de Empleado, tendremos como resultado
	 *  el valor que se establecio cuando se implemento dicho metodo en Empleado
	 * 
	 */
	
	// Sobreescribiendo metodo , NO ES obligaotio su implemeancion
	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		
		return "Soy un gerente";
	}
	
	
}

