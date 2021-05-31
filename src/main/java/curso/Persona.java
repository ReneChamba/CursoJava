package curso;

import java.io.Serializable;

public class Persona implements Serializable, Comparable<Persona>{

	
	
	/**
	 * ESTA CLASE ES UTILIZADA COMO MOLDE PARA CREAR OBJETOS EN OTROS ARCHIVOS, PLZ
	 */
	private static final long serialVersionUID = 1L;
	private String nombre ;
	private String apellido ;
	private int edad ;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	

	
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		
		Persona temp = o;
		
		if (this.edad>temp.edad) {
			
			return 1;
		}
		
	
		return 0;
	}
	
	
}
