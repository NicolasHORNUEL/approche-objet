package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------");
		System.out.println("TP1 : créer et utiliser des classes");
		System.out.println("-------------------------------------");
		
		AdressePostale ap1 = new AdressePostale();
		ap1.numeroRue = 5;
		ap1.libelleRue = "rue des Maréchaux";
		ap1.codePostal = 44100;
		ap1.ville = "Nantes";	
		AdressePostale ap2 = new AdressePostale();
		ap2.numeroRue = 85;
		ap2.libelleRue = "rue d’Antrain";
		ap2.codePostal = 35700;
		ap2.ville = "Rennes";
		
		Personne p1 = new Personne();
		p1.nom = "Nanty";
		p1.prenom = "Isabelle";
		p1.adressePostale = ap1;			
		Personne p2 = new Personne();
		p2.nom = "Durand";
		p2.prenom = "Frédéric";
		p2.adressePostale = ap2;	
		
		System.out.println();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println();
		
		System.out.println("-------------------------------------");
		System.out.println("TP2 : instanciation et constructeurs");
		System.out.println("-------------------------------------");
		
		AdressePostale ap3 = new AdressePostale(5,"rue des Maréchaux",44100,"Nantes");	
		AdressePostale ap4 = new AdressePostale(19, "place de la mairie", 34000, "Montpellier");
		Personne p3 = new Personne("BORIS","Vian");		
		Personne p4 = new Personne("ALBERTO","Frederico", ap4);
		
		System.out.println();
		System.out.println(p3.nom+" "+p3.prenom);
		System.out.println(p4);
		System.out.println();
		
		System.out.println("-------------------------------------");
		System.out.println("TP3 :instances et méthodes");
		System.out.println("-------------------------------------");
		
		p3.getPersonne();
		System.out.println(p3.getAdresse());
		p3.setNom("LECLERC");
		p3.setPrenom("Philippe");
		p3.setAdresse(ap3);
		p3.getPersonne();
		System.out.println(p3.getAdresse());
		
		
	}

}
