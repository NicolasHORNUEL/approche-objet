package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		
		// Create map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Create map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		// Create map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		//map3.putAll(map2);
		Iterator<Integer> iterCles = map2.keySet().iterator();
		while(iterCles.hasNext()) {
			Integer cleCourante = iterCles.next();
			String valeurCourante = map2.get(cleCourante);
			map3.put(cleCourante, valeurCourante);
		}
		System.out.println(map3);

	}

}
