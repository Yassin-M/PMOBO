package org.pmobo.packlaborategia5;

public class Katalogoa {
	private ListaLiburuak lista;
	private static Katalogoa nireKatalogoa=null;
	
	private Katalogoa(){
		this.lista = new ListaLiburuak();
	}

	public static Katalogoa getKatalogoa() {
		if(nireKatalogoa==null) {
			nireKatalogoa = new Katalogoa();
		}
		
		return nireKatalogoa;
	}
	
 	public int liburuKopuru(){
 		return this.lista.listarenTamaina();
 	}
 	 	
 	public Liburua bilatuLiburuaIdz(int pIdLiburua){
 	 		return this.lista.bilatuLiburuaIdz(pIdLiburua);
 	}
 	
 	public void mailegatuLiburua(int pIdLiburua, int pIdErabiltzailea){
		Liburua l1 = this.bilatuLiburuaIdz(pIdLiburua);
		Erabiltzailea e = null;
		if(l1!=null) {
			if(ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(l1)==null) {
					if(ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea)!=null) {
						e = ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea);
						if(!e.mailegatzekoMaximoaGainditua()) {
							e.gehituLiburua(l1);
						}
						else {
							System.out.println("Liburu maileguen maximoa gainditu duzu.");
						}
					}
			}
			else {
				System.out.println("Liburua maileguan dago.");
			}
		}
	}

 	public void itzuliLiburua(int pIdLiburua){
		Liburua l1 = this.bilatuLiburuaIdz(pIdLiburua);
		Erabiltzailea e = null;
		if(ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(l1)!=null) {
			e = ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(l1);
			e.kenduLiburua(l1);
		}
		else {
			System.out.println("Liburua ez du inork maileguan");
		}
	}
 	
 	public void katalogatuLiburua(Liburua pLiburua){		
 		if(!this.lista.badago(pLiburua)) {
 			this.lista.gehituLiburua(pLiburua);
 		}
 		else {
 			System.out.println("Liburua katalogatuta dago jada.");
 		}
 	}

 	public void deskatalogatuLiburua(int pIdLiburua){
 		Liburua l1 = this.bilatuLiburuaIdz(pIdLiburua);
 		if(l1!=null) {
 			this.lista.kenduLiburua(l1);
 		}
 		else {
 			System.out.println("Liburua ez dago katalogoan");
 		}
 	}

 	public void inprimatu(){
 		System.out.println("Katalogoak " + this.lista.listarenTamaina() + " titulu ditu guztira");
 		this.lista.inprimatu();
 	}

 	public void erreseteatu(){
 		nireKatalogoa = new Katalogoa();
 	}
 	
}	
