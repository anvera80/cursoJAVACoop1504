package fin.coop1504.tallerjava.exepciones;

public class ExcepcionValidacion extends Exception { // extends indica  herencia

	private static final long serialVersionUID = 1L;
	private String codigo;
	private String mensajeTecnico;

	public ExcepcionValidacion() {
		super();
		codigo = "000";
		mensajeTecnico = "Error Desconocido";
	}

	public ExcepcionValidacion(String cod, String mens) {
		super(cod + "-" + mens);
		codigo = cod;
		mensajeTecnico = mens;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getMensajeTecnico() {
		return mensajeTecnico;
	}
}
