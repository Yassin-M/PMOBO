package org.azterketak.PiratakEtaIrainDueluak;

public abstract class Iraina {
	private String irainTestua;
	private String erantzunEgokia;
	
	protected Iraina(String pIraina, String pErantzuna) {
		this.irainTestua = pIraina;
		this.erantzunEgokia = pErantzuna;
	}
	
	protected abstract void inprimatu();
	
	public boolean erantzunaEgiaztatu(String pErantzuna) {
		return this.erantzunEgokia.equals(pErantzuna);
	}
}
