package org.pmobo.teleazterketa;

import java.util.*;

import org.azterketak.PiratakEtaIrainDueluak.Teklatua;

public class ListaJokalariak {
	private static ListaJokalariak nireListaJokalariak=null;
	private ArrayList<String> zerrenda;
	
	private ListaJokalariak() {
		this.zerrenda = new ArrayList<String>();
	}
	
	public static ListaJokalariak getNireListaJokalariak() {
		if(nireListaJokalariak==null) {
			nireListaJokalariak = new ListaJokalariak();
		}
		return nireListaJokalariak;
	}
	
	public boolean idzBilatu(String pString) throws EzDagoIdException {
		if(!this.zerrenda.contains(pString)) {
			throw new EzDagoIdException();
		}
		return true;
	}
	
	public void akzioaBurutu(String pIdJokalari) throws EzinezkoaAkzioaBurutuException {
		boolean aurkitua = false;
		int kont = 3;
		while(!aurkitua) {
			try {
				idzBilatu(pIdJokalari);
				aurkitua=true;
			}catch(EzDagoIdException e) {
				pIdJokalari = Teklatua.getNireTeklatua().toString();
				kont--;
				if(kont<=0) {
					throw new EzinezkoaAkzioaBurutuException();
				}
			}
		}
	}
}
