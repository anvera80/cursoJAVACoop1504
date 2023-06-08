package fin.coop1504.tallerjava.servicio;

import java.sql.SQLException;

import fin.coop1504.tallerjava.configuracion.Enumeradores;
import fin.coop1504.tallerjava.configuracion.SingletonConexion;
import fin.coop1504.tallerjava.exepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.repositorio.Test_angieRepositorio;

public class ServicioLogicaNegocio{
	private static Test_angieRepositorio repo = new Test_angieRepositorio();
    public static String registrarDatos(String dato1, String dato2,String dato3) throws ExcepcionValidacion {
        // -- validar datos
        if (dato1 == null || dato1.isEmpty()) {
            // return "Debe registrar dato 1";
            throw new ExcepcionValidacion(Enumeradores.COD_ERROR_DATOS, Enumeradores.COD_ERROR_DATOS);
        }
        if (dato2 == null || dato2.isEmpty()) {
            throw new ExcepcionValidacion(Enumeradores.COD_ERROR_DATOS, Enumeradores.COD_ERROR_DATOS);
        }
        if (dato3 == null || dato3.isEmpty()) {
            // return "Debe registrar dato 1";
            throw new ExcepcionValidacion(Enumeradores.COD_ERROR_DATOS, Enumeradores.COD_ERROR_DATOS);
        }
        try {
            repo.registrar(dato1, dato2,dato3);
            SingletonConexion.commit();
        } catch (SQLException e) {
            // TODO: handle exception
            e.getStackTrace();
            // return "Imposible realizar la transaccion";
            throw new ExcepcionValidacion(Enumeradores.COD_ERROR_TRX, Enumeradores.MEN_ERROR_TRX);
        }
        return Enumeradores.MEN_EXITO_TRX;
    }
    public static Integer sumarDatos(Integer dato1, Integer dato2) throws ExcepcionValidacion {
        Integer resultado = 0;

        if (dato1 == null) {

            // return "Debe registrar dato 1";

            throw new ExcepcionValidacion(Enumeradores.COD_ERROR_DATOS, Enumeradores.COD_ERROR_DATOS + " - dato1");
        }
        if (dato2 == null) {

            throw new ExcepcionValidacion(Enumeradores.COD_ERROR_DATOS, Enumeradores.COD_ERROR_DATOS + " - dato1");
        }
        try {

            resultado = repo.invocacionProcedure(dato1, dato2);

        } catch (SQLException e) {

            // TODO: handle exception

            e.printStackTrace();

            throw new ExcepcionValidacion(Enumeradores.COD_ERROR_TRX, Enumeradores.MEN_ERROR_TRX);

        }

        return resultado;
    }

}

