package org.azterketak.Abesti;

public class Abestia {
	private String titulua;
	private String abeslari;
	private int iraupena;
	
	public Abestia(String pTitulua, String pAbeslari, int pIraupena) {
		this.titulua = pTitulua;
		this.abeslari = pAbeslari;
		this.iraupena = pIraupena;
	}
	
	public int getIraupena() {
		return this.iraupena;
	}
	
	public boolean abeslariaDa(String pAbeslari) {
		return this.abeslari.equals(pAbeslari);
	}
}
