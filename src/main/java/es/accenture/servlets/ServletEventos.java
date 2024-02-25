package es.accenture.servlets;

import java.io.IOException;

import javax.sql.DataSource;

import es.accenture.controladores.ControladorBuscarEventos;
import es.accenture.controladores.ControladorCerrarSesion;
import es.accenture.controladores.ControladorIniciarSesion;
import es.accenture.controladores.ControladorVolver;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEventos
 * 
 * @author Andrea Ravagli Castillo
 */
public class ServletEventos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/emisora")
	private DataSource poolConexiones;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEventos() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String accion = request.getParameter("accion");
    	
    	ControladorIniciarSesion controladorIniciarSesion = null;
    	ControladorCerrarSesion controladorCerrarSesion = null;
    	ControladorBuscarEventos controladorBuscarEventos = null;
    	ControladorVolver controladorVolver = null;
    	
    	
    	switch(accion) {
    	case "login":
    		break;
    	case "logout":
    		break;
    	case "buscar":
    		break;
    	case "volver":
    		break;
    	}
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
