package org.pmobo.packlaborategia7;

import java.util.ArrayList;

public class ListaParteHartzaileak {
	// atributuak
	private ArrayList<ParteHartzailea> zerrenda;
	// eraikitzailea
	
	/**
	 * post: hasieratzen du parte hartzaileen zerrenda (huts zerrenda bat bezala)
	 */
	public ListaParteHartzaileak() {
		this.zerrenda = new ArrayList<ParteHartzailea>();
	}
	
	// beste metodoak
	
	/**
	 * @return zerrendako pPos posizioan dagoen parte hartzailea
	 *   post:  pPos parametroa balioduna ez bada,  mezu bat pantailaratzen da kontsolatik eta null bueltatzen da
	 *          Zerrendako posizioak 0-tik hasten dira eta (n-1)ean bukatzen dira, n baldin badira zerrendan
	 *          dauden parte hartzaileak 
	 *         
	 */
	public ParteHartzailea getParteHartzaileaPosizioan(int pPos) {
		ParteHartzailea pH = null;
		if(pPos>this.zerrenda.size()-1 || pPos<0) {
			System.out.println("Posizioa ez da erabilgarria");
		} else {
			pH = this.zerrenda.get(pPos);
		}
		return pH;
	}
	
	/**
	 * @return zerrendan dagoen parte hartzaileen kopurua
	 */
	public int parteHartzaileenKopurua() {
		return this.zerrenda.size();
	}

		
	/**
	 * @return zerrendan dagoen Tronularien parte hartzaileen kopurua
	 */
	public int tronularienKopurua() {
		int kop = 0;
		for (int i=0;i<=this.zerrenda.size()-1;i++) {
			ParteHartzailea pH = this.getParteHartzaileaPosizioan(i);
			if(pH instanceof Tronularia) {
				kop++;
			}
		}
		return kop;
	}
	
	/**
	 * @return zerrendan dagoen Pretendenteen parte hartzaileen kopurua
	 */
	public int pretendenteenKopurua() {
		int kop = 0;
		for (int i=0;i<=this.zerrenda.size()-1;i++) {
			ParteHartzailea pH = this.getParteHartzaileaPosizioan(i);
			if(pH instanceof Pretendentea) {
				kop++;
			}
		}
		return kop;
	}
	
	/**
	 * @param pParteHartzailea
	 *            post: pParteHartzailea gehitzen du zerrendan
	 */
	public void gehitu(ParteHartzailea pParteHartzailea) {
		this.zerrenda.add(pParteHartzailea);
	}

	/**
	 * @param pParteHartzailea
	 * @return pParteHartzailea zerrendan dagoen ala ez esaten digun boolearra 
	 */
	public boolean baDago(ParteHartzailea pParteHartzailea) {
		return this.zerrenda.contains(pParteHartzailea);
	}
}
