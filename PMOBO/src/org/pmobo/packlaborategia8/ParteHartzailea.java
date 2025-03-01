package org.pmobo.packlaborategia8;

public class ParteHartzailea {
	private String izena;
	private int id;
	private int adina;

	/**
	 * 
	 * @param pIzena
	 * @param pId
	 * @param pAdina
	 *            
	 * @exception AdinTxikikoaException jaurti 18 urte baino gutxiago baditu
	 *            bestela pIzena, pId eta pAdina duen ParteHartzailea sortuko da
	 * 
	 * 
	 */
	public ParteHartzailea(String pIzena, int pId, int pAdina) throws AdinTxikikoaException {
		if(pAdina<18) {
			throw new AdinTxikikoaException();
		}
		
		this.izena = pIzena;
		this.id = pId;
		this.adina = pAdina;
	}
	
	
	
	/**
	 * 
	 * @param pId
	 * @return boolean bat, id berdina badute true, false bestela
	 * 
	 */
	public boolean idaDu(int pId) {
		return this.id == pId;
	}


	
	/**
	 * 
	 * @return izena
	 * 
	 */
    public String getIzena() {
    	return this.izena;
    }
	

	
	/**
	 * 
	 * @return adina
	 * 
	 */
	public int getAdina() {
		return this.adina;
	}


	
}
