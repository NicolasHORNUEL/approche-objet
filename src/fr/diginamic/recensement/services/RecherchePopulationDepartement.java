package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {		
		
		// CHOIX DU CODE DEPARTEMENT
		scanner.nextLine();
		System.out.print("Saisir un département : ");
		String nomDepartement = scanner.nextLine();
		
		// PARCOURS DE LA LISTE POUR TROUVER LES OBJETS VILLE, D'UN DEPARTEMENT DONNE PUIS CUMUL DES POPULATIONS ASSOCIEES
		List<Ville> liste = recensement.getLinesOutput();
		int popDepartement = 0;
		for (Ville ville : liste) {
			if (ville.getCodeDepartement().equals(nomDepartement)) {
				popDepartement += ville.getPopCommune();
			}			
		}
		
		// AFFICHAGE DU RESULTAT
		System.out.println("La Population du département " + nomDepartement + " est de " + popDepartement + " habitants.");
	}
	
}
