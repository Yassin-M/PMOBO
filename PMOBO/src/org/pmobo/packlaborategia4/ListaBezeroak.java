package org.pmobo.packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaBezeroak{
	// atributuak

	private ArrayList<Bezeroa> lista;
	private static ListaBezeroak nireListaBezeroak = null;

	private ListaBezeroak(){
		this.lista = new ArrayList<Bezeroa>();
	}
	
	public static ListaBezeroak getNireListaBezeroak() {
		if(nireListaBezeroak==null) {
			nireListaBezeroak = new ListaBezeroak();
		}
		return nireListaBezeroak;
	}

	private Iterator<Bezeroa> getIteradorea(){
		return this.lista.iterator();
	}

	public Bezeroa bilatuBezeroaIdz(int pBezId){
		Iterator<Bezeroa> itr = this.getIteradorea();
		boolean topatua = false;
		Bezeroa bezeroBat = null;
		while(itr.hasNext() && !topatua) {
			Bezeroa b = itr.next();
			if(b.idBerdinaDu(pBezId)) {
				bezeroBat = b;
				topatua = true;
			}
		}
	    return bezeroBat;
	}

	// gainontzeko metodoak
	public int bezeroKopurua(){
		return this.lista.size();
	}

	public void gehituBezero(int pIdBezero, String pIzenAbizena, String pPasahitza, double pSaldoa, boolean pBerezia){
		// bezeroen zerrendan jasotzen duen bezero bat gehitzen du. Bezero hori
		// jadanik sartuta balego, mezu bat aterako du abisatzeko.
		if(this.bilatuBezeroaIdz(pIdBezero)==null) {
			Bezeroa b = new Bezeroa(pIdBezero,pIzenAbizena,pPasahitza,pSaldoa,pBerezia);
			this.lista.add(b);
		}
		else {
			System.out.println("Bezero hori jadanik dago zerrendan");
		}
	}

	public void erreseteatu() {
		this.lista = new ArrayList<Bezeroa>();
	}

}
