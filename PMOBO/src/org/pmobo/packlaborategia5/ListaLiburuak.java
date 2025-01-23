package org.pmobo.packlaborategia5;


import java.util.ArrayList;
import java.util.Iterator;

public class ListaLiburuak {
	private ArrayList<Liburua> lista;
	
	public ListaLiburuak(){
		this.lista = new ArrayList<Liburua>();
	}

	public int listarenTamaina(){  
		return this.lista.size();
	}
	 
	private Iterator<Liburua> getIteradorea(){
		return this.lista.iterator();
	}
  
	public Liburua bilatuLiburuaIdz(int pIdLiburua){
	  Iterator<Liburua> itr = this.getIteradorea();
	  Liburua l = null;
	  boolean topatua = false;
	  while(itr.hasNext() && !topatua) {
		  Liburua l1 = itr.next();
		  if(l1.idHauDu(pIdLiburua)) {
			  l = l1;
			  topatua=true;
		  }
	  }
	  return l;
	}
  
	public boolean badago(Liburua pLiburua){
		
		return this.lista.contains(pLiburua);
	}
	
	public boolean idBerdinekoLibururikBaAlDa(Liburua pLiburua){
		Iterator<Liburua> itr = this.getIteradorea();
		boolean topatua=false;
		while(itr.hasNext() && !topatua) {
			Liburua l = itr.next();
			if(l.idBerdinaDute(pLiburua)) {
				topatua=true;
			}
		}
		return topatua;
	}
	
	public void gehituLiburua(Liburua pLiburua){
	  if(!this.lista.contains(pLiburua)) {
		  this.lista.add(pLiburua);
	  }
	  else {
		  System.out.println("Liburua jadanik dago zerrendan");
	  }
   }
	
	public void kenduLiburua(Liburua pLiburua){
		if(this.lista.contains(pLiburua)) {
			this.lista.remove(pLiburua);
		}
		else {
			System.out.println("Liburua ez dago zerrendan");
		}
	}
	
	public void inprimatu(){
		Iterator<Liburua> itr = this.getIteradorea();
		while(itr.hasNext()) {
			Liburua l = itr.next();
			l.inprimatu();
		}
	}
 }
