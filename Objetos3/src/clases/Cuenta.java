/**
 * 
 */
package clases;

/**
 * @author David
 *
 */
public class Cuenta {

	// EStado
	private Persona titular;
	private double saldo;
	
	
	public Cuenta(Persona titular) {
		this.titular = titular;
		this.saldo=0;
	}


	public Cuenta(Persona titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}


	public Persona getTitular() {
		return titular;
	}


	public void setTitular(Persona titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void mostrar() {
		System.out.println("__________");
		System.out.println("Titular");
		titular.mostrar();
		System.out.println("Saldo: "+saldo);
		System.out.println("__________");
	}

	
	
	
	
	/*
	public Cuenta(String nombre, int edad, String dni, double saldo) {
		Persona p = new Persona(nombre,edad,dni);
		titular=p;
		this.saldo=saldo;
	}*/
	
	
	
	
}
