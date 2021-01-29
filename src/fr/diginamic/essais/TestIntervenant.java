package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie newSal = new Salarie("MICHELINE","Raymonde", 4500.0);
		System.out.println(newSal.getSalaire()+"\u20AC");
		
		Pigiste newPig = new Pigiste("FRATTE","Rosa", 10, 80.0);
		System.out.println(newPig.getSalaire()+"\u20AC");
		
		newSal.afficherDonnees();
		newPig.afficherDonnees();
		

	}

}
