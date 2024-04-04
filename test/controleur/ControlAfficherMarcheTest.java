package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ControlAfficherMarcheTest {

	private Village village;
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
	}

	@Test
	void testControlAfficherMarche() {
		ControlAfficherMarche ControlAfficherMarche = new ControlAfficherMarche(village);
		assertNotNull(ControlAfficherMarche, "Constructeur ne renvoie pas null");
	}
	
	@Test
	void testdonnerinfosMarche() {
		//charger des donnees et tester
	}

}
