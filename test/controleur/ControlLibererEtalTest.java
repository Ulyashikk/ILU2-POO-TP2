package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ControlLibererEtalTest {

	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
    private ControlLibererEtal controlLibererEtal;
    private Village village;

    @BeforeEach
    public void setUp() {
        controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
    }
	
	@Test
	public void testControlLibererEtal() {
		assertNotNull(controlLibererEtal, "constructeur ne renvoie pas null");
	}
	
	@Test
	public void testLibererEtal() {
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(null, village);
		controlPrendreEtal.prendreEtal("Obélix", "Menhirs", 20);
        String[] donneesEtal = controlLibererEtal.libererEtal("Obélix");
        assertNotNull(donneesEtal);
        assertEquals("true", donneesEtal[0]); 
        assertEquals("Obélix", donneesEtal[1]);
        assertEquals("Menhirs", donneesEtal[2]); 
        assertEquals("20", donneesEtal[3]); 
        assertEquals("20", donneesEtal[4]);     
    
	}
	
	@Test
	public void testisVendeur() {
		assertNotNull(controlTrouverEtalVendeur.trouverEtalVendeur("Asterix"));
	}
}
