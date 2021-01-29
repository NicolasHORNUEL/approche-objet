package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// abstract method without body
	public abstract double getSalaire();
	
	// method available in the inherited class
	public void afficherDonnees() {
		System.out.println("Intervenant [" + nom + " " + prenom + " " + getSalaire() + "\u20AC "
				+ getClass().getSimpleName() + "]");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
