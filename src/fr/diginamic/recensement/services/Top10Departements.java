package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Departement;
import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class Top10Departements extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// INSTANCE D'UN COMPTEUR DE POPULATION PAR CODE DEPARTEMENT DANS UNE HASHMAP
		List<Ville> liste = recensement.getLinesOutput();
		HashMap<String, Integer> mapNbDepartement = new HashMap<String, Integer>();
		for (int i = 0; i < liste.size(); i++) {
			String nom = liste.get(i).getCodeDepartement();
			Integer compteur = mapNbDepartement.get(nom);
			if (compteur == null) {
				compteur = liste.get(i).getPopCommune();
			} else {
				compteur += liste.get(i).getPopCommune();
			}
			mapNbDepartement.put(nom, compteur);
		}		
		
		// ITERATION DE LA MAP POUR INSTANCIER UNE LISTE D'OBJETS DEPARTEMENT
		Iterator<String> iterCles = mapNbDepartement.keySet().iterator();
		List<Departement> departements = new ArrayList<>();
		while(iterCles.hasNext()) {
			String nom = iterCles.next();
			Integer compteur = mapNbDepartement.get(nom);
			departements.add(new Departement(nom, compteur));
		}
		
		// TRI DE LA NOUVELLE LISTE D'OBJETS DEPARTEMENT AVEC L'INTERFACE COMPARABLE
		Collections.sort(departements);
		
		// AFFICHAGE SELECTIF
		System.out.println("Voici les 10 départements les plus peuplées de France :");
		for (int i = 0; i < 10; i++) {
			System.out.println(departements.get(i).getCodeDepartement());
		}

		
	}	
}
