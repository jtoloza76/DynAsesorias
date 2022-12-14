package dynAsesorias.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dynAsesorias.Implementacion.impUsuarioServicio;
import dynAsesorias.interfaces.iUsuarioServicio;
import dynAsesorias.modelo.Usuario;

/**
 * Servlet implementation class ActualizarUsuario
 */
@WebServlet("/ActualizarUsuario")
public class ActualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	iUsuarioServicio us = new impUsuarioServicio();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String idusuarios = request.getParameter("idusuarios");
		
		System.out.println("ID USUARIO: "+idusuarios);

		if (idusuarios == null) {
			request.setAttribute("user", us.read());
			getServletContext().getRequestDispatcher("/ListadoUsuarios.jsp").forward(request, response);
			System.out.println("No captura id");
		} else {
			Usuario user = us.read(Integer.parseInt(idusuarios));
			request.setAttribute("useri", user);
			getServletContext().getRequestDispatcher("/ActualizarUsuario.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String idusuarios = request.getParameter("idusuarios");
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		String tipo = request.getParameter("tipo");
		System.out.println("----------------------------------------");
		System.out.println(idusuarios);
		System.out.println(usuario);
		System.out.println(password);
		System.out.println(tipo);
		System.out.println("----------------------------------------");
		

		Usuario user = new Usuario(Integer.parseInt(idusuarios), usuario, password, tipo);
				

		us.update(user);

		request.setAttribute("useri", us.read());
		
		getServletContext().getRequestDispatcher("/nuevoUsuario.jsp").forward(request, response);

		System.out.println("La nueva informacion es: ");
		System.out.println(user.getUsuario());
		System.out.println(user.getPassword());
		System.out.println(user.getTipo());
		
	}

}
