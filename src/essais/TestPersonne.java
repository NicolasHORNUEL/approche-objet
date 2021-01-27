package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale ap1 = new AdressePostale(5,"rue des Maréchaux",44100,"Nantes");		
		Personne p1 = new Personne("DURAND","Frédéric",ap1);		
		Personne p2 = new Personne("DUPONT","Aurélie",new AdressePostale(19, "place de la mairie", 34000, "Montpellier"));
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
