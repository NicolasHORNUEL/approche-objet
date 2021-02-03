package fr.diginamic.InterfaceGeometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		

		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		
		Cercle cerc = new Cercle(10.0);
		Rectangle rect = new Rectangle(12.3, 5.8);
		
		tab[0] = cerc;
		tab[1] = rect;
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i].getClass().getSimpleName());
			System.out.print(" : Périmetre : " + tab[i].perimetre());
			System.out.println(". Surface : " + tab[i].surface());
		}

	}

}
