package org.pmobo.packlaborategia7;

public class Tronularia extends ParteHartzailea {
	// eraikitzailea
	public Tronularia (String pIzena, int pPuntuazioa) {
		super(pIzena, pPuntuazioa);
	}

	// beste metodoak
		
	/**
	 *  @return Tronulariaren izendatuen zerrendak enuntziatuan zehaztutako arauak betetzen dituen adierazten duen boolear.
	 *  		Hau da: tronulariaren p puntuazioak zero edo handiagoa izan behar du, bere izendatuen zerrendan ezin dira p lehiakide baino gehiago egon, 
	 *  		eta horiek guztiek tronulariak edo pretendenteak izan behar dute (hau da, ezin dira nahastu).      
	 *    
	 */
	@Override
	public boolean baldintzakBeteDitu() {
		return this.getPuntuazioa()>=0 && this.getListaIzendatuak().parteHartzaileenKopurua()<=this.getPuntuazioa() && (this.getListaIzendatuak().tronularienKopurua()==this.getListaIzendatuak().parteHartzaileenKopurua() || this.getListaIzendatuak().pretendenteenKopurua()==this.getListaIzendatuak().parteHartzaileenKopurua());
	}

	
	/**
	 *  @param pParteHartzaileIzendatua
	 *  post: pParteHartzaileIzendatua-ren izendapenen kopurua 2 gehitzen da, Tronulari baten izendapenek beti zigortzen baitute bikoitza.
	 */
	@Override
	protected void izendapenaAplikatu(ParteHartzailea pParteHartzaileIzendatua) {
		pParteHartzaileIzendatua.gehituJasotakoIzendapenak(2);
	}

	
	/**
	 *  @param pPretendentea
	 *  @return  Pretendentea egungo tronulariaren izendatuen zerrendan dagoen ala ez adierazten duen boolearra.
	 */
	public boolean badagoBereIzendatuenArtean(Pretendentea pPretendentea) {
		return this.getListaIzendatuak().baDago(pPretendentea);
	}

}
