package org.azterketak.StreetFighters;

public class Main {

	public static void main(String[] args) {
		Borrokalaria bl1 = new Borrokalaria("Petu", 188, 80);
		Borrokalaria bl2 = new Borrokalaria("Urko", 170, 70);
		Borrokalaria bl3 = new Borrokalaria("Joncio", 176, 85);
		Borrokalaria bl4 = new Borrokalaria("Surya", 183, 90);
		Borrokalaria bl5 = new Borrokalaria("Yassin", 173, 55);
		Borrokalaria bl6 = new Borrokalaria("Unaitxu", 173, 65);
		Borrokalaria bl7 = new Borrokalaria("Bermeotar", 175, 63);
		Borrokalaria bl8 = new Borrokalaria("Mungitar", 175, 70);
		Borrokalaria bl9 = new Borrokalaria("Gaizka", 173, 85);
		Borrokalaria bl0 = new Borrokalaria("Zabala", 173, 65);
		
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl1);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl2);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl3);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl4);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl5);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl6);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl7);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl8);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl9);
		BorrokalarienZerrenda.getNireBorrokalarienZerrenda().gehituBorrokalaria(bl0);
		
		Txapelketa.getNireTxapelketa().borrokakKudeatu();
		
		Txapelketa.getNireTxapelketa().lehenengoBorrokaBistaratu("Yassin");
	}

}
