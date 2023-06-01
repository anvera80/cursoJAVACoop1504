package fin.coop1504.tallerjava;

import java.util.ArrayList;
import java.util.Vector;

import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;

public class AplicacionTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String cadena = "Hola mundo"; System.out.println(cadena.concat("tierra"));
		 * System.out.println(cadena); StringBuffer cadenaEspecial = new StringBuffer
		 * ("Hola mundo Buffer"); cadenaEspecial.append("\n Tierra");
		 * System.out.println(cadenaEspecial.toString()); for (int i =
		 * cadena.length()-1; i >=0;i--) { System.out.print(cadena.charAt(i)); } for
		 * (char a : cadena.toCharArray()) { System.out.println(a); }
		 * System.out.println(""); System.out.println(cadenaEspecial.reverse());
		 * 
		 * String [] cadenas = new String[4]; cadenas[0]= "emilio"; cadenas[1]= "wewe";
		 * cadenas[2]= "angie"; cadenas[3]= "mayer"; String [] cadenas2 = {"JAVA",
		 * "PYTHON",".NET"};
		 * 
		 * for (String cad: cadenas) { System.out.println(cad); } for (String cad:
		 * cadenas2) { System.out.println(cad); } Vector<String>vector = new Vector();
		 * vector.add("Cadena 1"); vector.add("Cadena 2"); vector.add("Cadena 3");
		 * System.out.println(vector.size()); ArrayList<Integer> lista= new
		 * ArrayList<Integer>(); lista.add(10); lista.add(20); lista.add(30);
		 * System.out.println(lista.size()); lista.forEach(elemento -> { if
		 * (elemento.equals(20)) System.out.println(elemento+20); else
		 * System.out.println(elemento); }); String cadenaVector = vector.get(0);
		 * System.out.println(cadenaVector); //se envia el mismo objeto Integer
		 * numerArrayList = lista.get(0); System.out.println(numerArrayList);
		 */
		validarDatos("565564");
		try {
			validarDatosEspecificos("");
		} catch (ExcepcionValidacion e) {
			// TODO Auto-generated catch block
			System.err.println("Codigo error:" + e.getCodigo() + "mensaje" + e.getMensajeTecnico());
			e.printStackTrace();
		} finally {
		System.out.println("Error");	
		}
	}

	public static void validarDatos(String anios) {
		Integer edad = Integer.parseInt(anios);
		System.out.println(edad);
	}

	public static void validarDatosEspecificos(String dato) throws ExcepcionValidacion {
		if (dato == null || dato.isEmpty()) {
			//ExcepcionValidacion error = new ExcepcionValidacion("001", "Error al validar el dato");
			//throw error;
			throw new ExcepcionValidacion("001", "Error al validar el dato");
		}
	}
}
