package fr.diginamic.operations;

public class Operations {

	private double a;
	private double b;
	private char operateur;
	
	public Operations() {
		
	}
	
	public Operations(double a, double b, char operateur) {
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}
	
	public double calcul(double a, double b, char operateur) {
		if (operateur=='+') {
			return a+b;
		} else if (operateur=='-') {
			return a-b;
		} else if (operateur=='*') {
			return a*b;
		} else if (operateur=='/') {
			return a/b;
		} else {
			return 0.0;
		}
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
	
	
}
