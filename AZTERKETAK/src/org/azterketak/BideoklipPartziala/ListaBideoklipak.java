package org.azterketak.BideoklipPartziala;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaBideoklipak {
	private ArrayList<Bideoklipa> lista;
	
	public ListaBideoklipak() {
		this.lista = new ArrayList<Bideoklipa>();
	}
	
	private Iterator<Bideoklipa> getIteradorea() {
		return this.lista.iterator();
	}
	public void gehituBideoklipa(Bideoklipa pBideoklipa) {
		this.lista.add(pBideoklipa);
	}
	
	public ListaBideoklipak lortuBideoklipak(String pEstiloa, int pKop) {
		Iterator<Bideoklipa> itr = this.getIteradorea();
		ListaBideoklipak zerrenda = new ListaBideoklipak();
		int kont = 1;
		while(itr.hasNext() && kont<=pKop) {
			Bideoklipa b = itr.next();
			if(b.estiloMusikalekoaDa(pEstiloa)) {
				zerrenda.gehituBideoklipa(b);
				kont++;
			}
		}
		return zerrenda;
	}
}
