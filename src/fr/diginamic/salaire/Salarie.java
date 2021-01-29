package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaireMensuel;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaireMensuel = salaire;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	

}
