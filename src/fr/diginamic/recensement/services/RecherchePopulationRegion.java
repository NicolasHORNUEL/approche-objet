package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {		
		scanner.nextLine();
		System.out.print("Saisir une région : ");
		List<Ville> liste = recensement.getLinesOutput();
		String nomRegion = scanner.nextLine();
		int popRegion = 0;
		for (int i = 0; i < liste.size(); i++) {
			Ville ville = liste.get(i);	
			if (ville.getNomRegion().equals(nomRegion)) {
				popRegion += ville.getPopCommune();
			}
		}
		System.out.println("La Population de la région " + nomRegion + " est de " + popRegion + " habitants.");
	}
	
}
