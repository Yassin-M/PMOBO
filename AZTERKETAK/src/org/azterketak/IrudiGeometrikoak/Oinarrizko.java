package org.azterketak.IrudiGeometrikoak;

public abstract class Oinarrizko extends IrudiGeometriko {
	private Koordenatuak koord;
	protected Oinarrizko(float pX, float pY){
		this.koord = new Koordenatuak(pX, pY);
	}
}
