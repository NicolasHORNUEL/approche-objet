package essais;

import entites.AdressePostale; // import nomdupackage.NomClasse;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale ap1 = new AdressePostale();
		ap1.numeroRue = 5;
		ap1.libelleRue = "des Maréchaux";
		ap1.codePostal = 44100;
		ap1.ville = "Nantes";
		
		AdressePostale ap2 = new AdressePostale();
		ap2.numeroRue = 85;
		ap2.libelleRue = "d'Antrain";
		ap2.codePostal = 35700;
		ap2.ville = "Rennes";
		
		System.out.println(ap1); // affiche l'adresse mémoire
	}

}
