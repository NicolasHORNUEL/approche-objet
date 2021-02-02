package listes;

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
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).getNbHabitant() > popMax) {
				popMax = liste1.get(i).getNbHabitant();
				ville = liste1.get(i).getNom();
			}
		}
		System.out.println(ville + " est la ville la plus peuplée.");
		
		Iterator<Ville> iter = liste1.iterator();
		while (iter.hasNext()) {
			Ville vil = (Ville) iter.next();
			if (vil.getNbHabitant() < popMax) {
				popMax = vil.getNbHabitant();
			}
		}
		Iterator<Ville> ite = liste1.iterator();
		while (ite.hasNext()) {
			Ville vi = (Ville) ite.next();
			if (vi.getNbHabitant() >= 100000) {
				String v = vi.getNom().toUpperCase();
				vi.setNom(v);
			}
			if (vi.getNbHabitant() == popMax) {
				ite.remove();
			}
		}
		System.out.println(liste1);

	}

}
