package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class Top10VillesDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// CHOIX DU DEPARTEMENT
		scanner.nextLine();
		System.out.print("Saisir un département : ");
		String nomDepartement = scanner.nextLine();
		
		// AJOUTER LES OBJETS VILLE DU DEPARTEMENT CHOISI DANS UNE NOUVELLE LISTE
		List<Ville> liste = recensement.getLinesOutput();
		List<Ville> newliste = new ArrayList<>();
		for (Ville ville : liste) {
			String dep = ville.getCodeDepartement();
			if (dep.equals(nomDepartement)) {
				newliste.add(ville);
			}
		}
		
		// TRI DE LA NOUVELLE LISTE D'OBJETS VILLE AVEC L'INTERFACE COMPARABLE
		Collections.sort(newliste);
		
		// AFFICHAGE SELECTIF
		System.out.print("Voici les 10 villes les plus peuplées du département ");
		System.out.println(nomDepartement + " :");
		for (int i = 0; i < 10; i++) {
			System.out.println(newliste.get(i).getNomCommune());
		}
		
	}	

}
