package org.azterketak.BideoklipPartziala;

public class BideoklipenGordelekua {
	private ListaBideoklipak lista;
	private static BideoklipenGordelekua nireBideoklipenGordelekua=null;
	private BideoklipenGordelekua() {
		this.lista = new ListaBideoklipak();
	}
	public static BideoklipenGordelekua getBideoklipenGordelekua() {
		if(nireBideoklipenGordelekua==null) {
			nireBideoklipenGordelekua = new BideoklipenGordelekua();
		}
		//return nireBideoklipenGordelekua;
		return nireBideoklipenGordelekua;
	}
	
	public ListaBideoklipak inplementatu(String pEstilo, int pKop) {
		return this.lista.lortuBideoklipak(pEstilo, pKop);
	}
}
