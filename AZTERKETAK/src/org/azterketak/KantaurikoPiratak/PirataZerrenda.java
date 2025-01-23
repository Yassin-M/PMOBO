package org.azterketak.KantaurikoPiratak;

public class PirataZerrenda {
	private static PirataZerrenda nirePirataZerrenda = null;
	
	private PirataZerrenda() {
		
	}
	
	public static PirataZerrenda getNirePirataZerrenda() {
		if(nirePirataZerrenda == null) {
			nirePirataZerrenda = new PirataZerrenda();
		}
		return nirePirataZerrenda;
	}
}
