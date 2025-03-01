package org.pmobo.packlaborategia5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class KatalogoaTest extends TestCase
{

	private Liburua l1;
	private Liburua l2;
	private Liburua l3;
	private Erabiltzailea e1;
	private Erabiltzailea e2;

	@Before
	public void setUp()
	{
		l1 = new Liburua("Construcción de software orientado a objetos", "Bertrand Meyer",1);
		l2 = new Liburua("Cien años de soledad", "Gabriel García Márquez",2); 
		l3 = new Liburua("El hobbit", "JRR Tolkien",3);
		new Liburua("El perfume", "Patrick Suskind",4);

		e1=new Erabiltzailea("Kepa Sarasola", 2);	
		e2=new Erabiltzailea("Armando Guerra", 1);


		Katalogoa.getKatalogoa().katalogatuLiburua(l1);
		Katalogoa.getKatalogoa().katalogatuLiburua(l2);
		Katalogoa.getKatalogoa().katalogatuLiburua(l3);

		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileariAltaEman(e1);
		ListaErabiltzaileak.getListaErabiltzaileak().erabiltzaileariAltaEman(e2);

	}

	@After
	public void tearDown()
	{
		l1 = null;
		l2 = null;
		l3 = null;

		e1=null;
		e2=null;

		Katalogoa.getKatalogoa().erreseteatu();
	}

	@Test
	public void testGetKatalogoa()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testBilatuLiburuaIdz()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testKatalogatuEtaDeskatalogatuLiburuaEtaErreseteatu()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testMailegatuEtaItzuliLiburua()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}
	
	@Test
	public void testInprimatu()
	{
		assertEquals(3, Katalogoa.getKatalogoa().liburuKopuru());

		System.out.println("\n===============================================================");
		System.out.println("\nKatalogoa klasearen inprimatu metodoaren proba kasua");
		System.out.println("\nKatalogo-zerrendaren informazioa honela pantailaratu beharko zen:\n");
		System.out.println("Katalogoak 3 titulu ditu guztira");
		System.out.println("* Construcción de software orientado a objetos, Bertrand Meyer-ek idatzia.");
		System.out.println("* Cien años de soledad, Gabriel García Márquez-ek idatzia.");
		System.out.println("* El hobbit, JRR Tolkien-ek idatzia.");

		System.out.println("\nEta zure programak honela pantailaratzen du:");
		Katalogoa.getKatalogoa().inprimatu();
		System.out.println("\n===============================================================");

		Katalogoa.getKatalogoa().deskatalogatuLiburua(1);
		Katalogoa.getKatalogoa().deskatalogatuLiburua(2);
		Katalogoa.getKatalogoa().deskatalogatuLiburua(3);
		assertEquals(0,Katalogoa.getKatalogoa().liburuKopuru());	

		fail("Begiratu sistemako kontsolan agertzen diren mezuak, eta dena ondo joan bada, ezabatu edo komentatu fail hau.");

	}

}
