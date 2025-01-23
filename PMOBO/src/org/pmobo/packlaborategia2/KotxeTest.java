package org.pmobo.packlaborategia2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KotxeTest {

	Pertsona p1,p2;
	Kotxe k1 = new Kotxe("9590BWD", "Renault");
	Kotxe k2 = new Kotxe("0073SCT", "Audi");
	Kotxe k3 = new Kotxe("0000ABC", "Ferrari");
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKotxe() {
		assertNotNull(k1);
		assertEquals(k1.getMatrikula(),"9590BWD");
	}

	@Test
	public void testAldatuJabea() {
		p1 = new Pertsona(13, "Yassin Mehani", 17, "Estatu Batuak", "O-");
		p2 = new Pertsona(12,"Juan Manuel Gonzalez",65,"Espainia","AB+");
		
		
	}

	@Test
	public void testJabeaAlDa() {
		p1 = new Pertsona(13, "Yassin Mehani", 17, "Estatu Batuak", "O-");
		p2 = new Pertsona(12,"Juan Manuel Gonzalez",65,"Espainia","AB+");
		k1.aldatuJabea(p1);
		k2.aldatuJabea(p2);
		k3.aldatuJabea(p1);
		
		assertTrue(k1.jabeaAlDa(p1));
		assertFalse(k1.jabeaAlDa(p2));
		assertFalse(k2.jabeaAlDa(p1));
		assertTrue(k3.jabeaAlDa(p1));
		assertFalse(k3.jabeaAlDa(p2));
		
	}

}
