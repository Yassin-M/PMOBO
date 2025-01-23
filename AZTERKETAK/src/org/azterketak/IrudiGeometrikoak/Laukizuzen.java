package org.azterketak.IrudiGeometrikoak;

public class Laukizuzen extends Oinarrizko {
	private float inklinazioa;
	private float aAldea;
	private float bAldea;
	
	public Laukizuzen(float pX, float pY, float pInklinazioa, float pAAldea, float pBAldea) {
		super(pX,pY);
		this.inklinazioa = pInklinazioa;
		this.aAldea = pAAldea;
		this.bAldea = pBAldea;
	}
	
	@Override
	public float azaleraKalkulatu() {
		float azalera = this.aAldea*this.bAldea;
		
		return azalera;
	}
}
