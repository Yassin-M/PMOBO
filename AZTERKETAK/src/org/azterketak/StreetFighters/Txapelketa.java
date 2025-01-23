package org.azterketak.StreetFighters;

import java.util.ArrayList;
import java.util.Iterator;

public class Txapelketa {
	private static Txapelketa nireTxapelketa=null;
	private ArrayList<Borroka> zerrenda;
	
	private Txapelketa() {
		this.zerrenda = new ArrayList<Borroka>();
	}
	
	public static Txapelketa getNireTxapelketa() {
		if(nireTxapelketa==null) {
			nireTxapelketa = new Txapelketa();
		}
		return nireTxapelketa;
	}
	
	private Iterator<Borroka> getIteradorea() {
		return this.zerrenda.iterator();
	}
	
	public void borrokakKudeatu() {
		int i=1;
		while(i<=5) {
			Borrokalaria b1 = BorrokalarienZerrenda.getNireBorrokalarienZerrenda().getAusazBorrokalaria();
			Borrokalaria b2 = null;
			do {
				b2 = BorrokalarienZerrenda.getNireBorrokalarienZerrenda().getAusazBorrokalaria();
			}while(b1!=b2);
			
			Borroka b = new Borroka(i, b1, b2);
			this.zerrenda.add(b);
		}
	}
	
	public void lehenengoBorrokaBistaratu(String pIzena) {
		Iterator<Borroka> itr = this.getIteradorea();
		boolean badago = false;
		Borroka b = null;
		while(itr.hasNext()&&!badago) {
			Borroka b1 = itr.next();
			if(b.izenaDu(pIzena)) {
				b=b1;
				badago = true;
			}
		}
		
		if(badago) {
			b.informazioaPantailaratu();
		}
		else {
			System.out.println("Borrokalaria ez du parte hartuko");
		}
	}
}
