package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;

/**
 * @author nicolas
 * Classe mère abstraite pour normaliser l'appel de méthode.
 */
public abstract class MenuService {

	/**
	 * Méthode abstraite à redéfinir obligatoirement dans les classes filles.
	 * Avec la même signature.
	 * @param recensement est une liste d'objet Ville
	 * @param scanner est une instance de la classe java.util.Scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner);
	
}
