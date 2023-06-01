package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class Aireacondicionado implements ReferenciaDispositivo {
	private String nombre;

	public Aireacondicionado(String nom) {
		nombre = nom;
	}

	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendido \n de \t \" aire" + nombre);
	}

	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagar \n de \t \" aire" + nombre);
	}
}
