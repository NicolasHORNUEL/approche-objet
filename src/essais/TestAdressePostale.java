package essais;

import entites.AdressePostale; // import nomdupackage.NomClasse;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale ap1 = new AdressePostale(5,"rue des Maréchaux",44100,"Nantes");
		AdressePostale ap2 = new AdressePostale(19, "place de la mairie", 34000, "Montpellier");

		
		System.out.println(ap2);
	}

}
