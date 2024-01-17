package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public String getNom() {
		return nom;
	}

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println("le gaulois " + nom + " : " + texte);
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Astérix", 8);
//		System.out.println(asterix.getNom());
//	}
}
