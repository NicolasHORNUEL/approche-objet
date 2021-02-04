package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		
		// java.nio.file.Paths with static method get(String)
		// java.nio.file.Path
		Path path = Paths.get("../../recensement.csv");
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		
		// java.nio.file.Files with static method
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);
		System.out.println(estFichier);
		System.out.println(estLisible);
		
		List<String> lines1 = Files.readAllLines(path);
		List<String> lines2 = new ArrayList<>();
		for (int i = 1; i < lines1.size(); i++) {
			String popS = lines1.get(i).split(";")[9];
			popS = popS.replaceAll(" ", "");
			int popI = Integer.parseInt(popS);
			if (popI > 25000){
				String nomVille = lines1.get(i).split(";")[6];
				String cpVille = lines1.get(i).split(";")[0];
				lines2.add(nomVille + ";" + cpVille + ";" + popS + ";");
			}
		}
		
		Path pathCible = Paths.get("src/fr/diginamic/fichier/recensement_copy.csv");
		Files.write(pathCible, lines2);
	}

}
