package org.azterketak.BideoklipPartziala;

public class Bideoklipa {
	private String titulua;
	private String abeslaria;
	private String estiloa;
	
	public Bideoklipa(String pTitulua, String pAbeslaria, String pEstiloa) {
		this.titulua = pTitulua;
		this.abeslaria = pAbeslaria;
		this.estiloa = pEstiloa;
	}
	
	public boolean estiloMusikalekoaDa(String pEstiloa) {
		return this.estiloa.equals(pEstiloa);
	}
}
