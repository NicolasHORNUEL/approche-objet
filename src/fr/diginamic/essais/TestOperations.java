package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		Operations calcul1 = new Operations();
		
		System.out.println(calcul1.calcul(1.5,1.0,'+'));
		System.out.println(calcul1.calcul(1.5,1.0,'-'));
		System.out.println(calcul1.calcul(1.5,2.0,'*'));
		System.out.println(calcul1.calcul(1.5,1.5,'/'));



	}

}
