package org.pmobo.packlaborategia2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PertsonaTest {
	
	Pertsona p1;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Pertsona(13, "IZEN ABIZEN", 17, "Estatu Batuak", "O-");
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
	}

	//@Test

	@Test
	public void testPertsonaIntStringIntStringString() {
		
		assertNotNull(p1);
		assertEquals(p1.getIdPertsona(),13);
		
	}

	@Test
	public void testIdBerdinaDu() {
		
		//id-ak berdinak dira
		
		Pertsona p2 = new Pertsona(13, "Pepe Null", 14, "Etiopia", "O-");
		
		assertTrue(p1.idBerdinaDu(p2));
		assertTrue(p2.idBerdinaDu(p1));
		assertTrue(p1.idBerdinaDu(p1));
		
		//id-ak desberdinak dira
		
		p2 = new Pertsona(12,"Pepe NoNull", 15, "Erresuma Batua","AB+");
		
		assertFalse(p1.idBerdinaDu(p2));
	}

	@Test
	public void testGidatuDezake() {
		Pertsona p2 = new Pertsona(12,"Pepe NoNull", 14, "Etiopia","AB+");
		//EtiopiaGidatuDezake
		
		assertTrue(p2.gidatuDezake());
		
		p2 = new Pertsona(12,"Pepe NoNull", 13, "Etiopia","AB+");
		assertFalse(p2.gidatuDezake());
		
		//australia edo estatu batuakGidatuDezake
		p2 = new Pertsona(15, "Pepe YesNull",16,"Australia","A+");
		assertTrue(p2.gidatuDezake());
		p2 = new Pertsona(15, "Pepe YesNull",16,"Estatu Batuak","A+");
		assertTrue(p2.gidatuDezake());
		
		p2 = new Pertsona(15, "Pepe YesNull",15,"Australia","A+");
		assertFalse(p2.gidatuDezake());
		p2 = new Pertsona(15, "Pepe YesNull",15,"Estatu Batuak","A+");
		assertFalse(p2.gidatuDezake());
		
		//Erresuma Batua
		
		p2 = new Pertsona(15, "Pepe YesNull",17,"Erresuma Batua","A+");
		assertTrue(p2.gidatuDezake());
		
		p2 = new Pertsona(15, "Pepe YesNull",16,"Erresuma Batua","A+");
		assertFalse(p2.gidatuDezake());
		
		//Beste guztiak
		
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertTrue(p2.gidatuDezake());
		
		p2 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","A+");
		assertFalse(p2.gidatuDezake());
	}

	@Test
	public void testDonatuDiezaioke() {
		Pertsona p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","O-");
		//Emailea guztiei eman diezake(O-)
		Pertsona p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertTrue(p3.donatuDiezaioke(p2));
		
		//Emailea O+
		p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","O+");
		//Emailea doantu dezake
		
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertTrue(p3.donatuDiezaioke(p2));
		
		//Emailea ezin du donatu
		
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertFalse(p3.donatuDiezaioke(p2));
		
		//Emailea B-
		p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","B-");
		//Emailea donatu dezake
		
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertTrue(p3.donatuDiezaioke(p2));
		
		//Emailea ezin du donatu
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertFalse(p3.donatuDiezaioke(p2));
		
		//Emailea A-
		p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","A-");
		//Emailea donatu dezake
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertTrue(p3.donatuDiezaioke(p2));
		
		//Emailea ezin du donatu
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertFalse(p3.donatuDiezaioke(p2));
		
		//Emailea B+
		p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","B+");
		//Emailea donatu dezake
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertTrue(p3.donatuDiezaioke(p2));
		
		//Emailea ezin du donatu
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertFalse(p3.donatuDiezaioke(p2));
		
		//Emailea A+
		p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","A+");
		//Emailea donatu dezake
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertTrue(p3.donatuDiezaioke(p2));
		
		//Emailea ezin du donatu
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertFalse(p3.donatuDiezaioke(p2));
		
		//Emailea AB-
		p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","AB-");
		//Emailea donatu dezake
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertTrue(p3.donatuDiezaioke(p2));	
		
		//Emailea ezin du donatu
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertFalse(p3.donatuDiezaioke(p2));
		
		//Emailea AB+
		p3 = new Pertsona(15, "Pepe YesNull",16,"Mozambique","AB+");
		//Emailea donatu dezake
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB+");
		assertTrue(p3.donatuDiezaioke(p2));
		
		//Emailea ezin du donatu
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","A-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","B-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O+");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","O-");
		assertFalse(p3.donatuDiezaioke(p2));
		p2 = new Pertsona(15, "Pepe YesNull",18,"Mozambique","AB-");
		assertFalse(p3.donatuDiezaioke(p2));
		
	}
	
	@Test
	public void testGetAbizenarenIniziala() {
		Pertsona p4 = new Pertsona(12,"Yassin Mehani",18,"Aljeria","B+");
		assertEquals('M',p4.getAbizenarenIniziala());
	}
	
	@Test
	public void testGetIzenarenIniziala() {
		Pertsona p4 = new Pertsona(12,"Yassin Mehani",18,"Aljeria","B+");
		assertEquals('Y',p4.getIzenarenIniziala());
	}
}
