package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Carcassonne", 47800);
		Ville v3 = new Ville("Narbonne", 53400);
		Ville v4 = new Ville("Lyon", 484000);
		Ville v5 = new Ville("Foix", 9700);
		Ville v6 = new Ville("Pau", 77200);
		Ville v7 = new Ville("Marseille", 850700);
		Ville v8 = new Ville("Tarbes", 40600);
		
		ArrayList<Ville> liste1 = new ArrayList<>(Arrays.asList
				(v1,v2, v3, v4, v5, v6,v7,v8));

		int popMax = 0;
		String ville = null;
		// City with maximum population
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).getNbHabitant() > popMax) {
				popMax = liste1.get(i).getNbHabitant();
				ville = liste1.get(i).getNom();
			}
		}
		System.out.println(ville + " est la ville la plus peuplée.");		
		// Population minimum
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).getNbHabitant() < popMax) {
				popMax = liste1.get(i).getNbHabitant();
			}
		}
		// Remove iterator whose pop is minimum
		Iterator<Ville> iterator = liste1.iterator();
		while (iterator.hasNext()) {
			Ville v = (Ville) iterator.next();
			if (v.getNbHabitant() == popMax) {
				iterator.remove();
			} else if (v.getNbHabitant() >= 100000) {
				v.setNom(v.getNom().toUpperCase());
			}
		}
		System.out.println(liste1);

		//Override Equals
		Ville v9 = new Ville("Marseille", 850700);
		Ville v10 = new Ville("Marseille", 850701);
		if (v9.equals(v10)) {
			System.out.println("Les villes sont identiques");
		} else {
			System.out.println("Les villes sont différentes");
		}
		v10 = v9;
		if (v9 == v10) {
			System.out.println("Les villes sont identiques");
		} else {
			System.out.println("Les villes sont différentes");
		}
		
	}

}
