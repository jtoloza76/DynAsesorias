package dynAsesorias.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dynAsesorias.Implementacion.impCapacitacion;
import dynAsesorias.modelo.Capacitacion;

/**
 * Servlet implementation class ListarCapacitaciones
 */
@WebServlet("/ListarCapacitaciones")
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
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
			impCapacitacion capa1 = new impCapacitacion();	
			List<Capacitacion> capa = capa1.readAll();
			request.setAttribute("capa", capa);
			getServletContext().getRequestDispatcher("/ListaCapacitacion.jsp").forward(request, response);
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
		
		impCapacitacion capa1 = new impCapacitacion();		
		Capacitacion capa = new Capacitacion(request.getParameter("nombreCurso"),request.getParameter("nombreDocente"),request.getParameter("fechaInicio"),request.getParameter("fechaTermino"),request.getParameter("precio"));		
		
		capa1.create(capa);	
		
		request.setAttribute("capa", capa);
		
		System.out.println(capa.getNombreCurso());
		System.out.println(capa.getNombreDocente());
		System.out.println(capa.getFechaInicio());
		System.out.println(capa.getFechaTermino());
		System.out.println(capa.getPrecio());
		
		getServletContext().getRequestDispatcher("/nuevaCapacitacion.jsp").forward(request, response);
		
	}
}
