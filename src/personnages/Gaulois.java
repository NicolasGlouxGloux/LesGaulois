package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois (String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public void parler (String texte) {
		System.out.println("le gaulois " + nom + " : " + texte);
	}
	
//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Astérix", 8);
//		System.out.println(asterix.getNom());
//	}
}
