package org.azterketak.IgerilariPartziala;

public class EuskalTaldea {
	private ListaIgerilariak lista;
	private int gutxienekoDenbora;
	private static EuskalTaldea nireEuskalTaldea=null;
	
	private EuskalTaldea(int pGutxienekoDenbora) {
		this.lista = new ListaIgerilariak();
		this.gutxienekoDenbora = pGutxienekoDenbora;
	}
	
	public static EuskalTaldea getEuskalTaldea() {
		if(nireEuskalTaldea==null) {
			nireEuskalTaldea = new EuskalTaldea(60);
		}
		return nireEuskalTaldea;
	}
	
	public double inplementatuBat() {
		return this.lista.batazbestekoa();
	}
	
	public void inplementatuBistaratu() {
		this.lista.pantailaratuIzena(this.gutxienekoDenbora);
	}
}
