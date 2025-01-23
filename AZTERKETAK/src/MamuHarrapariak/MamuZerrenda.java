package MamuHarrapariak;

import java.util.*;

public class MamuZerrenda {
	private ArrayList<Mamua> zerrenda;
	
	public MamuZerrenda() {
		this.zerrenda = new ArrayList<Mamua>();
	}
	
	private Iterator<Mamua> getIteradorea(){
		return this.zerrenda.iterator();
	}
	
	public void addMamua(Mamua pMamua) {
		this.zerrenda.add(pMamua);
	}
	
	public boolean harrapatuDu(String pMota, String pKolorea, double pAltuera, double pZabalera) {
		Iterator<Mamua> itr = this.getIteradorea();
		boolean badago = false;
		while(itr.hasNext()&&!badago) {
			Mamua m = itr.next();
			if(m.getHarrap()) {
				if(m.mamuaDa(pMota, pKolorea, pAltuera, pZabalera)) {
					badago = true;
				}
			}
		}
		return badago;
	}
}
