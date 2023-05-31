package fin.coop1504.tallerjava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;
import fin.coop1504.tallerjava.interfaces.ConsultarDatos;
import fin.coop1504.tallerjava.servicios.ServiciosPersona;

public class AplicacionTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiciosPersona.registrardatos("Angelica", "1309859609");

		DocumentoSRI ruc = new DocumentoSRI();

		ruc.setActividadEconomica("desarrollo");
		ruc.setEstado("A");
		ruc.setFechaExpedicion(new Date());

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(GregorianCalendar.YEAR, 1);
		ruc.setFechaExpiracion(cal.getTime());

		Persona persona = new Persona("Angelica", "154554654654");
		ServiciosPersona.registrardatosjuridicos(new Persona("Angelica", "154554654654"), ruc);
		System.out.println("------");
		HashMap<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(ServiciosPersona.PERSONAJURIDICA2, new Persona("karen", "14654654564"));
		parametros.put(ServiciosPersona.DOCUMENTO2, ruc);
		ServiciosPersona.registrarDatosJuridicos(parametros);
		System.out.println("------");
		// System.out.println(personaGeneral.consulta("5454564"));
		// System.out.println(personaGeneral.consulta("5454564"));
		ConsultarDatos personaGeneral = new PersonaNatural("Judith", "54654654", "ced");
		consultar(personaGeneral, "555");
		personaGeneral = new PersonaJuridica("Henrri", "546545", ruc);
		consultar(personaGeneral, "588855");//
	}

	public static void consultar(ConsultarDatos consulta, String dato) {
		System.out.println(consulta.consulta(dato));
	}

}
