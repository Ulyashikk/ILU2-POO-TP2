package controleur;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {

	private Village village;
	private Gaulois asterix;
	private Chef abraracourcix;
	ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		asterix = new Gaulois("Asterix", 6);
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
	}


	@Test
	void testControlTrouverEtalVendeur() {
		assertNotNull(controlTrouverEtalVendeur, "Constructeur ne renvoie pas null");
	}
	
	@Test
	void testTrouverEtalVendeur() {
        village.installerVendeur(asterix, "Menhirs", 20);
        Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur("Asterix");
        assertNotNull(village.rechercherEtal(asterix));
        assertNotNull(etal);
        assertEquals("Menhirs", etal.getProduit());
		
	}

}