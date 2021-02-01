package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		
		Chambre ch1 = new Chambre(10.4,1);
		Chambre ch2 = new Chambre(10.4,1);
		Cuisine cui = new Cuisine(9.9,0);
		Salon salon = new Salon(33.3,0);
		SalleDeBain sdb1 = new SalleDeBain(6,0);
		SalleDeBain sdb2 = new SalleDeBain(8,0);
		WC wc1 = new WC(2.2,0);
		WC wc2 = new WC(2.1,1);
		
		Maison maison1 = new Maison();
		maison1.ajouterPiece(wc2);
		maison1.ajouterPiece(wc1);
		maison1.ajouterPiece(sdb2);
		maison1.ajouterPiece(sdb1);
		maison1.ajouterPiece(salon);
		maison1.ajouterPiece(cui);
		maison1.ajouterPiece(ch2);
		maison1.ajouterPiece(ch1);
		
		// CONTROLS
		maison1.ajouterPiece(null);
		WC wc3 = new WC(-1.1,-1);
		maison1.ajouterPiece(wc3);		
		
		System.out.println("Superficie Totale : " + maison1.getSuperficieTotale());
		System.out.println("Superficie RDC : " + maison1.getSuperficieParEtage(0));
		System.out.println("Superficie 1er étage : " + maison1.getSuperficieParEtage(1));
		System.out.println("Nombre de pièce totale : " + maison1.getTab().length);
		
		String typePiece = ch1.getClass().getSimpleName();
		System.out.print("Superficie totale du type " + typePiece + " : ");
		System.out.println(maison1.getSuperficieParType(typePiece));
		System.out.print("Nombre de pièce du type " + typePiece + " : ");
		System.out.println(maison1.getNombreParType(typePiece));

		
	}

}
