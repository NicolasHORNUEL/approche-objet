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
		
		// INSTANCIER TOUTES LES VILLES D'UN DEPARTEMENT DONNE
		List<Ville> liste = recensement.getLinesOutput();
		List<Ville> newliste = new ArrayList<>();
		for (int i = 0; i < liste.size(); i++) {
			Ville vil = liste.get(i);
			String dep = vil.getCodeDepartement();
			if (dep.equals(nomDepartement)) {
				newliste.add(vil);
			}
		}
		
		// TRI DE LA NOUVELLE LISTE
		Collections.sort(newliste);
		System.out.print("Voici les 10 villes les plus peuplées du département ");
		System.out.println(nomDepartement + " :");
		for (int i = 0; i < 10; i++) {
			System.out.println(newliste.get(i).getNomCommune());
		}
		
	}	

}
