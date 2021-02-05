package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

/**
 * @author nicolas
 * Cette classe hérite d'une classe et méthode abstraite.
 * C'est une classe de service.
 * Elle permet d'afficher la population d'une ville donnée.
 */
public class RecherchePopulationVille extends MenuService {

	/**
	 * Redefinition de méthode.
	 * Signature identique à la méthode mère.
	 * @param recensement est une liste d'objet Ville
	 * @param scanner est une instance de la classe java.util.Scanner
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {	
		
		// CHOIX DU NOM DE LA VILLE
		scanner.nextLine();
		System.out.print("Saisir une ville : ");
		String nomVille = scanner.nextLine();
		
		// PARCOURS DE LA LISTE POUR TROUVER UN OBJET VILLE, SELON UN NOM PUIS OBTENIR LA POPULATION ASSOCIEE
		List<Ville> liste = recensement.getLinesOutput();
		int popVille = 0;
		for (Ville ville : liste) {
			if (ville.getNomCommune().equals(nomVille)) {
				popVille = ville.getPopCommune();
			}	
		}
		
		// AFFICHAGE DU RESULTAT
		System.out.println("La Population de " + nomVille + " est de " + popVille + " habitants.");		
	}

	
}
