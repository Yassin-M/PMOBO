package org.pmobo.packlaborategia8;

public class Roster{

	private static Roster nireRoster = null;
	private ParteHartzaileZerrenda zerrenda;

	private Roster() {
		this.zerrenda = new ParteHartzaileZerrenda();
	}
	
	

	/**
	 * @return instantzia bakarra lortu
	 */
	public static Roster getNireRoster() {
		if(nireRoster == null) {
			nireRoster = new Roster();
		}
		return nireRoster;
	}
	

	
	/**
	 * 
	 * @return parte hartzaile kopurua bueltatu
	 */
	public int parteHartzaileKopurua() {
		return this.zerrenda.parteHartzaileKopurua();
	}
	
	
	
	/**
	 * 
	 * @param pIzena
	 * @param pId
	 * @param pAdina
	 * 
	 * Rosterrean parteHartzailea gehituko du, parametroetatik jasotako informazioaz. AdinTxikikoaException
	 * jasotzen badu, ez du ezer egingo, hau da, ez da parteHartzailea gehituko.
	 * IdaExistitzenDaException jasotzen badu, berriz saiatuko da parteHartzaile hori
	 * sartzen baina pId+1 eginez, ezin badu pId+2 eginez etab… id libre bat bilatu arte.  	                     
  	 */
	public void addParteHartzailea(String pIzena, int pId, int pAdina) {
		boolean badago = false;
		do {
			try {
				this.zerrenda.addParteHartzailea(pIzena, pId, pAdina);
				badago=true;
			} catch(AdinTxikikoaException e) {
				
			}catch(IdaExistitzenDaException e) {
				pId++;
			}
		}while(!badago);
	}
	
	
		
	/**
	 * 
	 * @param pId
	 * @return rosterreko ParteHartzailea pId duena
	 *         ez badago null
	 */
	public ParteHartzailea parteHartzaileaIdzBilatu(int pId) {
		ParteHartzailea pH = null;
		try {
			pH = this.zerrenda.parteHartzaileaIdzBilatu(pId);
			return pH;
		}catch(EzAurkituaException e) {
			return null;
		}
	}
	
	
	
	/**
	 * zerrenda ustuko duen metodoa, jUnitak egiteko bideratu nahi da metodo hau.
	 */
	public void reset() {
		this.zerrenda = new ParteHartzaileZerrenda();
	}
	
	
	
}

