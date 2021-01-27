package entites;

public class Personne {

	///////////// attributes, instance variable ///////////////
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	///////// constructor without and with 2 or 3 parameters
	public Personne() {		
	}
	public Personne(String n, String p) {
		nom = n;
		prenom = p;		
	}
	public Personne(String nom, String p, AdressePostale ap) {
		this.nom = nom;
		prenom = p;
		adressePostale = ap;
	}
	
	///////////////////////// setters ////////////////////////
	public void setNom(String newFirstName) {
		nom = newFirstName;
	}	
	public void setPrenom(String newLastName) {
		prenom = newLastName;
	}
	public void setAdresse(AdressePostale newAdress) {
		adressePostale = newAdress;
	}
	
	////////////////////////// getters //////////////////////
	public void getPersonne() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	public void getNom() {
		System.out.println(nom.toUpperCase());
	}
	public void getPrenom() {
		System.out.println(prenom);
	}
	public void getAdresse() {
		System.out.println(adressePostale);
	}
	
	@Override // click right + source + generate toString()
	public String toString() {
		return nom + " " + prenom + " " + adressePostale;
	}
	
}
