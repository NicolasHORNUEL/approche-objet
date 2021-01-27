package essais;

import entites.AdressePostale; // import nomdupackage.NomClasse;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------");
		System.out.println("TP1 : créer et utiliser des classes");
		System.out.println("-------------------------------------");
		
		AdressePostale ap1 = new AdressePostale();
		ap1.numeroRue = 5;
		ap1.libelleRue = "des Maréchaux";
		ap1.codePostal = 44100;
		ap1.ville = "Nantes";
		AdressePostale ap2 = new AdressePostale();
		ap2.numeroRue = 85;
		ap2.libelleRue = "d’Antrain";
		ap2.codePostal = 35700;
		ap2.ville = "Rennes";
		
		System.out.println();
		System.out.println(ap1);
		System.out.println(ap2);
		System.out.println();

		System.out.println("-------------------------------------");
		System.out.println("TP2 : instanciation et constructeurs");
		System.out.println("-------------------------------------");
		
		AdressePostale ap3 = new AdressePostale(5,"rue des Maréchaux",44100,"Nantes");
		AdressePostale ap4 = new AdressePostale(19, "place de la mairie", 34000, "Montpellier");

		System.out.println();
		System.out.println(ap3);
		System.out.println(ap4);
		System.out.println();

	}

}
