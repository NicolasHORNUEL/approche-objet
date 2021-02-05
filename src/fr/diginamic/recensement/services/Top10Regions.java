package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Region;
import fr.diginamic.recensement.entites.Ville;

public class Top10Regions extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {	
		
		// INSTANCE D'UN COMPTEUR DE POPULATION PAR NOM DE REGION DANS UNE HASHMAP
		List<Ville> liste = recensement.getLinesOutput();
		HashMap<String, Integer> mapNbRegion = new HashMap<String, Integer>();
		for (int i = 0; i < liste.size(); i++) {
			String nom = liste.get(i).getNomRegion();
			Integer compteur = mapNbRegion.get(nom);
			if (compteur == null) {
				compteur = liste.get(i).getPopCommune();
			} else {
				compteur += liste.get(i).getPopCommune();
			}
			mapNbRegion.put(nom, compteur);
		}		
		
		// ITERATION DE LA MAP POUR INSTANCIER UNE LISTE D'OBJETS REGION
		Iterator<String> iterCles = mapNbRegion.keySet().iterator();
		List<Region> regions = new ArrayList<>();
		while(iterCles.hasNext()) {
			String nom = iterCles.next();
			Integer compteur = mapNbRegion.get(nom);
			regions.add(new Region(nom, compteur));
		}
		
		// TRI DE LA NOUVELLE LISTE D'OBJETS REGION AVEC L'INTERFACE COMPARABLE
		Collections.sort(regions);
		
		// AFFICHAGE SELECTIF
		System.out.println("Voici les 10 régions les plus peuplées de France : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(regions.get(i).getNomRegion());
		}		
	}
	
}
