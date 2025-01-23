package org.azterketak.StreetFighters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class BorrokalarienZerrenda {
	private static BorrokalarienZerrenda nireBorrokalarienZerrenda=null;
	private ArrayList<Borrokalaria> zerrenda;
	
	private BorrokalarienZerrenda() {
		this.zerrenda = new ArrayList<Borrokalaria>();
	}
	
	public static BorrokalarienZerrenda getNireBorrokalarienZerrenda() {
		if(nireBorrokalarienZerrenda==null) {
			nireBorrokalarienZerrenda = new BorrokalarienZerrenda();
		}
		return nireBorrokalarienZerrenda;
	}
	
	private Iterator<Borrokalaria> getIteradorea() {
		return this.zerrenda.iterator();
	}
	
	private int getZerrendaLuzeera() {
		return this.zerrenda.size();
	}
	
	public void gehituBorrokalaria(Borrokalaria pB) {
		this.zerrenda.add(pB);
	}
	
	public void ezabatuBorrokalariaZerrendatik(Borrokalaria pB) {
		this.zerrenda.remove(pB);
	}
	
	public Borrokalaria getAusazBorrokalaria() {
		int zl = this.getZerrendaLuzeera();
		Random r = new Random();
		int tirada = r.nextInt(zl);
		Borrokalaria b = this.zerrenda.get(tirada);
		return b;
		
	}
}
