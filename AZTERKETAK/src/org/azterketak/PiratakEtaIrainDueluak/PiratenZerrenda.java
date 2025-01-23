package org.azterketak.PiratakEtaIrainDueluak;

import java.util.*;

public class PiratenZerrenda {
	private ArrayList<Pirata> lista;
	private static PiratenZerrenda nirePiratenZerrenda=null;
	
	private PiratenZerrenda() {
		this.lista = new ArrayList<Pirata>();
	}
	
	public static PiratenZerrenda getNirePiratenZerrenda() {
		if(nirePiratenZerrenda==null) {
			nirePiratenZerrenda = new PiratenZerrenda();
		}
		return nirePiratenZerrenda;
	}
}
