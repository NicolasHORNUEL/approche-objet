package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.services.RecherchePopulationDepartement;
import fr.diginamic.recensement.services.RecherchePopulationRegion;
import fr.diginamic.recensement.services.RecherchePopulationVille;
import fr.diginamic.recensement.services.Top10Departements;
import fr.diginamic.recensement.services.Top10Regions;
import fr.diginamic.recensement.services.Top10VillesDepartement;
import fr.diginamic.recensement.services.Top10VillesPays;
import fr.diginamic.recensement.services.Top10VillesRegion;

public class Application {

	public static void main(String[] args) throws IOException {
		
		//INSTANCIER TOUTES LES VILLES DU FICHIER DANS UNE NOUVELLE LISTE
		Recensement recensement = new Recensement("../../recensement.csv");
		
		//AFFICHAGE DU MENU
		String menu = 
				"MENU RECENSEMENT :" + "\n" +
				"------------------------------------------------------------" + "\n" +
				"1. Population d’une ville donnée" + "\n" +
				"2. Population d’un département donné" + "\n" +
				"3. Population d’une région donnée" + "\n" +
				"4. Afficher les 10 régions les plus peuplées" + "\n" +
				"5. Afficher les 10 départements les plus peuplés" + "\n" +
				"6. Afficher les 10 villes les plus peuplées d’un département" + "\n" +
				"7. Afficher les 10 villes les plus peuplées d’une région" + "\n" +
				"8. Afficher les 10 villes les plus peuplées de France" + "\n" +
				"9. Sortir" + "\n" +
				"------------------------------------------------------------" + "\n" +
				"Choisir une option : ";
		System.out.print(menu);
		
		//OUVERTURE DU SCANNER
		Scanner scanner = new Scanner(System.in);
		int choix = scanner.nextInt();
		
		//INTERACTION ET AFFICHAGE RESULTAT SELON LE CHOIX DE L'UTILISATEUR
		while (choix != 9) {
			switch (choix) {
			case 1 :
				RecherchePopulationVille rechercheVil = new RecherchePopulationVille();
				rechercheVil.traiter(recensement,scanner);
				break;
			case 2 :
				RecherchePopulationDepartement rechercheDep = new RecherchePopulationDepartement();
				rechercheDep.traiter(recensement,scanner);
				break;
			case 3 : 
				RecherchePopulationRegion rechercheReg = new RecherchePopulationRegion();
				rechercheReg.traiter(recensement,scanner);
				break;
			case 4 :
				Top10Regions recherche10Reg = new Top10Regions();
				recherche10Reg.traiter(recensement,scanner);
				break;
			case 5 :
				Top10Departements recherche10Dep = new Top10Departements();
				recherche10Dep.traiter(recensement,scanner);
				break;
			case 6 :
				Top10VillesDepartement VilDep = new Top10VillesDepartement();
				VilDep.traiter(recensement,scanner);
				break;
			case 7 :
				Top10VillesRegion VilReg = new Top10VillesRegion();
				VilReg.traiter(recensement,scanner);
				break;
			case 8 :
				Top10VillesPays VilPay = new Top10VillesPays();
				VilPay.traiter(recensement,scanner);
				break;
			default :
				System.out.println( "Veuillez saisir une option existante :" );
			    break;					
			}
			System.out.println("------------------------------------------------------------");
			System.out.print("RETOUR MENU Y/N : ");
			scanner.nextLine();
			String retourMenu = scanner.nextLine();
			if (retourMenu.equals("Y")) {
				System.out.println();
				System.out.print(menu);
				choix = scanner.nextInt();
			} else {
				System.out.print("Choisir une option : ");
				choix = scanner.nextInt();
			}
	
		}
		
		//FERMETURE DU SCANNER
	    scanner.close();
	    System.err.println("SORTIE" );
		
	}

}
