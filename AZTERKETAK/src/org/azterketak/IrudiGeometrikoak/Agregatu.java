package org.azterketak.IrudiGeometrikoak;

import java.util.Iterator;

public class Agregatu extends Konposatu {
	
	public Agregatu() {
		super();
	}
	
	@Override
	public float azaleraKalkulatu() {
		Iterator<Oinarrizko> itr = super.getIteradorea();
		float azalera = 0;
		while(itr.hasNext()) {
			Oinarrizko o = itr.next();
			float oazalera = o.azaleraKalkulatu();
			azalera = azalera + oazalera;
		}
		return azalera;
	}
}
