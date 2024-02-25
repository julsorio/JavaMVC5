package es.accenture.controladores;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Andrea Ravagli Castillo
 */
public interface IControlador {
	String procesarPeticion(HttpServletRequest request, HttpServletResponse response);
}
