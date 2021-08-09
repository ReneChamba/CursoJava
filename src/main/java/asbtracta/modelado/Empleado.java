package asbtracta.modelado;

/*
 * Heredar de una clase asbtracta
 */
public class Empleado extends Persona {
	
	private String codigo;
	private double sueldo;
	
	public Empleado(String cedula, String nombre, String apellido, String direccion, 
			String telefono, String email, String codigo, double sueldo) {
		
		super(cedula,nombre,apellido,direccion,telefono,email);
		this.codigo = codigo;
		this.sueldo = sueldo;
		
	}
	public Empleado() {}
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	// Metodos asbtractos implementados de forma obligatioria 
	@Override
	public String getDescipcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

}
