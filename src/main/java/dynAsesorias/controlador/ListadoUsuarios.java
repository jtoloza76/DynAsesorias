package dynAsesorias.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dynAsesorias.Implementacion.impUsuario;
import dynAsesorias.interfaces.iUsuario;
import dynAsesorias.modelo.Usuario;

/**
 * Servlet implementation class ListadoUsuarios
 */
@WebServlet("/ListadoUsuarios")
public class ListadoUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//iUsuario us = new impUsuario();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(false);
		if (session != null) {
			/*
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();		
			usuarios.add(new Usuario("user", "1234"));
			usuarios.add(new Usuario("admin", "1234"));		
			request.setAttribute("usuarios", usuarios);
			*/
			
			impUsuario user1 = new impUsuario();
			List<Usuario> user = user1.readAll();
			request.setAttribute("user", user);	
			
			getServletContext().getRequestDispatcher("/ListadoUsuarios.jsp").forward(request, response);
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
		iUsuario user1 = new impUsuario();
		Usuario user = new Usuario(request.getParameter("usuario"), request.getParameter("password"), request.getParameter("tipo"));

		user1.create(user);

		request.setAttribute("user", user);
		

		System.out.println(user.getUsuario());
		System.out.println(user.getPassword());
		System.out.println(user.getTipo());		

		getServletContext().getRequestDispatcher("/nuevoUsuario.jsp").forward(request, response);
	}

}
