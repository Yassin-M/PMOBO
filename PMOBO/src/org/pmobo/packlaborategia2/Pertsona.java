package org.pmobo.packlaborategia2;

public class Pertsona {
	
	//atributuak
	
	private int idPertsona;
	private String izenOsoa;
	private int adina;
	private String nazionalitatea;
	private String odolMota;
	
	
	public Pertsona(int pIdPertsona, String pIzenOsoa) {
		this.idPertsona = pIdPertsona;
		this.izenOsoa = pIzenOsoa;
	}

	public Pertsona(int pIdPertsona, String pIzenOsoa, int pAdina, String pNazionalitatea, String pOdolMota) {
		this.idPertsona = pIdPertsona;
		this.izenOsoa = pIzenOsoa;
		this.adina = pAdina;
		this.nazionalitatea = pNazionalitatea;
		this.odolMota = pOdolMota;
	}
	
	public void setIdPertsona(int pIdPertsona) {
		this.idPertsona = pIdPertsona;
	}
	
	public int getIdPertsona() {
		return idPertsona;
	}
	
	public int getAdina() {
		return adina;
	}

	public void setAdina(int pAdina) {
		this.adina = pAdina;
	}

	public String getNazionalitatea() {
		return nazionalitatea;
	}

	public void setNazionalitatea(String pNazionalitatea) {
		this.nazionalitatea = pNazionalitatea;
	}

	public String getOdolMota() {
		return odolMota;
	}

	public void setOdolMota(String pOdolMota) {
		this.odolMota = pOdolMota;
	}

	public boolean idBerdinaDu(Pertsona pPertsona) {
		if(this.idPertsona==pPertsona.idPertsona) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	public String getIzenOsoa() {
		return izenOsoa;
	}

	public void setIzenOsoa(String pIzenOsoa) {
		this.izenOsoa = pIzenOsoa;
	}

	public boolean gidatuDezake() {
		if (this.nazionalitatea=="Etiopia") {
			if(this.adina>=14) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(this.nazionalitatea=="Australia" || this.nazionalitatea=="Estatu Batuak") {
			if(this.adina>=16) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(this.nazionalitatea=="Erresuma Batua") {
			if(this.adina>=17) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(this.adina>=18) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public boolean donatuDiezaioke(Pertsona pPertsona) {

		
		String emailea = this.odolMota;
		String hartzailea=pPertsona.odolMota;
		
		switch (emailea) {
		case "O-":
			return true;
		case "O+":
			if(hartzailea=="AB+" || hartzailea=="A+"	|| hartzailea=="B+" || hartzailea=="O+") {
				return true;
			}
			else {
				return false;
			}

		case "B-":
			if(hartzailea=="AB+" || hartzailea=="AB-"	|| hartzailea=="B+" || hartzailea=="B-") {
				return true;
			}
			else {
				return false;
			}

		case "A-":
			if(hartzailea=="AB+" || hartzailea=="AB-"	|| hartzailea=="A+" || hartzailea=="A-") {
				return true;
			}
			else {
				return false;
			}

		case "B+":
			if(hartzailea=="AB+" || hartzailea=="B+") {
				return true;
			}
			else {
				return false;
			}
			
		case "A+":
			if(hartzailea=="AB+" || hartzailea=="A+") {
				return true;
			}
			else {
				return false;
			}

		case "AB-":
			if(hartzailea=="AB+" || hartzailea=="AB-") {
				return true;
			}
			else {
				return false;
			}

		case "AB+":
			if(hartzailea=="AB+") {
				return true;
			}
			else {
				return false;
			}

		default:
			break;
			
		}
		return true;
	}
	
	public char getIzenarenIniziala() {
		
		char izenIniziala;
		
		izenIniziala=this.izenOsoa.charAt(0);
		
		return izenIniziala;
	}
	
	public char getAbizenarenIniziala() {
		char abizenIniziala=' ';
		int n = this.izenOsoa.length();
		n=n-1;
		
		do {
			if(this.izenOsoa.charAt(n-1)==' ') {
				abizenIniziala=this.izenOsoa.charAt(n);
			}
			n=n-1;
		}while(this.izenOsoa.charAt(n)!=' ');
		
		return abizenIniziala;
	}
}
