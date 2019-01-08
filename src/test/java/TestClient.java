/*
import static org.junit.Assert.*;

//import org.junit.After;
import com.bankonet.entity.Client;
import com.bankonet.entity.Compte;
import com.bankonet.entity.CompteCourant;
import com.bankonet.entity.CompteEpargne;
import org.junit.Before;
import org.junit.Test;

public class TestClient {

	CompteCourant compteCourant1;
	CompteEpargne compteEpargne1;
	Client client1;
	CompteCourant compteCourant2;
	CompteEpargne compteEpargne2;
	Client client2;
	CompteCourant compteCourant3;
	Client client3;
	Compte compte1;

	Client[] clientTab;

	@Before
	public void setUp() throws Exception {

		compteCourant1 = new CompteCourant("1", "CC1", 100, -500);
		compteCourant2 = new CompteCourant("2", "CC2", 0, -500);
		compteCourant3 = new CompteCourant("3", "CC3", 0, -500);

		compteEpargne1 = new CompteEpargne("1", "CEP1", 0, 0);
		compteEpargne2 = new CompteEpargne("2", "CEP2", 0, 0);
		
		compte1 = new CompteCourant("1", "CC1", 100, -500);

		client1 = new Client("Id1", "Eponge", "Bob", compte1);
		client2 = new Client("Id2", "Wisnieski", "Theo",compte1);
		client3 = new Client("Id3", "Figgis", "Cyril", compte1);

		clientTab = new Client[3];

		clientTab[0] = client1;
		clientTab[1] = client2;
		clientTab[2] = client3;
		
		for(int i=0; i < clientTab.length; i++ ) {
			System.out.println(clientTab[i].toString());
			
		}
		
		System.out.println(compte1.toString());
	}

	// @After
	//// public void tearDown() {
	//// CompteCourant.setNbComptesCourants(0);
	//// }

	
	@Test
	public final void testCalculAvoirGlobal() {

		assertEquals(100, client1.calculerAvoirGlobal(), 0);

	}
	
	@Test
	public final void testDebit() {
		
		compteCourant1.debiter(20000);

		assertEquals(100, compteCourant1.getSolde(), 0);

	}
	
	
	
	
	
}*/
