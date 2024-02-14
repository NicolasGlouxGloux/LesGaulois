package sites;

import personnages.Grade;
import personnages.Gaulois;
import personnages.Soldat;

public class Village {
	Gaulois chef;
	Gaulois[] villageois = new Gaulois[4];
	
	public Village(Gaulois chef) {
		this.chef = chef;
		chef.parler("Je suis un grand guerrier et je vais creer mon village ");
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public boolean ajouterVillageois(Gaulois gaulois) {
		for (int i=0; i< villageois.length; i++) {
			if (villageois[i] == null) {
				chef.parler("Bienvenue " + gaulois.getNom() + " !");
				villageois[i] = gaulois;
				return true;
			}
		}
		chef.parler("Desole " + gaulois.getNom() + "  mon village est deja  bien rempli.");
		return false;
	}
	
	public void afficherVillageois() {
		String affichageVillage = "Le village dirige par " + chef.getNom() + " est habite par : \n";
		for (int i=0; i<villageois.length;i++) {
			if(villageois[i]!=null) {
				affichageVillage += "- " + villageois[i].getNom() + "\n"; 
			}
		}
		System.out.println(affichageVillage);
	}
	
	public void changerChef(Gaulois gaulois) {
			chef.parler("Je laisse mon grand bouclier au grand " + gaulois.getNom() );
			chef = gaulois;
			chef.parler("Merci !");
	}
	
	
	

}
