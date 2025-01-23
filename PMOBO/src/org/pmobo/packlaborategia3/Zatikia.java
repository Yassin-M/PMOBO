package org.pmobo.packlaborategia3;


public class Zatikia implements IZatikia{       
	private int  zenbakitzailea;
	private int izendatzailea;
	
	public Zatikia(int pZenbakitzailea, int pIzendatzailea){
		this.zenbakitzailea = pZenbakitzailea;
		if (pIzendatzailea!=0){
				this.izendatzailea = pIzendatzailea;
		}
		else{
			System.out.println("Ezin daiteke izendatzailearen balioa 0 izan dezakeen zatikirik sortu ...");
			this.izendatzailea=1;
		}	
	}


	public int getZenbakitzailea(){
		return this.zenbakitzailea;
	}

	public int getIzendatzailea(){
		return this.izendatzailea;
	}
		
	// metodo hau ezkutatzea komeni da, pribatua egitea!
	private int zkh(){
		int lag,a,b;
		a = this.izendatzailea;
		b = this.zenbakitzailea;
		if (a < b)
		{
			lag = a;
			a = b;
			b = lag;
		}
		while (b != 0)
		{
			lag = b;
			b = a % b;
			a = lag;
		}
		return a;
	}

	@Override
	public void sinplifikatu() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Zatikia gehitu(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Zatikia kendu(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Zatikia biderkatu(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Zatikia zatitu(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean berdinaDa(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean handiagoaDa(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean txikiagoaDa(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean izendatzaileBerdinaDu(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean zenbakitzaileBerdinaDu(Zatikia pZatikia) {
		// TODO Auto-generated method stub
		return false;
	}}/**
         /* zatitzaile komunetako handiena topatu
         **/
		//TODO
	
	/*
	public void sinplifikatu()
	{
		//TODO
	}
		
	public Zatikia gehitu(Zatikia pZatikia)
	{
		//TODO
	}
	
	
	public Zatikia kendu(????)
	{
		//TODO
	}
	
	public Zatikia biderkatu(????)
	{
		//TODO	
	}
	
	public Zatikia zatitu(????)
	{
		//TODO	
	}
	
	public boolean berdinaDa(????)
	{
		//TODO
	}
			
	public ???? handiagoaDa(????)
	{
		//TODO
	}
	
	public ???? txikiagoaDa(????)
	{
		//TODO
	}
        public ???? izendatzaileBerdinaDu(????){
		//TODO
	}	
        public ???? zenbakitzaileBerdinaDu(????){
		//TODO
	}	
}*/
