package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");		
		// Add
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");			
		// Browse map to show key
		Iterator<Integer> iterCles = mapVilles.keySet().iterator();
		while(iterCles.hasNext()) {
			Integer cleCourante = iterCles.next();
			System.out.println(cleCourante);
		}
		// Browse map to show value
		Iterator<String> iterValues = mapVilles.values().iterator();
		while (iterValues.hasNext()) {
			String valeurCourante = iterValues.next();
			System.out.println(valeurCourante);
		}
		// Show map size
		System.out.println(mapVilles.size());

	}

}
