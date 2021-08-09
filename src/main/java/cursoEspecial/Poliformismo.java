package cursoEspecial;

public class Poliformismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoG [] empleados = new EmpleadoG[7];
		empleados[0] = new EmpleadoG("Juan", 20, 200);
		empleados[1] = new EmpleadoG("Pedro", 25, 200);
		empleados[2] = new EmpleadoG("Maria", 30, 200);
		empleados[3] = new EmpleadoG("Kevin", 35, 200);  
		empleados[4] = new EmpleadoG("Karina", 22, 200);
		
		GerenteG gerente1 = new GerenteG("Ronny", 25, 200);
		gerente1.setIncentivo(100);		
		
		// Todo gerente es un empleado/ Polimorfismo, principio de sustitucion
		empleados[5] = gerente1;
		empleados[6] = new GerenteG("Maria", 40, 200);
		
		for (EmpleadoG emp : empleados) {
			
			/* Explicaci�n de como sucede el poliformismo con la variable 'emp'
			 * 
			 * El metodo getSueldo() se invoca de forma dinamica,  es decir, cuando llegue
			 * al index donde el Array tipo Empleado esta almacenando un Gerente, la variable 
			 * 'emp',se comportar� como un Gerente, a pesar que 'emp' es de tipo Empleado.
			 * Entonces lo que hara es que, invocara al metodo getSueldo() pero de la clase
			 * Gerente(Gerente hered� de Empleado este metodo, y lo sobreescribio).
			 * En resumen, 'emp', se comporta como Empleado y como Gerente, ya que en
			 * ocasiones, esta llamando al metodo getSueldo() de Empleado y en otras ocasiones
			 * esta llamando al metodo getSueldo() de Gerente.
			 * 
			 * Java es capaz de detectar enque ocasiones tendr� que llamar a uno u otro metodo,
			 * este comportamiento lo hace la maquina virtual de java automaticamente, y eso es
			 * lo que se llama Enlazado Dinamico, osea la maquina virtual de java es capaz, en
			 * tiempo de ejecuci�n, determinar a que metodo tendra que llamar, si al metodo de 
			 * la clase padre o al metodo de la subclase.
			 * 
			 */
			
			System.out.println(emp + " Sueldo: " + emp.getSueldo());
			
		}
	
	}
	

}

class EmpleadoG {


	private String nombre;
	private int edad;
	private double sueldo;
	
	public EmpleadoG() {}
	public EmpleadoG(String nombre, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + "   Edad: " + edad ;
	}
	
}


 class GerenteG  extends EmpleadoG{

	private double incentivo;
	
	public GerenteG() {}
	
	public GerenteG(String nombre, int edad, double sueldo) {
		super(nombre, edad,sueldo);
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	// Sobreescrir 
	@Override
	public double getSueldo() {
		
		double nuevoSueldo = super.getSueldo();
		nuevoSueldo += incentivo;
		return nuevoSueldo;
	}
	
	
	
}