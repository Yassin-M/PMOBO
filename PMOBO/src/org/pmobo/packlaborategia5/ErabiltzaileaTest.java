package org.pmobo.packlaborategia5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ErabiltzaileaTest extends TestCase
{

	Erabiltzailea erabiltzailea1, erabiltzailea2, erabiltzailea3;
	Liburua l1,l2,l3,l4;

	@Before
	public void setUp()
	{
		erabiltzailea1= new Erabiltzailea("Lola Mento",1099);
		erabiltzailea2= new Erabiltzailea("Joseba Laka",2);
		erabiltzailea3= new Erabiltzailea("Xabier Arto",1099);

		l1=new Liburua("El Cuaderno Dorado", "Doris Lessing",1);
		l2=new Liburua("Rayuela", "Julio Cortazar",2);
		l3=new Liburua("Paula", "Isabela Allende",3);
		l4=new Liburua("La sonrisa Etrusca", "Sampedro",4);
	}

	@After
	public void tearDown() {
		erabiltzailea1=null;
		l1=null;
		l2=null;
	}

	@Test
	public void testErabiltzailea()
	{
		//fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
		assertNotNull(erabiltzailea1);
		assertNotNull(erabiltzailea2);
		assertNotNull(erabiltzailea3);
	}

	@Test
	public void testMailegatzekoMaximoaGainditua()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testMaileguanDuEtaGehituLiburuaEtaKenduLiburua()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testIdHauDu()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testIdBerdinaDute()
	{
		fail("Proba-kasuak falta dira. Ezabatu edo komentatu fail hau behin eginda");
	}

	@Test
	public void testInprimatu()
	{	
		assertNotNull(erabiltzailea1);

		System.out.println("\n===============================================================");
		System.out.println("\nErabiltzailea klasearen inprimatu metodoaren proba kasua (0 liburu)");
		System.out.println("\nErabiltzailearen  informazioa honela pantailaratu beharko zen::\n");
		System.out.println("ID: 1099: Lola Mento");
		System.out.println("---> Ez dauka libururik maileguan.");

		System.out.println("\nEta zure programak honela pantailaratzen du:\n");
		erabiltzailea1.inprimatu();
		System.out.println("\n===============================================================");

		erabiltzailea1.gehituLiburua(l1);

		System.out.println("\nErabiltzailea klasearen inprimatu metodoaren proba kasua (liburu 1)");
		System.out.println("\nErabiltzailaren informazioa honela pantailaratu beharko zen:\n");
		System.out.println("ID: 1099: Lola Mento");
		System.out.println("---> Titulu honako hau dauka maileguan:");
		System.out.println("* El Cuaderno Dorado, Doris Lessing-ek idatzia.");

		System.out.println("\nEta zure programak honela pantailaratzen du:\n");
		erabiltzailea1.inprimatu();
		System.out.println("\n===============================================================");

		erabiltzailea1.gehituLiburua(l2);		

		System.out.println("\nErabiltzailea klasearen inprimatu metodoaren proba kasua (2 liburu ego gehiago)");
		System.out.println("\nErabiltzailaren informazioa honela pantailaratu beharko zen:\n");
		System.out.println("ID: 1099: Lola Mento");
		System.out.println("---> 2 Titulu hauek dauzka maileguan:");
		System.out.println("* El Cuaderno Dorado, Doris Lessing-ek idatzia.");
		System.out.println("* Rayuela, Julio Cortazar-ek idatzia.");

		System.out.println("\nEta zure programak honela pantailaratzen du:\n");
		erabiltzailea1.inprimatu();
		System.out.println("\n===============================================================");

		fail("Begiratu sistemako kontsolan agertzen diren mezuak, eta dena ondo joan bada, ezabatu edo komentatu fail hau.");

	}

}

