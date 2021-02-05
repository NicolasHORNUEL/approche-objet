package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class Top10VillesRegion  extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// CHOIX DE LA REGION
		scanner.nextLine();
		System.out.print("Saisir une région : ");
		String nomRegion = scanner.nextLine();
		
		// INSTANCIER TOUTES LES VILLES D'UNE REGION DONNE
		List<Ville> liste = recensement.getLinesOutput();
		List<Ville> newliste = new ArrayList<>();
		for (int i = 0; i < liste.size(); i++) {
			Ville vil = liste.get(i);
			String dep = vil.getNomRegion();
			if (dep.equals(nomRegion)) {
				newliste.add(vil);
			}
		}
		
		// TRI DE LA NOUVELLE LISTE
		Collections.sort(newliste);
		System.out.print("Voici les 10 villes les plus peuplées de la région ");
		System.out.println(nomRegion + " :");
		for (int i = 0; i < 10; i++) {
			System.out.println(newliste.get(i).getNomCommune());
		}
		
	}	

}
