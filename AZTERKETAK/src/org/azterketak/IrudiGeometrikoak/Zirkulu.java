package org.azterketak.IrudiGeometrikoak;

public class Zirkulu extends Oinarrizko {
	private float zentro;
	
	public Zirkulu(float pX, float pY, float pZentro) {
		super(pX, pY);
		this.zentro = pZentro;
	}
	
	@Override
	public float azaleraKalkulatu() {
		float azalera = (float) (Math.PI*Math.pow(this.zentro,2));
		
		return azalera;
	}
}
