package cursoEspecial;

import cursoEspecial.Enumerados.Familia;

public class Enumerados2 {

	/**
	 * 
     *  Leer explicacion sobre los enum en el archivo {@link Enumerados}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		EstadoAnio prima = EstadoAnio.PRIMAVERA;
		EstadoAnio veran = EstadoAnio.VERANO;
		EstadoAnio otog = EstadoAnio.OTOGNIO;
		
		// Objeto
		System.out.println(prima);
		System.out.println(prima.ordinal());
		// Nombre de esta constante, como esta definida en la declaracion 
		System.out.println(prima.name()); // --> String
		// Nombre de esta constante, como esta definida en la declaracion , se recomienda 
		// utilizar este metodo en vez de name()
		System.out.println(prima.toString()); // --> String 
		
		/*
		 * 
		 *	Devuelve la constante de enumeraci�n del tipo de enumeraci�n especificado 
		 *  con el nombre especificado. El nombre debe coincidir exactamente con un 
		 *  identificador utilizado para declarar una constante de enumeraci�n en este tipo
		 */
		EstadoAnio oto2 = Familia.valueOf(EstadoAnio.class, "OTOGNIO");
		System.out.println(oto2);
	}

}

 enum EstadoAnio {

	 // Crear objetos(constantes), los objetos solo se puede crear dento la defincion de la clase
	 VERANO("v") , OTOGNIO("o"), PRIMAVERA("p");
	 
	 
	 // Definir constructor privado, esto para que no se puedan crear objeto desde fuera
	 private EstadoAnio(String abreviatura) {
		 
		 this.abreviatura = abreviatura;
		 
	 }
	 
	 // Definir metodos
	 public String getAbrevitura() {
		 return abreviatura;
	 }
	 
	 // Definir atributos
	 private String abreviatura;
	 
	 
 }