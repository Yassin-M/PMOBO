package org.azterketak.IgerilariPartziala;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaIgerilariak {
	private ArrayList<Igerilaria> lista;
	
	public ListaIgerilariak() {
		this.lista = new ArrayList<Igerilaria>();
	}
	
	private Iterator<Igerilaria> getIteradorea(){
		return this.lista.iterator();
	}
	
	public double batazbestekoa() {
		Iterator<Igerilaria> itr = this.getIteradorea();
		float bb = 0;
		while(itr.hasNext()) {
			Igerilaria i1 = itr.next();
			bb=(float) ((bb + (double) i1.getDenbora())/2);
		}
		return bb;
	}
	
	public void pantailaratuIzena(int pGutxienekoa) {
		Iterator<Igerilaria> itr = this.getIteradorea();
		int kont=1;
		while(itr.hasNext() && kont<=5) {
			Igerilaria i2 = itr.next();
			if(i2.denboraMinimoaBainoGutxiagon(pGutxienekoa)) {
				if(kont==1) {
					System.out.println(kont+".go igerilariaren izena: ");
					i2.inprimatuIzena();
				}
				else {
					System.out.println(kont+".en igerilariaren izena: ");
					i2.inprimatuIzena();
				}
				kont++;
			}
		}
	}
}
