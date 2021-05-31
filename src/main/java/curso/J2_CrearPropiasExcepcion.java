package curso;

import javax.swing.JOptionPane;

public class J2_CrearPropiasExcepcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String correo = JOptionPane.showInputDialog(null, "Ingrese su correo");	
		
		
		try {
			J2_CrearPropiasExcepcion.correo(correo);
			
		} catch (ErrorLongitud e) {
			// TODO Auto-generated catch block
			System.out.println("Capturando error en el main: " +e.getMessage());
		
			
		}

		
		
		System.out.println("final ");
	}
	
	
	public static void correo(String correo)  throws ErrorLongitud{
		
		
		   String  nombre = "ronny";
		
			if (correo.length()<5) {
				
				throw new ErrorLongitud("Longitud muy corta para el email");
			}
			
			
			if (nombre != null) nombre.toUpperCase();
			
			System.out.println("Email: " + correo);
		
	}

}

// Crear propia exception: Tipo Ckecked-obligatorio controlar
class ErrorLongitud extends Exception{
	
	public ErrorLongitud(){}
	
	
	public ErrorLongitud(String mensaje){
		super(mensaje);
		
		
	}
	
}
