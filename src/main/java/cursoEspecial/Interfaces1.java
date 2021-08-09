package cursoEspecial;

public class Interfaces1 {

	
	/*
	 * INTERFACES 
	 * 
	 * 1) Una interfaz es una especie de plantilla para la construcci�n de clases. Normalmente una interfaz 
	 *    se compone de un conjunto de declaraciones de cabeceras de m�todos (sin implementar, de forma 
	 *    similar a un m�todo abstracto) que especifican un protocolo de comportamiento para una o varias clases.
	 *    
	 *    CARACTERISTICAS
	 *    
	 *    1) Todos los m�todos de una interfaz se declaran impl�citamente como abstractos y p�blicos. (se puede omitir)
	 *    2) Una interfaz no declara variables de instancia.
	 *    3) Una clase puede implementar varias interfaces
	 *    4) Por convencion se suele omitir los modifadores que se agregar implictamente en los metodos y 
	 *     constante de los elementos de interfaz.
	 *    
	 *    4) Una intefaz de almacena en un archivo nombreArchivo.java y que, al compilarse genera un archivo 
	 *    nombreArchivo.class. Al no corresponder a una clase que implementa un m�todo main, este archivo no
	 *     puede ejecutarse con el int�rprete de Java.
	 *    
	 *    CONSTANTES DE UNA INTERFAZ
	 *    1) Todas las constantes incluidas en una interfaz se declaran impl�citamente como public, 
	 *    static y final (tambi�n se pueden omitir) y es necesario inicializarlas en la misma sentencia 
	 *    de declaraci�n.
	 *    
	 *    
	 *    
	 *    
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Operaciones{
	
	// ConstanteS - impl�citamente se declaran como public, static y final
	double PORCENTAJE =10;
	double IVA=10;
	
	// Metodos- implicitamente son public y abstract
	double sumar();
	double restar();
	double multiplicar();
	
}



class Notas implements Operaciones{

	
	
	
	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multiplicar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

