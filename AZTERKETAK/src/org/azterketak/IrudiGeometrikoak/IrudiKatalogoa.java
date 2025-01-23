package org.azterketak.IrudiGeometrikoak;

import java.util.ArrayList;
import java.util.Iterator;

public class IrudiKatalogoa {
	private static IrudiKatalogoa nireIrudiKatalogoa = null;
	private ArrayList<IrudiGeometriko> lista;
	
	private IrudiKatalogoa() {
		this.lista = new ArrayList<IrudiGeometriko>();
	}
	
	public static IrudiKatalogoa getNireIrudiKatalogoa() {
		if(nireIrudiKatalogoa==null) {
			nireIrudiKatalogoa = new IrudiKatalogoa();
		}
		return nireIrudiKatalogoa;
	}
	
	private Iterator<IrudiGeometriko> getIteradorea(){
		return this.lista.iterator();
	}
}
