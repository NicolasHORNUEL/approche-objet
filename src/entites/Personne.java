package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String p, AdressePostale ap) {
		this.nom = nom;
		prenom = p;
		adressePostale = ap;
		
	}

	// clic droit / source / generate toString()
	@Override
	public String toString() {
		return nom + " " + prenom + " " + adressePostale;
	}
	
	
}
