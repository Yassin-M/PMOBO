package org.pmobo.packlaborategia7;

import java.util.ArrayList;
import java.util.Iterator;

public class Roster
{
	// atributuak
	private static Roster nireRoster = null;
	private ArrayList<ParteHartzailea> lista;


	// eraikitzailea
	private Roster() {
		this.lista = new ArrayList<ParteHartzailea>();
	}

	// beste metodoak
	
	/**
	 * @return Roster-ren instantzia bakarra
	 */
	public static Roster getRoster(){
		if(nireRoster==null) {
			nireRoster = new Roster();
		}
		return nireRoster;
	}

	/**
	 * 
	 * @return parte hartzaileen Roster-ren iteradorea
	 */
	private Iterator<ParteHartzailea> getIteradorea(){
		return this.lista.iterator();
	}
	
	/**
	 * 
	 * @param pIzena
	 * @return Roster-ren parte hartzailea, pIzena izena duena
	 *         Ez badago, null bueltatzen da
	 */
	private ParteHartzailea bilatuParteHartzaileaIzenaz(String pIzena) {
		Iterator<ParteHartzailea> itr = this.getIteradorea();
		ParteHartzailea pH = null;
		boolean aurkitua = false;
		while(itr.hasNext() && !aurkitua) {
			ParteHartzailea pH1 = itr.next();
			if(pH1.getIzena()==pIzena) {
				pH=pH1;
				aurkitua = true;
			}
		}
		return pH;
		}
	
	/**
	 * 
	 * @param pParteHartzaile
	 * 
	 *  
	 *   post: parte hartzailea gehitzen da Roster-rean, baldin eta ez badago pParteHartzaile-ren izena bera duen parte hartzailerik jadanik.
	 *   	   Horrela izanda, ez da gehituko, eta mezu bat pantailaratzen da.
	 *         
	 */
	public void gehituParteHartzailea(ParteHartzailea pParteHartzailea) {
		if(!this.lista.contains(pParteHartzailea)) {
			this.lista.add(pParteHartzailea);
		}else {
			System.out.println("Partehartzailea jadanik dago listan.");
		}
	}
	/**
	 * 
	 * @return boolear balorea, esaten diguna Roster-ren parte hartzaile guztieen izendatuen zerrendak enuntziatuak emandako baldintzak betetzen duen ala ez.
	 *  
	 *        
	 */
	private boolean baldintzakBetetzenDira() {
		Iterator<ParteHartzailea> itr = this.getIteradorea();
		boolean betetzenDu = true;
		while(itr.hasNext() && betetzenDu) {
			ParteHartzailea pH = itr.next();
			if(!pH.baldintzakBeteDitu()) {
				betetzenDu = false;
			}
		}
		return betetzenDu;
	}

	/**
	 * @return Kanporagarriak diren parte hartzaileen zerrendan (KaleratuenParteHartzaileenLista) sartzeko atalasea, hau da, 
	 * 			Tronularia motako parte hartzaile batek jasotako gehieneko izendapen kopurua.
	 * 
	 */
	private int atalaseaKalkulatu() {
	
	}

	/**
	 * @return Kanporagarriak diren parte hartzaileen zerrenda, enuntziatuan azaldutakoaren arabera.

	 */
	public ListaParteHartzaileak getKaleratuenParteHartzaileenLista() {
	
	}
	
	/**
	 * parte hartzaileen Roster-ra hutsik uzten duena
	 */
	public void erreseteatu() {
		this.lista = new ArrayList<ParteHartzailea>();
	}
}
