package curso;

public class ReferenciaObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valorUno = 10;
		int valorDos = 30;
		String nombre = "Ronny";
		String apellido = nombre;
		
		System.out.println("Valor uno: " + valorUno);
		System.out.println("Valor dos: " + valorDos);
		System.out.println("Valor nombre: " + nombre);
		System.out.println("Valor apellido: " + apellido);
		
		
		System.out.println("codigo nombre: " + nombre.hashCode());
		// apellido tendrá el mismo valor de hascode() que la variable nombre, ambos apuntan al mismo objeto
		System.out.println("codigo apellido: " + apellido.hashCode());
		
		nombre = null;
		// variable nombre ya no referenciará a ningun objeto
		System.out.println("Valor nombre: " + nombre);
		// variable apellido seguirá referenciando al objeto
		System.out.println("Valor apellido: " + apellido);
				
	}


}
