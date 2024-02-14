package personnages;

public class Gaulois extends Personnage{
	private double puissancePotion = 1;
	private int forceOrigine;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
		forceOrigine = force;
	}
	
	@Override
	protected String donnerAuteur() {
		return "gaulois";
	}
	
	@Override
	protected int ajusterForceFrappe () {
		int forceFrappe = super.ajusterForceFrappe();
		if(puissancePotion > 1) {
			puissancePotion = puissancePotion - 0.5;
			forceFrappe = forceFrappe * (int)puissancePotion;
		}
		return forceFrappe;
	}
	
	
	public void recevoirPotion(double potion) {
		this.puissancePotion = potion;
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
	}
}
