package curso;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Fuciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> filtro = name -> name.length()>30;
		Consumer<Persona> consumer= persona -> System.out.println(persona);
		
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Ronny", "Chamba", 67));
		personas.add(new Persona("Rene", "Ordoñes", 44));
		personas.add(new Persona("Juan", "Gavilanez", 38));
		personas.add(new Persona("Mayra", "Pullaguari", 30));
		personas.add(new Persona("Viviana", "Santos", 18));
		

		
		/*for (int i =0; i< personas.size(); i++ ) 
			
			if (personas.get(i).getEdad()>30)
				
				personasFiltro.add(personas.get(i));
		*/
		
		
		/*
		for (Persona p :personas)  
			
			if (p.getEdad()>30) 
				personasFiltro.add(p);
		
		*/
		
		
		
		List<Persona> personasFiltro = personas.stream()
											   .filter(x -> x.getEdad()>30)
											   .peek( x -> System.out.println(x))
											   .collect(Collectors.toList());
		
		 List<String> datos =  personasFiltro.stream()
					  				    .map( x -> x.getNombre() + " " +  (x.getEdad() + 5))
					  				    .peek(x -> System.out.println(x))
					  				    .collect(Collectors.toList());
					  		
											   
		
		 
		 Function<Persona, Persona> mapear = persona -> {
			 	
			 persona.setEdad(persona.getEdad()+5); 
			 return persona;
		 
		 } ;
		 
									   
	
		 Persona personasAdd = personas.stream()
				 
				   		                     .filter(x -> (x.getEdad()>30))
				   		                     .map(mapear)
				   		                     .sorted()
				   		                     .collect(Collectors.toList())
				   		                     .get(0);
				   		                  
		
		
		
		
		
		
		
		
		
		
	}

}
