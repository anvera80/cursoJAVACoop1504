package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.exepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.servicio.ServicioLogicaNegocio;

public class AplicacionServicioBaseDatos {
	public static void main(String[] args) {
		try {
			//ServicioLogicaNegocio.registrarDatos(null, null, null);
			Integer resultado = ServicioLogicaNegocio.sumarDatos(5, 6);
			System.out.println(resultado);
			
		}catch (ExcepcionValidacion e) {
			e.getStackTrace();
			System.out.println("********************");
			
		}

	}

}
