package poliformismo;

public class Gerente  extends Empleado{

	private double incentivo;
	
	public Gerente() {}
	
	public Gerente(String nombre, int edad, double sueldo) {
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
