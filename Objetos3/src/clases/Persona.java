/**

 * 
 */
package clases;

/**
 * @author David
 * Clase que almacena los datos de una persona
 */
public class Persona {
	
	// Estado o variables de instancia
	private String nombre;
	private int edad;
	private String dni;
	
	public Persona () {
		this.nombre="";
		this.dni="";
		edad=0;
	}

	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.setDni(dni);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni.length()==9 && Character.isLetter(dni.charAt(8))) {
			this.dni = dni;
		}
	}

	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("DNI: "+dni);
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad >=18 ) {
			return true;
		}
		return false;
	}

	
	

	
	
	
	
	
	
}
