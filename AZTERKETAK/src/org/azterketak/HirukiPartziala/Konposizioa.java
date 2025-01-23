package org.azterketak.HirukiPartziala;

public class Konposizioa {
	private String izena;
	private String autorea;
	private ListaHirukiak listaTxikiagoak;
	private ListaHirukiak listaHandiagoak;
	private static Konposizioa nireKonposizioa=null;
	
	private Konposizioa(String pIzena, String pAutorea) {
		this.izena = pIzena;
		this.autorea = pAutorea;
		this.listaHandiagoak = new ListaHirukiak();
		this.listaTxikiagoak = new ListaHirukiak();
	}
	
	public static Konposizioa getNireKonposizioa() {
		if(nireKonposizioa==null) {
			nireKonposizioa = new Konposizioa("Konposizio Izena","Autore Izena");
		}
		
		return nireKonposizioa;
	}
	
	public void inprimatu() {
		System.out.println("Konposizio izena: " + this.izena);
		System.out.println("Autore izena: " + this.autorea);
		System.out.println("Lista Txikiagoen hirukien azalera: ");
		this.listaTxikiagoak.inprimatu();
		System.out.println("Lista Txikiagoen hirukien azalera: ");
		this.listaHandiagoak.inprimatu();
	}
	
	public boolean egiaztatuta(Hirukia pHirukia) {
		float azalera = pHirukia.azalera();
		boolean egiaztatuta = false;
		
		if(listaTxikiagoak.denakBainoHandiago(azalera) && listaHandiagoak.denakBainoTxikiago(azalera)) {
			egiaztatuta = true;
		}
		return egiaztatuta;
	}
}
