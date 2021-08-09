package asbtracta.modelado;

public class CajeroEspecial  extends Cajero{

	private double incentivo;	
	
	public CajeroEspecial() {}
	
	public CajeroEspecial(String cedula, String nombre, String apellido, String direccion, 
			String telefono, String email, String codigo, double sueldo, String clavePc,
			int numeVentas, double incentivo ) {
		
		super(cedula,nombre,apellido,direccion,telefono,email, codigo, sueldo,clavePc, numeVentas);
		
		this.incentivo = incentivo;
		
	}
	
	

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	
	
}
