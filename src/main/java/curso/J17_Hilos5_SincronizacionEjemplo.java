package curso;

public class J17_Hilos5_SincronizacionEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Loqui run1 = new Loqui();
		Thread hilo1 = new Thread(run1);
		
		hilo1.start();
		
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Si no utizo el método join() las linea siguientes se ejecutan antes de que el hilo1 
		// entre en estado ejecutable (star() ), entonces al momento de recuperar tendra el valor por defecto, 
		// ya que se ejecutaran antes de ejecutar el metodo star(), el que a su vez
		// llama al método run , y este quien setea estos datos.
		
		// Entonces con join(), primero hago una espera hasta que finalize el hilo1 y luego 
		// recupero los valores, que para ese momento ya fueron seteadas en el método run()
		System.out.println("Nombre: " + run1.getNombre());
		System.out.println("Edad: " + run1.getEdad());
	}

}

class Loqui implements Runnable{
	
	private String nombre;
	private int edad;
	public Loqui() {}
	
	@Override
	public void run(){
		
		/*try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		setEdad(20);
		setNombre("Pepe");
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}