package org.azterketak.StreetFighters;

public class Borroka {
	private int id;
	private Borrokalaria bl1;
	private Borrokalaria bl2;
	
	public Borroka(int pID, Borrokalaria pB1, Borrokalaria pB2) {
		this.id = pID;
		this.bl1 = pB1;
		this.bl2 = pB2;
	}
	
	public boolean izenaDu(String pIzena) {
		boolean berdinaDa = false;
		if(this.bl1.izenBerdina(pIzena) || this.izenaDu(pIzena)) {
			berdinaDa = true;
		}
		return berdinaDa;
	}
	
	public void informazioaPantailaratu() {
		this.bl1.informazioaInprimatu();
		this.bl2.informazioaInprimatu();
	}
}
