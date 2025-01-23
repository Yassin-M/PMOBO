package org.pmobo.packlaborategia4;

import java.text.DecimalFormat;

public class Bezeroa
{
	// atributuak
	private int idBezeroa;
	private String izenAbizena;
	private String pasaHitza;
	private double saldoa;
	private boolean berezia;

	// eraikitzailea
	public Bezeroa(int pId, String pIzenAbizena, String pPasaHitza, double pSaldoa, boolean pBerezia){
		this.idBezeroa = pId;
		this.izenAbizena = pIzenAbizena;
		this.pasaHitza = pPasaHitza;
		this.saldoa = pSaldoa;
		this.berezia = pBerezia;
	}

	// getters eta setters

	private int getIdBezeroa(){
		return this.idBezeroa;
	}

	private String getIzenAbizena(){
		return this.izenAbizena;
	}

	private String getPasahitza(){
		return this.pasaHitza;
	}

	private double getSaldoa() {
		return this.saldoa;
	}

	public boolean getBerezia(){
		return this.berezia;
	}

	private void setSaldoa(double pSaldoa){
		this.saldoa = pSaldoa;
	}

	// gainontzeko metodoak
	private boolean pasaHitzaBaieztatu(String pPasaHitza) {
		boolean emaitza = false;
		if(this.getPasahitza()==pPasaHitza) {
			emaitza = true;
		}
		return emaitza;
	}

	public boolean idBerdinaDu(int pIdBezeroa){
		return this.idBezeroa==pIdBezeroa;
	}

	public boolean bereziaDa(){
		return this.berezia;
	}

	public void saldoaEguneratu(String pPasaHitza, double pDiruKop) {
		if(this.pasaHitzaBaieztatu(pPasaHitza)) {
			if(pDiruKop<this.getSaldoa()) {
				this.setSaldoa(pDiruKop);
				System.out.println("Zure saldo berria "+ pDiruKop + " da.");
			}
			else {
				System.out.println("Saldoa ezin da aldatu");
			}
		}

	}

	public double saldoaLortu(String pPasaHitza){
		double emaitza = 0.0;
		if(this.pasaHitzaBaieztatu(pPasaHitza)) {
			emaitza = this.getSaldoa();
		}
		return emaitza;
	}
}
