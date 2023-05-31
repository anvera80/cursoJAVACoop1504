package fin.coop1504.tallerjava.servicios;

import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;

public class ServiciosPersona {
	public static final String DOCUMENTO2 = "documento";
	public static final String PERSONAJURIDICA2 = "personajuridica";
	public static String registrardatos(String nombre, String identificacion) {
		Persona persona = new Persona();
		Persona persona2 = new Persona(nombre, identificacion);
		PersonaNatural personaNatural = new PersonaNatural(nombre, identificacion, "ced");
		System.out.println(persona);
		System.out.println(persona2);
		System.out.println(personaNatural);
		return "ok";
	}

	public static String registrardatosjuridicos(Persona persona, DocumentoSRI documento) {
		PersonaJuridica personaJuridica = new PersonaJuridica(persona.getNombre(), persona.getIdentificacion(),  documento);
		System.out.println(personaJuridica);
		return "ok";

	}
	public static String registrarDatosJuridicos (HashMap<String, Object> parametros ) {
		Persona persona = (Persona)parametros.get(PERSONAJURIDICA2);
		DocumentoSRI documento = (DocumentoSRI)parametros.get(DOCUMENTO2);
		PersonaJuridica personaJuridica = new PersonaJuridica(persona.getNombre(), persona.getIdentificacion(),documento);
		System.out.println(personaJuridica);
		return "ok";
	}
	
}
