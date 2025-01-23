package org.azterketak.PiratakEtaIrainDueluak;

public class GoiMailako extends Iraina {
	private boolean zentsuratua;
	private int ospeMinimoa;
	
	public GoiMailako(String pIraina, String pErantzuna, boolean pZentsuratua, int pOspeMinimoa) {
		super(pIraina, pErantzuna);
		this.zentsuratua = pZentsuratua;
		this.ospeMinimoa = pOspeMinimoa;
	}
	
	public void inprimatu() {
		
	}
}
