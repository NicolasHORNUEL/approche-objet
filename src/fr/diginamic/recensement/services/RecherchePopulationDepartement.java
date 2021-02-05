package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {		
		scanner.nextLine();
		System.out.print("Saisir un département : ");
		List<Ville> liste = recensement.getLinesOutput();
		String nomDepartement = scanner.nextLine();
		int popDepartement = 0;
		for (int i = 0; i < liste.size(); i++) {
			Ville ville = liste.get(i);	
			if (ville.getCodeDepartement().equals(nomDepartement)) {
				popDepartement += ville.getPopCommune();
			}
		}
		System.out.println("La Population du département " + nomDepartement + " est de " + popDepartement + " habitants.");
	}
	
}
