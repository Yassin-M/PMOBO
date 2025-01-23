package org.azterketak.IgerilariPartziala;

public class Igerilaria {
	private String izena;
	private int urteak;
	private int denbora;
	
	public Igerilaria(String pIzena, int pUrteak, int pDenbora) {
		this.izena = pIzena;
		this.urteak = pUrteak;
		this.denbora = pDenbora;
	}
	
	public int getDenbora() {
		return this.denbora;
	}
	
	public boolean denboraMinimoaBainoGutxiagon(int pGutxienekoa) {
		boolean kapaza=false;
		if(this.denbora<=pGutxienekoa) {
			kapaza=true;
		}
		return kapaza;
	}
	public void inprimatuIzena() {
		System.out.println(this.izena);
	}
}
