package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre th = new Theatre("OnRigoleBienIci", 36, 1, 15000);

		th.inscrire(3, 9.50);
		th.inscrire(4, 9.50);
		th.inscrire(1, 10.50);
		th.inscrire(3, 9.50);
		th.inscrire(10, 8.00);
		th.inscrire(14, 10.50);

	}

}
