package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Carcassonne", 47800);
		Ville v3 = new Ville("Narbonne", 53400);
		Ville v4 = new Ville("Lyon", 484000);
		Ville v5 = new Ville("Foix", 9700);
		Ville v6 = new Ville("Pau", 77200);
		Ville v7 = new Ville("Marseille", 850700);
		Ville v8 = new Ville("Tarbes", 40600);
		
		HashMap<String, Ville> map1 = new HashMap<String, Ville>();
		map1.put("Nice", v1);
		map1.put("Carcassonne", v2);
		map1.put("Narbonne", v3);
		map1.put("Lyon", v4);
		map1.put("Foix", v5);
		map1.put("Pau", v6);
		map1.put("Marseille", v7);
		map1.put("Tarbes", v8);
		
		int min = Integer.MAX_VALUE;
		String minKey = null;
		Iterator<String> iterCles = map1.keySet().iterator();
		//Iterator<Integer> iterCles = map1.values().iterator();
		while(iterCles.hasNext()) {
			String cleCourante = iterCles.next();
			Ville valeurCourante = map1.get(cleCourante);
			if (valeurCourante.getNbHabitant()<min) {
				min = valeurCourante.getNbHabitant();
				minKey = cleCourante;
			}
		}
		map1.remove(minKey);
		System.out.println(map1);


	}

}
