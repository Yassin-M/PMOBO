package org.azterketak.HirukiPartziala;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaHirukiak {
	private ArrayList<Hirukia> lista;
	public ListaHirukiak() {
		this.lista = new ArrayList<Hirukia>();
	}
	private Iterator<Hirukia> getIteradorea(){
		return this.lista.iterator();
	}
	
	public boolean denakBainoHandiago(float pAzalera) {
		Iterator<Hirukia> itr = this.getIteradorea();
		boolean egiaztatuta = true;
		
		while (itr.hasNext() && egiaztatuta) {
			Hirukia hh = itr.next();
			if(pAzalera<hh.azalera()) {
				egiaztatuta = false;
			}
		}
		return egiaztatuta;
	}
	
	public boolean denakBainoTxikiago(float pAzalera) {
		Iterator<Hirukia> itr = this.getIteradorea();
		boolean egiaztatuta = true;
		while(itr.hasNext() && egiaztatuta) {
			Hirukia hh = itr.next();
			if(pAzalera>hh.azalera()) {
				egiaztatuta=false;
			}
		}
		return egiaztatuta;
	}
	
	public void inprimatu() {
		Iterator<Hirukia> itr = this.getIteradorea();
		while(itr.hasNext()) {
			Hirukia hh = itr.next();
			System.out.println(hh.azalera());
		}
	}
}
