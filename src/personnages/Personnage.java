package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	public String getNom() {
		return nom;
	}
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	protected abstract String donnerAuteur();

	public void parler(String texte) {
		System.out.println("le gaulois " + nom + " : " + texte);
	}
	
	
	public void frapper(Personnage adversaire) {
		System.out.println(donnerAuteur() + " envoie un grand coup dans la mâchoire de " + adversaire.getNom());
		adversaire.recevoirCoup(force / 3);
	}
	
	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force <= 0) {
			force = 0;
			this.parler("J'abandonne");
		} else {
			this.parler("Aîe !");
		}
	}
}