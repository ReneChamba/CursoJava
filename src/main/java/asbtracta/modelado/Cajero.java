package asbtracta.modelado;

public class Cajero  extends Empleado{
	
	
	private String clavePc;
	private int numeVentas;

	public Cajero() {}
	
	public Cajero(String cedula, String nombre, String apellido, String direccion, 
			String telefono, String email, String codigo, double sueldo, String clavePc,int numeVentas ) {
		
		super(cedula,nombre,apellido,direccion,telefono,email, codigo, sueldo);
		
		this.clavePc = clavePc;
		this.numeVentas = numeVentas;
	
	}

	public String getClavePc() {
		return clavePc;
	}

	public void setClavePc(String clavePc) {
		this.clavePc = clavePc;
	}

	public int getNumeVentas() {
		return numeVentas;
	}

	public void setNumeVentas(int numeVentas) {
		this.numeVentas = numeVentas;
	}
	
	

}
