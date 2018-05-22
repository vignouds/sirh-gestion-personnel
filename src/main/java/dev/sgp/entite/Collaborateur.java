package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adresse;
	private String numeroSS;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean acif;

	public Collaborateur() {
		
	}
}
