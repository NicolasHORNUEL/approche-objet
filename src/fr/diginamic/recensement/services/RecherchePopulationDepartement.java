package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

/**
 * @author nicolas
 * Cette classe hérite d'une classe et méthode abstraite.
 * C'est une classe de service.
 * Elle permet d'afficher la population d'un département donné.
 */
public class RecherchePopulationDepartement extends MenuService {

	/**
	 * Redefinition de méthode.
	 * Signature identique à la méthode mère.
	 * @param recensement est une liste d'objet Ville
	 * @param scanner est une instance de la classe java.util.Scanner
	 */
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
