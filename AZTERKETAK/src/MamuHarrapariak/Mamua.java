package MamuHarrapariak;

public class Mamua {
	private String mota;
	private String kolorea;
	private double altuera;
	private double zabalera;
	private boolean harrap;
	
	public Mamua(String pMota, String pKolorea, double pAltuera, double pZabalera, boolean pHarrap) {
		this.mota = pMota;
		this.kolorea = pKolorea;
		this.altuera = pAltuera;
		this.zabalera = pZabalera;
		this.harrap = pHarrap;
	}
	
	public boolean mamuaDa(String pMota, String pKolorea, double pAltuera, double pZabalera) {
		return this.mota==pMota && this.kolorea==pKolorea && this.altuera>=pAltuera && this.zabalera>=pZabalera;
	}
	
	public boolean getHarrap() {
		return this.harrap;
	}
}
