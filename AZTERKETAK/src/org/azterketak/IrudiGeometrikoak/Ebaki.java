package org.azterketak.IrudiGeometrikoak;

import java.util.Iterator;

public class Ebaki extends Konposatu {
	
	public Ebaki() {
		super();
	}
	
	@Override
	public float azaleraKalkulatu() {
		Iterator<Oinarrizko> itr = super.getIteradorea();
		Oinarrizko o1 = itr.next();
		float azaleraNagusia = o1.azaleraKalkulatu();
		while(itr.hasNext()) {
			o1 = itr.next();
			float hurrengoAzalera = o1.azaleraKalkulatu();
			azaleraNagusia = azaleraNagusia - hurrengoAzalera;
		}
		return azaleraNagusia;
	}
}
