package org.azterketak.IrudiGeometrikoak;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Konposatu extends IrudiGeometriko {
	private ArrayList<Oinarrizko> lista;
	
	protected Konposatu() {
		this.lista = new ArrayList<Oinarrizko>();
	}
	
	protected Iterator<Oinarrizko> getIteradorea(){
		return this.lista.iterator();
	}
	
	
}
