package fr.diginamic.recensement.services;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class Top10VillesPays  extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// OBTENIR LA LISTE EXISTANTE
		List<Ville> liste = recensement.getLinesOutput();
		
		// TRI DE LA LISTE D'OBJETS VILLE AVEC L'INTERFACE COMPARABLE
		Collections.sort(liste);
		
		// AFFICHAGE SELECTIF
		System.out.println("Voici les 10 villes les plus peuplées de France : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(liste.get(i).getNomCommune());
		}
		
	}	

}
