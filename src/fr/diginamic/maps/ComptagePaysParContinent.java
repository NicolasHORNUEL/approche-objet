package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		
		Pays p1 = new Pays("France", 65_000_000, "Europe");
		Pays p2 = new Pays("Allemagne", 80_000_000, "Europe");
		Pays p3 = new Pays("Belgique", 10_000_000, "Europe");
		Pays p4 = new Pays("Russie", 150_000_000, "Asie");
		Pays p5 = new Pays("Chine", 1_400_000_000, "Asie");
		Pays p6 = new Pays("Indonésie", 220_000_000, "Océanie");
		Pays p7 = new Pays("Australie", 20_000_000, "Océanie");
		
		// List typing in Pays
		ArrayList<Pays> liste1 = new ArrayList<>(Arrays.asList
				(p1,p2,p3,p4,p5,p6,p7));

		// HashMap to count every country by continent : aggregation
		// key : continent String
		// value : number of country Integer
		HashMap<String, Integer> mapNbPays = new HashMap<>();
		
		for (int i = 0; i < liste1.size(); i++) {
			Pays pays = liste1.get(i);
			String continent = pays.getContinent();		
			Integer compteur = mapNbPays.get(continent);
			if (compteur == null) {
				compteur = 1;
			} else {
				compteur += 1;
			}
			mapNbPays.put(continent, compteur);
		}
		System.out.println(mapNbPays);
	}

}
