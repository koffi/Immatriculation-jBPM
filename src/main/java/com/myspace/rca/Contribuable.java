package com.myspace.rca;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Contribuable implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Nom")
	private java.lang.String nom;
	@org.kie.api.definition.type.Label("Prenom")
	private java.lang.String prenom;
	@org.kie.api.definition.type.Label("Email")
	private java.lang.String email;
	@org.kie.api.definition.type.Label("Type Entreprise")
	private java.lang.String typEnt;
	@org.kie.api.definition.type.Label("Adresse")
	private java.lang.String adresse;

	@org.kie.api.definition.type.Label(value = "Etat Creation")
	private java.lang.String etatCreation;

	public Contribuable() {
	}

	public java.lang.String getNom() {
		return this.nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	public java.lang.String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(java.lang.String prenom) {
		this.prenom = prenom;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getTypEnt() {
		return this.typEnt;
	}

	public void setTypEnt(java.lang.String typEnt) {
		this.typEnt = typEnt;
	}

	public java.lang.String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(java.lang.String adresse) {
		this.adresse = adresse;
	}

	public java.lang.String getEtatCreation() {
		return this.etatCreation;
	}

	public void setEtatCreation(java.lang.String etatCreation) {
		this.etatCreation = etatCreation;
	}

	public Contribuable(java.lang.String nom, java.lang.String prenom,
			java.lang.String email, java.lang.String typEnt,
			java.lang.String adresse, java.lang.String etatCreation) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.typEnt = typEnt;
		this.adresse = adresse;
		this.etatCreation = etatCreation;
	}

}