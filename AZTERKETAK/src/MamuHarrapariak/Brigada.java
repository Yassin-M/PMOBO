package MamuHarrapariak;

import java.util.*;

public class Brigada {
	private static Brigada nireBrigada = null;
	private ArrayList<MamuHarraparia> zerrenda;
	
	private Brigada() {
		this.zerrenda = new ArrayList<MamuHarraparia>();
	}
	
	public static Brigada getNireBrigada() {
		if(nireBrigada==null) {
			nireBrigada = new Brigada();
		}
		return nireBrigada;
	}
	
	private Iterator<MamuHarraparia> getIteradorea() {
		return this.zerrenda.iterator();
	}
	
	public void gehituMamua(Mamua pMamua, int pIdMamuHarraparia) {
		Iterator<MamuHarraparia> itr = this.getIteradorea();
		boolean aurkitua = false;
		while(itr.hasNext() && !aurkitua) {
			MamuHarraparia mH = itr.next();
			if(mH.harrapariaNaiz(pIdMamuHarraparia)) {
				mH.getMamuZerrenda().addMamua(pMamua);
				aurkitua = true;
			}
		}
	}
	
	public boolean harrapatuDuguBat(String pMota, String pKolorea, double pAltuera, double pZabalera) {
		Iterator<MamuHarraparia> itr = this.getIteradorea();
		boolean harrapatuDugu = false;
		while(itr.hasNext()&&!harrapatuDugu) {
			MamuHarraparia mH = itr.next();
			if(mH.harrapatuDu(pMota, pKolorea, pAltuera, pZabalera)) {
				harrapatuDugu = true;
			}
		}
		return harrapatuDugu;
	}
}
