package cursoEspecial;


public class Enumerados {

/*
 * QUE SON LOS ENUM(ENUMERADOS)
 * 
 *  1) Un enumerado (o Enum) es una clase "especial" (tanto en Java como en otros lenguajes) que limitan la 
 *  creaci�n de objetos  a los especificados expl�citamente en la implementaci�n de la clase. 
 *  
 *  2) una enumeraci�n es una lista de constantes con nombre que definen un nuevo tipo de datos.
 *  
 *  3) Cada elemento(objeto) de los enum son constantes de enumeraci�n. Cada uno se declara impl�citamente como un miembro 
 *     p�blico (public) y est�tico (static).
 *   
 *  4) No puede tener metodos abstractos , solo metodos concretos(metodos normales)
 *  
 *  5) Los enum NO PUEDE definirse dentro de un metodo.
 *     
 *  4) La �nica limitaci�n que tienen los enumerados respecto a una clase normal es que si tiene constructor, 
 *     este debe de ser privado para que no se puedan crear nuevos objetos
 *  
 *  5) Es muy importante entender que un "Enum" en java es realmente una clase (cuyos objetos solo pueden ser 
 *     los definidos en esta clase) que hereda de la clase "Enum(java.lang.Enum)"  ,  por tanto los enumerados 
 *     tienen una serie de m�todos heredados de esa clase padre.
 *   
 *  6) Tener claro que los enumerado no son Strings (aunque pueden serlo), sino que son objeto de una clase 
 *    que solo son instanciables desde la clase que se implementa y que no se puede crear un objeto de esa 
 *    clase desde cualquier otro lado que no sea dentro de esa clase.
 *    
 *  5)  El objetivo principal de enum es definir nuestros propios tipos de datos (tipos de datos enumerados).
 *     
 *  4)Por convenio (aunque lo pod�is poner como quer�is) los nombres de los enumerados se escriben en may�sculas. 
 */
	
	// Creacionde un enum, implicitamente hereda de la clase enum
	public enum Familia {
		
		 // Crear elemento del enum
		 PADRE,HERMANA,SOBRINO,MADRE;
	};
	
	public static void main(String [] re) {
		
		// Acceder a los elementos(objetos)
		Familia parent = Familia.PADRE;
		
		// Imprimo el elemento(es un objeto)
		System.out.println(parent);	
		// ------------Metodo de los enumeados-----------
		
		// Devuelve(un String) el nombre de esta constante de enumeraci�n, exactamente como se declar� en su declaraci�n de enumeraci�n. 
		// Se recomienda utlizar el toString() en reemplazo de name()
		System.out.println(parent.name());
		
		// Devuelve su posici�n en su declaraci�n de enumeraci�n.
		// Donde a la constante inicial se le asigna un ordinal de cero
		System.out.println(parent.ordinal()); // 0
		
		// Devuelve la constante de enumeraci�n del tipo de enumeraci�n especificado con el nombre especificado. 
		Familia sister  = Familia.valueOf(Familia.class,"HERMANA");
		System.out.println(sister);
		
		// Devuelve la constante de enumeraci�n del tipo de enumeraci�n especificado con el nombre especificado. 
		Familia sobrino = Familia.valueOf(Familia.class, "SOBRINO");
		System.out.println(sobrino);
		
		// Resultado false, ya que estoy comparando un objeto con un String
		System.out.println(""  + parent.equals("PADRE"));
		
		// Resultado true: primero el objeto 'parent' lo convierto a String
		System.out.println("" + parent.toString().equals("PADRE"));
		
		
		/*System.out.println(parent.compareTo(Familia.PADRE));
		
		System.out.println(Familia.MADRE.compareTo(Familia.PADRE));
		*/
		
		
	}

	
}




