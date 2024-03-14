package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		if ((nomVendeur = village.getNom()) != null)
			return true;
		
		Gaulois gaulois;
		gaulois = village.trouverHabitant(nomVendeur);
		return gaulois!=null;
	}
}
