package org.pmobo.packlaborategia5;

public class Liburua{

	private String titulua;
	private String idazlea;
	private int idLiburua;
	
	public Liburua(String pTitulua, String pIdazlea, int pIdLiburua)
	{
		this.titulua = pTitulua;
		this.idazlea = pIdazlea;
		this.idLiburua = pIdLiburua;
	} 
	

	public boolean idHauDu(int pIdLiburua){
		boolean emaitza = false;
		if(this.idLiburua==pIdLiburua) {
			emaitza=true;
		}
		return emaitza;
	}
	
	public boolean idBerdinaDute (Liburua pLiburua){
		boolean emaitza=false;
		if(pLiburua.idLiburua==this.idLiburua) {
			emaitza=true;
		}
		return emaitza;
	}
	
	public void inprimatu() {
		System.out.println("* " + this.titulua + ", " + this.idazlea+"-ek idatzitakoa");
	}
	
}
