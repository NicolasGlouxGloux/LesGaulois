package test_fonctionnel;

import java.util.Iterator;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour � tous");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
//		for (int i = 0; i<2; i++) {
//			minus.recevoirCoup(3);
//		}
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
	}
}
