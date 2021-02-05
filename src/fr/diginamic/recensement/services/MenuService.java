package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;

public abstract class MenuService {

	public abstract void traiter(Recensement recensement, Scanner scanner);
	
}
