package ppal;

import clases.Cuenta;
import clases.Persona;

public class PruebaClases {

	public static void main(String[] args) {
		
		Persona p = new Persona("Juan", 35, "30000000F");
		
		System.out.println("La persona es ");
		p.mostrar();
		
		
		Cuenta cuenta = new Cuenta(p);
		System.out.println("LA cuenta es: ");
		cuenta.mostrar();
		
		Persona p2 = new Persona("Ana", 28, "44555666P");
		Cuenta cuenta2 = new Cuenta(p2, 2000);
		System.out.println("LA cuenta 2 es:");
		cuenta2.mostrar();
		
		p2.setNombre("Alberto");
		cuenta2.mostrar();
	}

}
