package MamuHarrapariak;

public class MamuHarraparia {
	private int id;
	private String izena;
	private MamuZerrenda zerrenda;
	
	public MamuHarraparia(int pID, String pIzena) {
		this.id = pID;
		this.izena = pIzena;
		this.zerrenda = new MamuZerrenda();
	}
	
	public boolean harrapariaNaiz(int pID) {
		return this.id == pID;
	}
	
	public MamuZerrenda getMamuZerrenda() {
		return this.zerrenda;
	}
	
	public boolean harrapatuDu(String pMota, String pKolorea, double pAltuera, double pZabalera) {
		return this.zerrenda.harrapatuDu(pMota, pKolorea, pAltuera, pZabalera);
	}
}
