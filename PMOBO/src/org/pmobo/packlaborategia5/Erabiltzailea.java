package org.pmobo.packlaborategia5;

public class Erabiltzailea {
	//atributuak
	private int id;
	private String izenOsoa;
	private int maxMailegu;
	private ListaLiburuak lista;
	
	public Erabiltzailea(String pIzenOsoa, int pIdErabiltzaile){
		this.izenOsoa = pIzenOsoa;
		this.id = pIdErabiltzaile;
		this.lista = new ListaLiburuak();
	}
	
	public boolean idHauDu(int pId){
		boolean berdina = false;
		if(this.id==pId) {
			berdina = true;
		}
		return berdina;
	}
	
	public boolean idBerdinaDute(Erabiltzailea pErabiltzailea){
		boolean berdina = false;
		if(this.id==pErabiltzailea.id) {
			berdina=true;
		}
		return berdina;
	}
	
	public boolean mailegatzekoMaximoaGainditua(){
		boolean heldu = false;
		if(this.maxMailegu>=this.lista.listarenTamaina()) {
			heldu = true;
		}
		return heldu;
	}
	
	public void gehituLiburua(Liburua pLiburua){
		
		this.lista.gehituLiburua(pLiburua);
	}
	
	public void kenduLiburua(Liburua pLiburua){
		
		this.lista.kenduLiburua(pLiburua);
	}
	
	public boolean maileguanDu(Liburua pLiburua){
		
		return this.lista.badago(pLiburua);
	}
	
	public void inprimatu(){
		System.out.println("ID: " +  this.id + " Izena: " + this.izenOsoa);
		if(this.lista.listarenTamaina()!=0) {
			if(this.lista.listarenTamaina()==1) {
				System.out.println("---> Titulu honako hau dauka maileguan: ");
				this.lista.inprimatu();
			}
			else {
				System.out.println("---> " + this.lista.listarenTamaina() + " Titulu hauek ditu maileguan: ");
				this.lista.inprimatu();
			}
		}
		else {
			System.out.println("---> Erabiltzailea ez ditu liburuak maileguan");
		}
	}

}
