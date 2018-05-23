package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateursController extends HttpServlet {
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		String nom = req.getParameter("inputNom");	
		String prenom = req.getParameter("inputPrenom");
		String dateNaissance = req.getParameter("inputDate");
		String adresse = req.getParameter("textAdresse");		
		String numeroSS = req.getParameter("inputNoSecu");

		String incorrects = "Les paramètres suivants sont incorrects : ";
		
		if(StringUtils.isEmpty(nom)){
			incorrects += "nom";
		}
		
		if(StringUtils.isEmpty(prenom)){
			incorrects += " prenom ";
		}
		
		if(StringUtils.isEmpty(dateNaissance)){
			incorrects += " date de naissance ";
		}
		
		if(StringUtils.isEmpty(adresse)){
			incorrects += " adresse ";
		}
		
		if(StringUtils.isEmpty(numeroSS) || numeroSS.length()!=15){
			incorrects += " numéro de Sécurité Sociale ";
		}
		
		if(!StringUtils.isEmpty(nom) && !StringUtils.isEmpty(prenom) && !StringUtils.isEmpty(dateNaissance) && !StringUtils.isEmpty(adresse) && !StringUtils.isEmpty(numeroSS) && numeroSS.length()==15) {
			
			Collaborateur collaborateur = new Collaborateur();
			collaborateur.setNom(nom);
			collaborateur.setPrenom(prenom);
			collaborateur.setDateNaissance(LocalDate.parse(dateNaissance));
			collaborateur.setAdresse(adresse);
			collaborateur.setNumeroSS(numeroSS);
			collaborateur.setMatricule("M"+Math.random());
			collaborateur.setActif(true);
			collaborateur.setPhoto("photo");
			collaborateur.setDateHeureCreation(ZonedDateTime.now());	
			collaborateur.setEmailPro(prenom+"."+nom+"@societe.com");
			collabService.sauvegarderCollaborateurs(collaborateur);
			
			
			resp.sendRedirect("/sgp/collaborateurs/lister");
			
		}
		else {
			resp.sendError(400, incorrects);
		}
	}
}
