package dev.sgp.web;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {

		String matricule = req.getParameter("matricule");
		Optional<String> optMatricule = Optional.ofNullable(matricule);
		
		if(optMatricule.isPresent()) {
			resp.getWriter().write("<h1>Edition de collaborateur</h1>Matricule : "+matricule);			
		}
		else {
			resp.sendError(400, "Un matricule est attendu");
		}	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
	
	}
}
