package org.azterketak.PiratakEtaIrainDueluak;

import java.util.*;

public abstract class Pirata {
	private String izena;
	private int ospea;
	
	protected Pirata(String pIzena, int pOspea) {
		this.izena = pIzena;
		this.ospea = pOspea;
	}
	
	protected abstract String erantzun(String pIrainTestua);
}
