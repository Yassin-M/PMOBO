package org.azterketak.PiratakEtaIrainDueluak;

import java.util.Scanner;

public class Teklatua {
	private Scanner sc;
	private Teklatua nireTeklatua=null;
	
	private Teklatua() {
		this.sc = new Scanner(System.in);
	}
	
	public Teklatua getNireTeklatua() {
		if(nireTeklatua==null) {
			nireTeklatua = new Teklatua();
		}
		return nireTeklatua;
	}
}
