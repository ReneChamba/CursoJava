package poliformismo;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado [] empleados = new Empleado[7];
		empleados[0] = new Empleado("Juan", 20, 200);
		empleados[1] = new Empleado("Pedro", 25, 200);
		empleados[2] = new Empleado("Maria", 30, 200);
		empleados[3] = new Empleado("Kevin", 35, 200);
		empleados[4] = new Empleado("Karina", 22, 200);
		Gerente gerente1 = new Gerente("Ronny", 25, 200);
		gerente1.setIncentivo(100);		
		
		// Todo gerente es un empleado/ Polimorfismo, principio de sustitucion
		empleados[5] = gerente1;
		empleados[6] = new Gerente("Maria", 40, 200);
		
		for (Empleado emp : empleados) {
			
			/* Explicación de como sucede el poliformismo con la variable 'emp'
			 * 
			 * El metodo getSueldo() se invoca de forma dinamica,  es decir, cuando llegue
			 * al index donde el Array tipo Empleado esta almacenando un Gerente, la variable 
			 * 'emp',se comportará como un Gerente, a pesar que 'emp' es de tipo Empleado.
			 * Entonces lo que hara es que, invocara al metodo getSueldo() pero de la clase
			 * Gerente(Gerente heredó de Empleado este metodo, y lo sobreescribio).
			 * En resumen, 'emp', se comporta como Empleado y como Gerente, ya que en
			 * ocasiones, esta llamando al metodo getSueldo() de Empleado y en otras ocasiones
			 * esta llamando al metodo getSueldo() de Gerente.
			 * 
			 * Java es capaz de detectar enque ocasiones tendrá que llamar a uno u otro metodo,
			 * este comportamiento lo hace la maquina virtual de java automaticamente, y eso es
			 * lo que se llama Enlazado Dinamico, osea la maquina virtual de java es capaz, en
			 * tiempo de ejecución, determinar a que metodo tendra que llamar, si al metodo de 
			 * la clase padre o al metodo de la subclase.
			 * 
			 */
			
			System.out.println(emp + " Sueldo: " + emp.getSueldo());
			
		}
	
	}
	

}
