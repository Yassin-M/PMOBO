package org.azterketak.IrudiGeometrikoak;

public class Triangelu extends Oinarrizko {
	private float alfa;
	private float inklinazioa;
	private float bAldea;
	private float cAldea;
	
	public Triangelu(float pAlfa, float pInklinazioa, float pBAldea, float pCAldea, float pX, float pY) {
		super(pX, pY);
		this.alfa = pAlfa;
		this.inklinazioa = pInklinazioa;
		this.bAldea = pBAldea;
		this.cAldea = pCAldea;
	}
	
	@Override
	public float azaleraKalkulatu() {
		float azalera = (float) (0.5*this.bAldea+this.cAldea*(Math.sin(alfa)));
		
		return azalera;
	}
}
