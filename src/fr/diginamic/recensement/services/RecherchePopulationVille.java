package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {		
		scanner.nextLine();
		System.out.print("Saisir une ville : ");
		List<Ville> liste = recensement.getLinesOutput();
		String nomVille = scanner.nextLine();
		int popVille = 0;
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNomCommune().equals(nomVille)) {
				popVille = liste.get(i).getPopCommune();
			}	
		}
		System.out.println("La Population de " + nomVille + " est de " + popVille + " habitants.");		
	}

	
}
