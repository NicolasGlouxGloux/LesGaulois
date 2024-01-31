package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois{
	private Potion potion;
	private Random random;
	
	public Druide(String nom, int force) {
		super(nom, force);
	}
		
	public Potion fabriquerPotion(int nbDoses) {
		try {
			random = SecureRandom.getInstanceStrong();
			int forcePotion = random.nextInt(6)+2;
			potion = new Potion (nbDoses, );
			int forcePotion = potion.getForce();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return potion;
	}

	@Override
	protected String auteur() {
		return "Le Druide ";
	}
}
