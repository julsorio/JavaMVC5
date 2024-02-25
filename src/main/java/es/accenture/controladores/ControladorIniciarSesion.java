package es.accenture.controladores;

import javax.sql.DataSource;

import es.accenture.modelos.ModeloUsuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Andrea Ravagli Castillo
 */
public class ControladorIniciarSesion implements IControlador {
	
	private ModeloUsuario modeloUsuario;
	
	public ControladorIniciarSesion(DataSource dataSource) {
		modeloUsuario = new ModeloUsuario(dataSource);
	}

	@Override
	public String procesarPeticion(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

}
