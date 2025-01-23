package org.azterketak.Abesti;

public class HariMusikala {
	private ListaAbestiak erreproLista;
	private static HariMusikala nireHariMusikala=null;
	private HariMusikala() {
		this.erreproLista = new ListaAbestiak();
	}
	public static HariMusikala getHariMusikala() {
		if(nireHariMusikala==null) {
			nireHariMusikala = new HariMusikala();
		}
		return nireHariMusikala;
	}
	
	public int inplementazioa(String pAbeslari) {
		return this.erreproLista.abeslariarenAbestiKopurua(pAbeslari);
	}
	
	public Abestia inplementazioa2(int pSegKop) {
		Abestia a=null;
		return a; /*this.erreproLista.jotzenEgongoDenAbestia(pSegKop)*/
	}
}
