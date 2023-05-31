/**
 * 
 */
package fin.coop1504.tallerjava.entidades;

/**
 * @author anvera
 *
 */
public class Persona {
	// private dentro de la clase
	// public no se necesita metodo de acceso
	// protected
	// package
	protected String nombre;
	protected String identificacion;
	//protected String tipoIdentificacion; // camelcase

	public Persona() {
		super();
		System.out.println("usando constructor sin parametro");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	return "Nombre: " + nombre +
	", Identificación: " + identificacion; //+
	//", Tipo Identificacion " + tipoIdentificacion;
}
	public Persona(String nombre, String identificacion) {
		super();
		System.out.println("usando constructor con parametro");
		this.nombre = nombre;
		this.identificacion = identificacion;
		//this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public void Imprimir() {
		System.out.println("usando constructor con parametro");

	}

	/*
	 * public Persona() {//constructor nombre = ""; // nombre = new String();
	 * identificacion = ""; tipoIdentificacion = ""; } public Persona (String
	 * pNombre, String pIdentificacion, String pTipoIdentificacion) { nombre =
	 * pNombre; this.identificacion = identificacion; tipoIdentificacion =
	 * pTipoIdentificacion;
	 * 
	 * }
	 */

}
