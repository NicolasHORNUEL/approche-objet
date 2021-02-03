package fr.diginamic.essais;

import fr.diginamic.geometrie.entites.Spectacle;
import fr.diginamic.theatre.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {
		
		Spectacle[] spectacles = {
				new Spectacle("C'est arrivé à tous", "Comédie", 6.5, 20, 0),
				new Spectacle("On est pas bien là ?", "Comédie", 6.5, 20, 0),
				new Spectacle("On en veut encore", "Comédie", 6.5, 20, 0),
				new Spectacle("Une rencontre aléatoire", "Drame", 333.5, 2, 1),
				new Spectacle("Hip-Hop", "Dance", 7.5, 30, 0),
				new Spectacle("Metallica", "Concert", 45.0, 300, 0),
		};
		
		TheatrePro monTheatre = new TheatrePro("Bienvenue Chez Nous",spectacles);
		
		monTheatre.inscrire("C'est arrivé à tous", 10);
		monTheatre.inscrire("On est pas bien là ?", 3);
		monTheatre.inscrire("On en veut encore", 3);
		monTheatre.inscrire("Une rencontre aléatoire", 1);
		monTheatre.inscrire("Hip-Hop", 6);
		monTheatre.inscrire("Metallica", 60);
		
		System.out.println(monTheatre.getRecetteTotale());
		System.out.println(monTheatre.getNbTotalClients());
		
		
		//System.out.println(monTheatre.getSpectacles().length);
		Spectacle newSpe = new Spectacle("Motörhead", "Concert", 45.0, 300, 60);
		monTheatre.ajouterSpectacle(newSpe);
		//System.out.println(monTheatre.getSpectacles().length);
		System.out.println(monTheatre.getSpectacle("Motörhead").getNom());
	}

}
