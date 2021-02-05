package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {		
		
		// CHOIX DU NOM DE LA REGION
		scanner.nextLine();
		System.out.print("Saisir une région : ");
		String nomRegion = scanner.nextLine();
		
		// PARCOURS DE LA LISTE POUR TROUVER LES OBJETS VILLE, D'UN NOM DE REGION DONNE PUIS CUMUL DES POPULATIONS ASSOCIEES
		List<Ville> liste = recensement.getLinesOutput();
		int popRegion = 0;
		for (Ville ville : liste) {
			if (ville.getNomRegion().equals(nomRegion)) {
				popRegion += ville.getPopCommune();
			}
		}
		
		// AFFICHAGE DU RESULTAT
		System.out.println("La Population de la région " + nomRegion + " est de " + popRegion + " habitants.");
	}
	
}
