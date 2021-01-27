package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale ap1 = new AdressePostale();
		ap1.numeroRue = 5;
		ap1.libelleRue = "des Maréchaux";
		ap1.codePostal = 44100;
		ap1.ville = "Nantes";
		
		Personne p1 = new Personne();
		p1.nom = "DURAND";
		p1.prenom = "Frédéric";
		p1.adressePostale = ap1;
		
		AdressePostale ap2 = new AdressePostale();
		ap2.numeroRue = 85;
		ap2.libelleRue = "d'Antrain";
		ap2.codePostal = 35700;
		ap2.ville = "Rennes";
		
		Personne p2 = new Personne();
		p2.nom = "DUPONT";
		p2.prenom = "Aurélie";
		p2.adressePostale = ap2;
		


	}

}
