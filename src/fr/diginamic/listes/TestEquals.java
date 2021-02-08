package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		
		// Test Override Equals
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
