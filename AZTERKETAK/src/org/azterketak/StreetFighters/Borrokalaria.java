package org.azterketak.StreetFighters;

public class Borrokalaria {
	private String izena;
	private int altuera;
	private int pisua;
	
	public Borrokalaria(String pIzena, int pAltuera, int pPisua) {
		this.izena = pIzena;
		this.altuera = pAltuera;
		this.pisua = pPisua;
	}
	
	public boolean izenBerdina(String pIzena) {
		return this.izena.equals(pIzena);
	}
	
	public void informazioaInprimatu() {
		System.out.println(this.izena);
		System.out.println(this.altuera);
		System.out.println(this.pisua);
	}
}
