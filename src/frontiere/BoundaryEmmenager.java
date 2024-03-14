package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println("Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					emmenagerGalois(nomVisiteur);
					break;

				default:
					System.out.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Bienvenue druide ");
		chaine.append(nomVisiteur);
		System.out.println(chaine.toString());
		StringBuilder questionDruide = new StringBuilder();
		questionDruide.append("\nQuelle est votre force ?\n");
		int force = Clavier.entrerEntier(questionDruide.toString());
		questionDruide.append("\nQuelle est la force de potion la plus faible que vous produisez ?\n");
		int potionMin = Clavier.entrerEntier(questionDruide.toString());
		questionDruide.append("\nQuelle est la force de potion la plus forte que vous produisez ?\n");
		int potionMax = Clavier.entrerEntier(questionDruide.toString());
		System.out.println("Le druide " + nomVisiteur + " : 'Bonjour, je suis le druide " + nomVisiteur + 
				" et ma potion peut aller d'une force " + potionMin + " à " + potionMax + ".'\n");
		controlEmmenager.ajouterDruide(nomVisiteur, force, potionMin, potionMax);
	}
	
	private void emmenagerGalois(String nomVisiteur) {
		System.out.print("Bienvenue villegeois " + nomVisiteur);
		StringBuilder chaine = new StringBuilder();
//		chaine.append("Bienvenue villegeois ");
//		chaine.append(nomVisiteur);
//		System.out.println(chaine.toString());
		StringBuilder questionGaulois = new StringBuilder();
		questionGaulois.append("\nQuelle est votre force ?\n");
		System.out.println(chaine.toString());
		int force = Clavier.entrerEntier(questionGaulois.toString());
		controlEmmenager.ajouterGaulois(nomVisiteur, force);
	}
}
