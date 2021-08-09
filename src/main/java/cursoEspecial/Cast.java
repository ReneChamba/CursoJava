package cursoEspecial;

public class Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		/*
		 * Casting de objetos
		 * 
		 * 1) El casting es un procedimiento para transformar un objeto de una clase a otra clase 
		 *    siempre y cuando haya una relaci�n de herencia entre ambas
		 * 2) Los objetos deben ser compatibles entre s�, por ejemplo una clase hija y una clase padre.
		 * 
		 * 3) La mayor utilidad de los castings de objetos es cuando necesitamos que sea de un objeto 
		 *    en concreto, ya que si es del tipo de la clase padre, no podr� llamar a los m�todos 
		 *    propios de la clase hija.
		 *    
		 *  4)  los casting son �tiles cuando queremos llamar a m�todos propios de un objeto que esta 
		 *  en otra clase compatible
		 *  
		 *  RECOMENDACIONES
		 *  
		 *   te recomiendo utilizar polimorfismo para evitar en todo lo posible el casting, 
		 *   siempre que se pueda.
		 */
		
		
		
		Universitario uni = new Universitario("Ronny", "Chamba", "Presencial");
		Escolar esc = new Escolar("Jandry", "Gavilanez", "Primaria");
		Estudiante es = new Estudiante("Juan", "Santoa");
		
		// Los 3 ojetos estan enmascarados como si fueran un Estudiante,  por lo que las clases Hijas
		// no podran llamar a sus m�todos propios
		Estudiante [] est = {es, uni, esc};
	
		// Dentro del bucle, uso instanceof para asegurme que el objeto sea del tipo
		// que yo quiero castear. Si lo es puedo hacer el casting sin problemas:
		for (Estudiante e: est) {
			
			//Nos aseguramos de que sea del tipo Universitario
			if (e instanceof Universitario) {
				Universitario	tempo = (Universitario) e; //Casting a Universitario
				tempo.metodoUniversitario(); //Ahora puedo llamar al metodo
				
			}
			if (e instanceof Escolar) {
				
				Escolar tempEs = (Escolar)e;
				tempEs.metodoEscolar();
			}
			
			
			
			// Polimorfismo
			e.descripcion();
			
			
		}
		
		
	}

}

class Estudiante{
	
	private String nombre;
	private String apellido;
	
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void descripcion() {
		System.out.println("Soy un estudiante calquiera");
	}
}

class Universitario extends Estudiante{
	
	private  String  tipoPasatia;
	
	public Universitario(String nombre, String apellido, String  tipoPasatia ) {
		super(nombre,apellido);
		
		this.tipoPasatia  = tipoPasatia;
	}
	
	
	public String getTipoPasatia() {
		return tipoPasatia;
	}


	public void setTipoPasatia(String tipoPasatia) {
		this.tipoPasatia = tipoPasatia;
	}


	public void metodoUniversitario() {
		
		System.out.println("Soy un metodo de Universtiario");
	}
	
	@Override
	public void descripcion() {
		// TODO Auto-generated method stub
		System.out.println("Soy un estudiante Universtirario");
	}
	
	
}

class Escolar extends Estudiante{

	private String tipoBoletin;
	public Escolar(String nombre, String apellido, String tipoBoletin) {
		super(nombre,apellido);
		
		this.tipoBoletin = tipoBoletin;
	}
	public String getTipoBoletin() {
		return tipoBoletin;
	}
	public void setTipoBoletin(String tipoBoletin) {
		this.tipoBoletin = tipoBoletin;
	}
	
	public void metodoEscolar() {
		System.out.println("Soy un metodo de Escolar");
	}
	
	@Override
	public void descripcion() {
		// TODO Auto-generated method stub
		System.out.println("Soy un estudiante Escolar");
	}
}

