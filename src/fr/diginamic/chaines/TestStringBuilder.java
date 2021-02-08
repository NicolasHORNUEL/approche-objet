package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis();
		// Code à chronométrer
		StringBuilder builder = new StringBuilder();
		String s = null;
		for (int i = 1; i < 100_000; i++) {
			//builder.append(i); // 28 millisecondes
			String iString = Integer.toString(i);
			s += iString; // 9524 millisecondes	
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

	}

}
