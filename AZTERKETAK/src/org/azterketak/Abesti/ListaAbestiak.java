package org.azterketak.Abesti;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAbestiak {
	private ArrayList<Abestia> lista;
	
	public ListaAbestiak() {
		this.lista = new ArrayList<Abestia>();
	}
	
	private Iterator<Abestia> getIteradorea(){
		return this.lista.iterator();
	}
	
	public int abeslariarenAbestiKopurua(String pAbeslari) {
		Iterator<Abestia> itr = this.getIteradorea();
		int kont = 0;
		while(itr.hasNext()) {
			Abestia a = itr.next();
			if(a.abeslariaDa(pAbeslari)) {
				kont++;
			}
		}
		return kont;
	}
	
	/*public Abestia jotzenEgongoDenAbestia(int pSegKop) {
		Iterator<Abestia> itr = this.getIteradorea();
		Abestia a = null;
		int denbora = 0;
		int hurrengoDenbora=0;
		boolean topatua = false;
		while(itr.hasNext() && !topatua) {
			Abestia a1 = itr.next();
			denbora=denbora+a.getIraupena();
			hurrengoDenbora=denbora+itr.next().getIraupena();
			if(denbora+pSegKop>denbora) {
				if(denbora+pSegKop>hurrengoDenbora) {
					if()
				}
			}
			else {
				topatua=true;
			}
		}
		return a;
	}*/
}
