package personnages;

public class Romain {
	private String nom;
	private int force;

	public String getNom() {
		return nom;
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println("le romain " + nom + " : " + texte);
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force <= 0) {
			force = 0;
			this.parler("J'abandonne");
		} else {
			this.parler("A�e !");
		}
	}

}
