/*
import static org.junit.Assert.*;

import com.bankonet.entity.CompteCourant;
import org.junit.Before;
import org.junit.Test;

public class testCompteCourant {

	CompteCourant compteCourant1;
	CompteCourant compteCourant2;
	CompteCourant compteCourant3;
	
	CompteCourant[] compteCourantTab;

	@Before
	public void setUp() throws Exception {
		
		compteCourant1 = new CompteCourant("1", "Bernard", 0, -500);
		compteCourant2 = new CompteCourant("2", "Paul", -200, -500);
		compteCourant3 = new CompteCourant("3", "Jack", 0, -500);
		

		compteCourantTab = new CompteCourant[3];
		
	    compteCourantTab[0] = compteCourant1;
	    compteCourantTab[1] = compteCourant2;
	    compteCourantTab[2] = compteCourant3;
	}

//	@After
//	public void tearDown() {
//		CompteCourant.setNbComptesCourants(0);
//	}

	@Test
	public final void testCredit() {

		compteCourant1.crediter(600);

		assertEquals(600, compteCourant1.getSolde(), 0);

	}

	@Test
	public final void testDebit() {

		compteCourant1.debiter(450);

		assertEquals(-450, compteCourant1.getSolde(), 0);

	}

	@Test
	public final void testString() {

		compteCourant1.toString();

		assertNotNull(compteCourant1.toString());

	}
	
	@Test
	public final void testToStringTab() {
		
		System.out.println(toString());

		assertEquals("Bonjour Bernard le solde de votre compte numero 1 est maintenant de 0.0", compteCourantTab[0].toString());

	}

}
*/
