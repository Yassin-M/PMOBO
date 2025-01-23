package org.pmobo.packlaborategia2;

public class Kotxe {
	private String matrikula;
	private String markaModeloa;
	private Pertsona jabea;
	
	public Kotxe(String pMatrikula, String pMarkaModeloa) {
		this.matrikula=pMatrikula;
		this.markaModeloa=pMarkaModeloa;
		this.jabea=null;
	}
	public String getMatrikula() {
		return this.matrikula;
	}
	public void aldatuJabea(Pertsona pJabea) {
		this.jabea=pJabea;
	}
	
	public boolean jabeaAlDa(Pertsona pJabePosible) {
		boolean bada=false;
		if(this.jabea == pJabePosible) {
			bada=true;
		}
		else{
			bada=false;
		}
		return bada;
	}
}
