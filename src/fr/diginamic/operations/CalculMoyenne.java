package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] tab;

	public CalculMoyenne() {
		tab = new double[0];
	}
	
	public void ajout(double d) {
		double[] newTab = new double[tab.length+1];
		newTab[tab.length] = d;
		for (int i = 0; i < tab.length; i++) {
			newTab[i] = tab[i];			
		}
		tab = newTab;
	}
	
	public double calcul() {
		double somme = 0.0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme/tab.length;
	}

	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}
	
	
}
