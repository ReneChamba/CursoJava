package poliformismo;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empleados> empleados = new ArrayList<Empleados>();
		empleados.add( new Empleados("1723774640","Ronny", "Chamba","EM01" , 300));
		empleados.add( new Empleados("1723669412","Rene", "Santos","EM02" , 300));
		
		Cajero cajero = new Cajero("1765454577", "Jandry", "Gavilanes", "CA56", 300);
		cajero.setClavePC("PC001");
		// Dependiendo el tipo de cajero, se valida que aumente sueldo o no(getSueldo() esta sobreesctio)
		cajero.setTipoCajero("Normal");
		
		Cajero cajero2 = new Cajero("1545454545", "Junior", "Perez", "CA05", 300);
		cajero2.setClavePC("PC001");
		// Dependiendo el tipo de cajero, se valida que aumente sueldo o no(getSueldo() esta sobreesctio)
		cajero2.setTipoCajero("Especial");
		
		
		
		empleados.add(cajero);
		empleados.add(cajero2);
		
		Administrador adms = new Administrador("1545754545", "Pedro", "Gutierrez", "AD56", 400);
		adms.setBonoMensual(50);
		
		empleados.add(adms);
		
		
		AdmintradorPlanta admPlanta = new AdmintradorPlanta("545454545",
					"Natalya", "Ronaldo", "AP63", 400);
		admPlanta.setBonoMensual(50);
		// Si la calificacionCalidad es >=10  se le agrega al sueldo el BonoCalidadMensual
		admPlanta.setCalifiCalidad(19);
		
		// Asignar BonoCalidaMensual
		admPlanta.setBonoCalidadMensual(100);
		
		empleados.add(admPlanta);
		
		AdiministradorGeneral admGeneral = new AdiministradorGeneral("245454545", "Mayra", 
				"Viviana", "AG04", 500);
		admGeneral.setBonoMensual(50);
		admGeneral.setBonoGeneral(100);
		
		
	empleados.add(admGeneral);
		
		for (Empleados emp : empleados) {
			
			System.out.println("Nombre: " + emp.getNombre() + 
					           " Apellido: " + emp.getApellido() +
					           " Codigo: " +emp.getCodigo() +
					           " Sueldo: " + emp.getSueldo());
			                    
		}
		
		
		
		
		
	}

}


// 	Clase Padre
 abstract class Persona{
	
	private String cedula;
	private String nombre;
	private String apellido;
	
	public Persona(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	
}

// ----------------------------------- //
class Empleados extends Persona{
	
	private String codigo;
	private double sueldo;
	
	public Empleados(String cedula, String nombre, String apellido,
			String codigo,double sueldo) {
		super(cedula, nombre, apellido);
		
		this.codigo = codigo;
		this.sueldo = sueldo;
	}

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
	
}

// -------------------------------------- //
class Cajero extends Empleados {
	
	private String clavePC;
	private String tipoCajero;
	public Cajero(String cedula, String nombre, String apellido,
			String codigo,double sueldo) {
		
		super(cedula, nombre, apellido, codigo, sueldo);
	}

	public String getClavePC() {
		return clavePC;
	}

	public void setClavePC(String clavePC) {
		this.clavePC = clavePC;
	}
	
	
	
	public String getTipoCajero() {
		return tipoCajero;
	}

	public void setTipoCajero(String tipoCajero) {
		this.tipoCajero = tipoCajero;
	}

	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		
		/*
		 * Si el tipo de cajero es Especial, se le suma 
		 * el 5% de su sueldo al sueldo actual
		 */
		double nuevoSueldo = super.getSueldo();
		if (tipoCajero.equalsIgnoreCase("Especial"))
			nuevoSueldo+= nuevoSueldo*0.05;
		
		return  nuevoSueldo;
	}
	
}

// ------------------------------- //
class Administrador extends Empleados{
	
	private String usser;
	private String pass;
	private double bonoMensual;
	
	public Administrador(String cedula, String nombre, String apellido,
			String codigo,double sueldo) {
		
		super(cedula, nombre, apellido, codigo, sueldo);
	}

	public String getUsser() {
		return usser;
	}

	public void setUsser(String usser) {
		this.usser = usser;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public double getBonoMensual() {
		return bonoMensual;
	}

	public void setBonoMensual(double bonoMensual) {
		this.bonoMensual = bonoMensual;
	}
	
	
	@Override
	public double getSueldo() {
		double nuevoSueldo = super.getSueldo();
		
		nuevoSueldo+= bonoMensual;
		return  nuevoSueldo;
	}
	
}

// ------------------------------------------------ //

class AdmintradorPlanta extends Administrador {
	
	private double califiCalidad;
	private double bonoCalidadMensual;
	
	public AdmintradorPlanta(String cedula, String nombre, String apellido,
			String codigo,double sueldo) {
		
		super(cedula, nombre, apellido, codigo, sueldo);
	}

	public double getCalifiCalidad() {
		return califiCalidad;
	}

	public void setCalifiCalidad(double califiCalidad) {
		this.califiCalidad = califiCalidad;
	}

	public double getBonoCalidadMensual() {
		return bonoCalidadMensual;
	}

	public void setBonoCalidadMensual(double bonoCalidadMensual) {
		this.bonoCalidadMensual = bonoCalidadMensual;
	}
	
	@Override
	public double getSueldo() {
		double nuevoSueldo = super.getSueldo();
		
		if (califiCalidad>=10) 
			nuevoSueldo+=bonoCalidadMensual;
		
		// TODO Auto-generated method stub
		return nuevoSueldo;
	}

}

// ---------------------------------------- //
class AdiministradorGeneral extends Administrador{
	
	private boolean realizarReunion;
	private String solicitarEmpleados;
	private double bonoGeneral ;
	
	public AdiministradorGeneral(String cedula, String nombre, String apellido,
			String codigo,double sueldo) {
		
		super(cedula, nombre, apellido, codigo, sueldo);
	}

	public boolean isRealizarReunion() {
		return realizarReunion;
	}

	public void setRealizarReunion(boolean realizarReunion) {
		this.realizarReunion = realizarReunion;
	}

	public String getSolicitarEmpleados() {
		return solicitarEmpleados;
	}

	public void setSolicitarEmpleados(String solicitarEmpleados) {
		this.solicitarEmpleados = solicitarEmpleados;
	}

	
	public double getBonoGeneral() {
		return bonoGeneral;
	}

	public void setBonoGeneral(double bonoGeneral) {
		this.bonoGeneral = bonoGeneral;
	}

	
	@Override
	public double getSueldo() {
		
		double nuevoSueldo = super.getSueldo();
		
		nuevoSueldo += bonoGeneral;
		
		return nuevoSueldo;
		
	}
	
	
	
	
}
	