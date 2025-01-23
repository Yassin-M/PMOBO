package org.azterketak.PiratakEtaIrainDueluak;

import java.util.*;

public class Arrunta extends Iraina {
	private ArrayList<String> erantzunZerrenda;
	
	public Arrunta(String pIraina, String pErantzuna) {
		super(pIraina, pErantzuna);
		this.erantzunZerrenda = new ArrayList<String>();
	}
	
	private Iterator<String> getIteradorea(){
		return this.erantzunZerrenda.iterator();
	}
	
	@Override
	public void inprimatu() {
		Iterator<String> itr = this.getIteradorea();
	}
}
