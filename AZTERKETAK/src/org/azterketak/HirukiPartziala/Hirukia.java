package org.azterketak.HirukiPartziala;

public class Hirukia {
	private float oinarria;
	private float altuera;
	
	public Hirukia(float pOinarria, float pAltuera) {
		this.oinarria = pOinarria;
		this.altuera = pAltuera;
	}
	
	public float azalera() {
		float azalera=0;
		azalera=(float) (0.5*this.oinarria*this.altuera);
		
		return azalera;
	}
	
	
}
