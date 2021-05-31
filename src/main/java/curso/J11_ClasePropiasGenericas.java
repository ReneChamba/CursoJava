package curso;

public class J11_ClasePropiasGenericas {

	/*
	 * Las letras utilizadas por convencion como nombre en el parametro del generico
	 * son las letras en Mayusculas T,U,K
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Pareja<String> pareja  = new Pareja<String>();	
		pareja.setPrimero("Juana");
		System.out.println(pareja.getPrimero());
		
		
		
		Pareja<Integer> parejaEntera  = new Pareja<Integer>();	
		parejaEntera.setPrimero(23);
		System.out.println(parejaEntera.getPrimero());
		
		
		Pareja<Bombero> persona = new Pareja<Bombero>();
		persona.setPrimero(new Bombero("ronny"));
		System.out.println(persona.getPrimero());
		
		
	}

}

// Clase generico
class Pareja<T>{
	
	
	public Pareja() {
		
		setPrimero(null);
	}
	
	public T getPrimero() {
		return primero;
	}

	public void setPrimero(T primero) {
		this.primero = primero;
	}


	// Atributo generico
	private T primero;
}




class Bombero{
	
	
	public  Bombero(String nombre) {
		// TODO Auto-generated constructor stub
	
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Nombre: "  +  nombre;
	}
	
	private String nombre;
	
}