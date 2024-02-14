package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	Soldat commandant;
	Soldat[] soldats = new Soldat[3];
	
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de creer un nouveau camp romain.");
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public boolean ajouterSoldat(Soldat soldat) {
		for (int i=0; i< soldats.length; i++) {
			if (soldats[i] == null) {
				soldat.parler(" Je mets mon épée au service de Rome dans le camp dirige par " + commandant.getNom());
				soldats[i] = soldat;
				return true;
			}
		}
		commandant.parler("Desole " + soldat.getNom() + " notre camp est complet !");
		return false;
	}
	
	public void afficherCamp() {
		String affichageCamp = "Le camp dirige par " + commandant.getNom() + " contient les soldats : \n";
		for (int i=0; i<soldats.length;i++) {
			if(soldats[i]!=null) {
				affichageCamp += "- " + soldats[i].getNom() + "\n"; 
			}
		}
		System.out.println(affichageCamp);
	}
	
	public void changerCommandant(Soldat soldat) {
		if(soldat.grade == Grade.CENTURION) {
			commandant = soldat;
			commandant.parler("Moi "+ commandant.getNom() + " je prends la direction du camp romain.");
		}
		else {
			soldat.parler("Je ne suis pas suffisamment grade pour prendre la direction du camp romain.");
		}
	}
	
}
