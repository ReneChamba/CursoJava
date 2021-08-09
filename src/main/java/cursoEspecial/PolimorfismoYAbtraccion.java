package cursoEspecial;

public class PolimorfismoYAbtraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Rectangulo r = new Rectangulo(9, 5);
	     Triangulo t = new Triangulo(10, 8);
	     Figura figref; // Esto es correcto. No estamos creando ning�n objeto
	     figref = r; // Polimorfismo, se estar� refereciando a la subclase Rectangulo
	     // Invocara el metodo area() de Rectangulo
	     System.out.println("Area es " + figref.area ());
	     figref = t; // Polimorfismo, se estar� refereciando a la subclase Tri�ngulo
	     // Invocara el metodo area() de Tri�ngulo
	     System.out.println ("Area es " + figref.area ());
		
	     
	     /*
	      * Aunque no es posible crear un objeto del tipo Figura, podemos crear una variable
	      *  de referencia de su tipo. La variable figref se declara como referencia a 
	      *  Figura y esto significa que puede utilizarse para referirse a un objeto de 
	      *  cualquier clase derivado Figura. Los m�todos sobreescritos se resuelven mediante 
	      *  variables de referencia de la superclase en tiempo de ejecuci�n.
	      */
		
	}

}
abstract class Figura {
    double dim1;
    double dim2;
    Figura(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
    }


class Rectangulo extends Figura {
    Rectangulo(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("dentro Area de Rect�ngulo.");
        return dim1 * dim2;
    }
}

class Triangulo extends Figura {
    Triangulo(double a, double b) {
        super(a, b);
    }
    double area () {
        System.out.println("dentro Area de Tri�ngulo.");
        return dim1 * dim2 / 2;
    }
}
