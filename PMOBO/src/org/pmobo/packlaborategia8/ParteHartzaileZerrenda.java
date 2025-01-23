package org.pmobo.packlaborategia8;
import java.util.*;
public class ParteHartzaileZerrenda {
	
	private ArrayList<ParteHartzailea> zerrenda;

	public ParteHartzaileZerrenda() {
		this.zerrenda = new ArrayList<ParteHartzailea>();
	}

	
	
	/**
	 * 
	 * @return iteratzailea
	 */
	private Iterator<ParteHartzailea> getIterator() {
		return this.zerrenda.iterator();
	}

	
	
	/**
	 * 
	 * @return zerrendako parteHartzaile kopurua
	 */
	public int parteHartzaileKopurua() {
		return this.zerrenda.size();
	}

	
	
	/**
	 * 
	 * @param pId
	 * @return pId duen ParteHartzailea bueltatauko du
	 */
	private boolean idaDuenParteHartzaileaDago(int pId) {
		Iterator<ParteHartzailea> itr = this.getIterator();
		boolean badago = false;
		ParteHartzailea pH = null;
		while(itr.hasNext() && !badago) {
			ParteHartzailea pH1 = itr.next();
			if(pH1.idaDu(pId)) {
				badago = true;
			}
		}
		return badago;
	}

	

	/**
	 * 
	 * @param pIzena
	 * @param pId
	 * @param pAdina
	 * @exception IdaExistitzenDaException jaurtiko du pId iada baldin badago 
	 *            Ez du AdinTxikikoaException tratatuko
	 *            Dena ondo badoa pIzena, pId, eta pAdina duen ParteHartzailea gehituko da
	 *                    
	 */
	public void addParteHartzailea(String pIzena, int pId, int pAdina) throws IdaExistitzenDaException, AdinTxikikoaException {
		if(this.idaDuenParteHartzaileaDago(pId)) {
			throw new IdaExistitzenDaException();
		} else {
			ParteHartzailea pH = new ParteHartzailea(pIzena, pId, pAdina);
			this.zerrenda.add(pH);
		}
	}
	
	

	/**
	 * 
	 * @param pId
	 * @return id-a duen ParteHartzailea bueltatuko du
	 * @exception EzAurkituaException jaurtiko du ez badago
	 */
	public ParteHartzailea parteHartzaileaIdzBilatu(int pId) throws EzAurkituaException {
		if(!this.idaDuenParteHartzaileaDago(pId)) {
			throw new EzAurkituaException();
		}
		return this.parteHartzaileaIdzBilatu(pId);
	}
		
	
}

