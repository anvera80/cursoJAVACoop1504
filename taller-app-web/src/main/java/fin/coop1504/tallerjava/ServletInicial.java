package fin.coop1504.tallerjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletInicial")
public class ServletInicial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletInicial() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Hola Mundo, aqui Angie cualquier cosa");
		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		// System.out.println("parametro nombre= "+nombre);
		// System.out.println("parametro edad= "+edad);

		response.getWriter().println("Bienvenido: " + nombre + "Edad " + edad);
	}
}
