package entites;

public class AdressePostale { //public pour être visible dans d'autre package

		public int numeroRue;
		public String libelleRue;
		public int codePostal;
		public String ville;

		public AdressePostale(int num, String lib, int cp, String v) {
			numeroRue = num;
			libelleRue = lib;
			codePostal = cp;
			ville = v;
		}

		@Override
		public String toString() {
			return " " + numeroRue + ", " + libelleRue + " - "
					+ codePostal + " " + ville + ".";
		}

}
