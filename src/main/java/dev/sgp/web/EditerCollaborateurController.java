package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
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
		String inc1 = new String();
		String inc2 = new String();
		String inc3 = new String();
		String inc4 = new String();
		
		String matricule = req.getParameter("matricule");
		Optional<String> optMatricule = Optional.ofNullable(matricule);
		
		String titre = req.getParameter("titre");
		Optional<String> optTitre = Optional.ofNullable(titre);
		
		String nom = req.getParameter("nom");
		Optional<String> optNom = Optional.ofNullable(nom);
		
		String prenom = req.getParameter("prenom");
		Optional<String> optPrenom = Optional.ofNullable(prenom);
		
		if(!optMatricule.isPresent()){
			inc1 = "matricule";
		}
		
		if(!optTitre.isPresent()){
			inc2 =" titre ";
		}
		
		if(!optNom.isPresent()){
			inc3 = " nom ";
		}
		
		if(!optPrenom.isPresent()){
			inc4 = " prenom ";
		}
		
		if(optMatricule.isPresent() && optTitre.isPresent() && optNom.isPresent() && optPrenom.isPresent()) {
			resp.setStatus(201);
			resp.getWriter().write("Création d'un collaborateur avec les informations suivantes : "
			+"matricule="+matricule+",titre="+titre+",nom="+nom+",prenom="+prenom);
		}
		else {
			String incorrects = "Les paramètres suivants sont incorrects : ".concat(inc1).concat(inc2).concat(inc3).concat(inc4);
			resp.sendError(400, incorrects);
		}
	}
}
