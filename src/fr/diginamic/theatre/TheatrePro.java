package fr.diginamic.theatre;

public class TheatrePro {

	private String nom;
	private Spectacle[] tab;

	public TheatrePro(String nom, Spectacle[] spectacles) {
		this.nom = nom;
		this.tab = spectacles;
	}

	public void ajouterSpectacle(Spectacle spectacle) {
			Spectacle[] newTab = new Spectacle[tab.length+1];
			newTab[tab.length] = spectacle;
			for (int i = 0; i < tab.length; i++) {
				newTab[i] = tab[i];			
			}
			tab = newTab;
	}
	
	public void inscrire(String nomSpectacle, int nbClients) {
		Spectacle spe = getSpectacle(nomSpectacle);
		if ( spe != null) {
			int nbInscrits = spe.getNbInscrits()+nbClients;
			if (nbInscrits<=spe.getCapaciteMax()) {
				spe.setNbInscrits(nbInscrits);
			} else {
				System.err.println("Complet!");
			}
		} else {
			System.err.println("Spectacle inconnu!");
		}
	}
	
	public double getRecetteTotale() {
		double recette = 0.0;
		for (int i = 0; i < tab.length; i++) {
			recette += tab[i].getNbInscrits() * tab[i].getTarif();			
		}
		return recette;		
	}
	
	public int getNbTotalClients() {
		int clients = 0;
		for (int i = 0; i < tab.length; i++) {
			clients += tab[i].getNbInscrits();			
		}
		return clients;	
	}
	
	public Spectacle getSpectacle(String nomSpectacle) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getNom()==nomSpectacle) {
				return tab[i];
			};			
		}
		return null;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Spectacle[] getSpectacles() {
		return tab;
	}

	public void setSpectacles(Spectacle[] spectacles) {
		this.tab = spectacles;
	}
	
	
	
	
}
