package cursoEspecial;

public class Poliformismo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 // -------------------------------------
		 Perro betoven = new Perro();
		 System.out.println("----------------------------------------");
		 System.out.println(betoven.tipoAnimal());
		 
		 Cocodrilo sal= new Cocodrilo();
		 System.out.println("----------------------------------------");
		 System.out.println(sal.tipoAnimal());
		
	     // ----------------------------------------------
		
		

		// Arreglo de tipo Animales
		Animales aniamles [] =  new Animales[2];
		
		// La regla de es un : Perro es un Animal
		aniamles [0] = new Perro(); // Poliformismo en accion: Principio de sustitucion ,Animales se comportara como un perro
		// La regla de es un: Cocodrilo es un Animal
		aniamles[1] = new Cocodrilo(); // Poliformismo:Principio de sustitucion, Animal se comportara como un cocodrilo
		
		for (Animales an : aniamles) {
			
			
			System.out.println("Numero patas: " + an.numeroPatas() + " " + an.sonido() + "  Tipo: " + an.tipoAnimal());		
		}

		// mismatch = discordancia | sinonimos: discrepancia | diferencia
			 
		// Cast
		Perro perroRetorno = (Perro)aniamles[0];
		perroRetorno.raza();

		
		
	}

}

abstract class Animales{
	
	
	abstract String sonido();
	abstract int numeroPatas();
	abstract String tipoAnimal();
}



class Perro extends Animales{

	@Override
	String sonido() {
		
		//System.out.println("Dentro de Perro");
		return "Yo ladro muy fuerte";
	}

	@Override
	int numeroPatas() {
		//System.out.println("Dentro de Perro");
		return 4;
	}

	@Override
	String tipoAnimal() {
		//System.out.println("Dentro de Perro");
		return "Domestico";	
	}
	
	public void raza() {
		
		System.out.println("Pitbull");
	}
	
}


class Cocodrilo extends Animales{

	@Override
	String sonido() {
		//System.out.println("Dentro de Cocodrilo");
		return "auuuuuuuu";
	}

	@Override
	int numeroPatas() {
		//System.out.println("Dentro de Cocodrilo");
		return 4;
	}

	@Override
	String tipoAnimal() {
		//System.out.println("Dentro de Cocodrilo");
		return "Reptil Salvaje";
	}

}



