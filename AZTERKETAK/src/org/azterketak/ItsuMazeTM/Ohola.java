package org.azterketak.ItsuMazeTM;

public class Ohola {
	public Ohola() {
		
	}
	
	public void atxikitu(char pChara) throws NorantzaOkerraException{
		throw new NorantzaOkerraException();
	}
	
	private void gehituJokalaria(Jokalaria pJokalaria/*, Koordenatua pKoord*/) throws
	LaukitxoaOkupatutaException, IndexOutOfBoundsException
	// Eragina: pJokalaria oholeko pKoord posizioan gehituko du.
	//IndexOutOfBoundsException jaurtiko du baldin eta pKoord ez bada baliozko
	//posizio bat. pKoord posizioan jokalari bat badago, hau jokotik kanporatuko da
	// eta LaukitxoaOkupatutaException salbuespena jaurtiko du.
	{
		
	}

	
	
	public void mugitu(/*Jokalari pJokalari,*/ char pNorantza) throws NorantzaOkerraException,OholKokagunetikKanpoException,LaukitxoaOkupatutaException{
		//Koordenatua koord= this.koordenatuaJokalaria(pJokalari);
		try {
			atxikitu(pNorantza);
			
		}catch(IndexOutOfBoundsException e) {
			throw new OholKokagunetikKanpoException();
		}
	}
	
	
}
