package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);

	private String libelle;
	private int ordre;
	
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public static Saison getIntance(String libelle) {
		Saison result = null;
		for (Saison string : Saison.values()) {
			String nom = string.toString();
			Saison saison = Saison.valueOf(nom);
			if (saison.getLibelle().equals(libelle)) {
				result = saison;
			}
		};
		return result;
		
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	
}
