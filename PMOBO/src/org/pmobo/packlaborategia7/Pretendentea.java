package org.pmobo.packlaborategia7;

public class Pretendentea extends ParteHartzailea
{
	// eraikitzailea
	public Pretendentea(String pIzena, int pPuntuazioa) {
		super(pIzena, pPuntuazioa);
	}

	/**
	 *  @return Booleano bat, pretendentearen izendatuen zerrendak enuntziatuan zehaztutako arauak 
	 *  		betetzen dituen adierazten duena. Hau da, pretendentearen p puntuazioak zero edo handiagoa izan behar du, 
	 *  		eta bere izendatuen zerrendan ezin da egon p pretendente baino gehiago, ezta tronero bat baino gehiago ere.
	 */
	@Override
	public boolean baldintzakBeteDitu() {
		return this.getPuntuazioa()>=0 && this.getListaIzendatuak().parteHartzaileenKopurua()<=this.getPuntuazioa() && this.getListaIzendatuak().tronularienKopurua()<=1;
	}

	/**
	 *  @param pParteHartzaileIzendatua
	 *   post: pParteHartzaileIzendatua izendapenen kopurua 1 edo 5 igoko da, egoeraren arabera:
	 *   	   pParteHartzaileIzendatua egungo parte hartzailea izendatu ez duen pretendentea edo tronularia bada, 1 (izendapen normala) gehituko da, 
	 *         baina pParteHartzaileIzendatua tronularia bada eta, aldi berean, egungo pretendentea izendatu badu, orduan, pParteHartzaileIzendatuak jasotako
	 *         izendapen kopurua bider 5 (izendapen boskoitza) biderkatuko da.
	 */
	@Override
	protected void izendapenaAplikatu(ParteHartzailea pParteHartzaileIzendatua){
		if(this.getIzena()!=pParteHartzaileIzendatua.getIzena()) {
			pParteHartzaileIzendatua.gehituJasotakoIzendapenak(1);
		}else {
			if(pParteHartzaileIzendatua instanceof Tronularia) {
				pParteHartzaileIzendatua.gehituJasotakoIzendapenak(5);
			}else {
				pParteHartzaileIzendatua.gehituJasotakoIzendapenak(1);
			}
		}
	}


}
