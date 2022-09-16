package dynAsesorias.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dynAsesorias.Implementacion.impContacto;
import dynAsesorias.interfaces.iContacto;
import dynAsesorias.modelo.Contacto;

/**
 * Servlet implementation class CrearContacto
 */
@WebServlet("/CrearContacto")
public class CrearContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession sesion = request.getSession(false);
		if (sesion != null) {
			getServletContext().getRequestDispatcher("/contacto.jsp").forward(request, response);
		} else {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		iContacto contacto1 = new impContacto();
		Contacto contacto = new Contacto(request.getParameter("usuario"), request.getParameter("email"), request.getParameter("mensaje"));

		contacto1.create(contacto);

		request.setAttribute("contacto", contacto);
		

		System.out.println("Estimado: " + contacto.getUsuario());
		System.out.println("Lo contactaremos a este email: " + contacto.getEmail());
		System.out.println("Por el siguiente mensaje: " + contacto.getMensaje());		

		getServletContext().getRequestDispatcher("/EnviarContacto.jsp").forward(request, response);
	}

}
