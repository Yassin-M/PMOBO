package org.pmobo.packlaborategia5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaErabiltzaileak{
	// atributuak
	private ArrayList<Erabiltzailea> lista;
	private static ListaErabiltzaileak nireListaErabiltzaileak=null;
	
	// eraikitzailea
    private ListaErabiltzaileak(){ 
    	this.lista = new ArrayList<Erabiltzailea>();
    }
   	public static ListaErabiltzaileak getListaErabiltzaileak(){
   		if(nireListaErabiltzaileak==null) {
   			nireListaErabiltzaileak = new ListaErabiltzaileak();
   		}
   		
   		return nireListaErabiltzaileak;
   	}
   	
	public int erabiltzaileKopurua(){
		return this.lista.size();
   	}
   	
   	private Iterator<Erabiltzailea> getIteradorea(){
   		return this.lista.iterator();
   	}
    
   	public Erabiltzailea bilatuErabiltzaileaIdz(int pId){
   		Iterator<Erabiltzailea> itr = this.getIteradorea();
   		Erabiltzailea e = null;
   		boolean topatua = false;
   		while(itr.hasNext() && !topatua) {
   			Erabiltzailea e1= itr.next();
   			if(e1.idHauDu(pId)) {
   				e = e1;
   				topatua = true;
   			}
   		}
   		return e;
   	}
   	
   	public boolean badagoIdBerdinekoErabiltzailerik(Erabiltzailea pErabiltzailea){
   		Iterator<Erabiltzailea> itr = this.getIteradorea();
   		boolean topatua = false;
   		while(itr.hasNext() && !topatua) {
   			Erabiltzailea e1 = itr.next();
   			if(e1.idBerdinaDute(pErabiltzailea)) {
   				topatua=true;
   			}
   		}
   		return topatua;
   	}
   	
   	public void erabiltzaileariAltaEman(Erabiltzailea pErabiltzailea){   		
   		if(!this.lista.contains(pErabiltzailea)) {
   			this.lista.add(pErabiltzailea);
   		}
   		else {
   			System.out.println("Erabiltzailea jadanik dago zerrendan");
   		}
   	}

	public void erabiltzaileaBajaEman(int pIdErabiltzailea){
		Erabiltzailea e = this.bilatuErabiltzaileaIdz(pIdErabiltzailea);
		if(this.lista.contains(e)) {
			this.lista.remove(e);
		}
		else {
			System.out.println("Erabiltzailea ez dago listan");
		}
   	}

   	public Erabiltzailea norkDaukaMaileguan(Liburua pLiburu){
   		Iterator<Erabiltzailea> itr = this.getIteradorea();
   		boolean topatua = false;
   		Erabiltzailea e = null;
   		while(itr.hasNext() && !topatua) {
   			Erabiltzailea e1 = itr.next();
   			if(e.maileguanDu(pLiburu)) {
   				e = e1;
   				topatua=true;
   			}
   		}
   		return e;
   	}

   	public void inprimatu(){	
   		System.out.println(this.erabiltzaileKopurua() + " erabiltzaile daude guztira");
   		Iterator<Erabiltzailea> itr = this.getIteradorea();
   		while(itr.hasNext()) {
   			Erabiltzailea e1 = itr.next();
   			e1.inprimatu();
   		}
   	}
   
   	public void erreseteatu(){
   		this.lista = new ArrayList<Erabiltzailea>();
   	}
}
