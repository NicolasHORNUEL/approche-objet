package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class TriVille {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));

		// Collections.sort(villes);		
		//Collections.sort(villes, new ComparatorHabitant());
		Collections.sort(villes, new ComparatorNom());

		System.out.println(villes);
		
	}

}
