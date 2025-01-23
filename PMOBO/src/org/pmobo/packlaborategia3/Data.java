package org.pmobo.packlaborategia3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data implements IData
{	
	//atributuak
	private int urtea;
	private int hilabetea;
	private int eguna;
	
	
	//eraikitzailea
	public Data(int pUrtea, int pHilabetea, int pEguna)
	{
		this.urtea = pUrtea;
		this.hilabetea = pHilabetea;
		this.eguna = pEguna;
	
		if (!this.dataZuzenaDa())
		{
			Calendar c = new GregorianCalendar();
			this.eguna = c.get(Calendar.DATE);	  // egunak 1-etik hasten dira
			this.hilabetea = c.get(Calendar.MONTH)+1; // hileak, aldiz, 0-tik hasten dira 
			this.urtea = c.get(Calendar.YEAR);			
		}
		
	}
		
	//beste metodoak

	@Override
	public String toString()
	{
		String strUrtea = String.format("%04d", this.urtea); 
		String strHilabetea = String.format("%02d", this.hilabetea);
		String strEguna = String.format("%02d", this.eguna);
		
		return strUrtea + "/" + strHilabetea + "/" + strEguna;
	}
	
	//Eginda
	private boolean dataZuzenaDa()
	{
		
		//objektuaren data egokia den ala ez itzultzen du.
		
		boolean egokia=true;
		int azkenEguna;
		
		if(this.urtea>0) {
			if(this.hilabetea>=1 && this.hilabetea<=12) {
				azkenEguna=this.hilabeterarenEgunKopurua();
				if(this.eguna<=azkenEguna) {
					egokia=true;
				}
				else {
					egokia=false;
				}
			}
			else {
				egokia=false;
			}
		}
		else {
			egokia=false;
		}
		return egokia;
	}
	
	//Eginda
	private boolean bisustua ()
	{
		boolean bisustua=false;
		if(this.urtea%4==0) {
			if(this.urtea%100==0) {
				if(this.urtea%400==0) {
					bisustua=true;
				}
				else {
					bisustua=false;
				}
			}
			else {
				bisustua=true;
			}
		}
		else {
			bisustua=false;
		}
		return bisustua;
	}
	
	//Eginda
	@Override
	public void dataGehitu() 
	{
		int azkenEguna;
		azkenEguna=this.hilabeterarenEgunKopurua();
		
		if(this.dataZuzenaDa()==true) {
			if(this.hilabetea<12) {
				if(this.eguna==azkenEguna) {
					this.hilabetea++;
					this.eguna=1;
				}
				else {
					this.eguna++;
				}
			}
			else {
				if(this.eguna==azkenEguna) {
					this.urtea++;
					this.hilabetea=1;
					this.eguna=1;
				}
				else {
					this.eguna++;
				}
			}
		}
	}
	
	//Eginda
	@Override
	public void dataKendu() {
		if(this.hilabetea>1) {
			if(this.eguna==1) {
				if(this.hilabetea==2 || this.hilabetea==4 || this.hilabetea==6 || this.hilabetea==8 || this.hilabetea==9 || this.hilabetea==11) {
					this.eguna=31;
				}
				else if(this.hilabetea==3) {
					if(this.bisustua()==true) {
						this.eguna=29;
					}
					else {
						this.eguna=28;
					}
				}
				else {
					this.eguna=30;
				}
			}
			else {
				this.eguna--;
			}
		}
		else {
			if(this.eguna==1) {
				this.urtea--;
				this.hilabetea=12;
				this.eguna=31;
			}
			else {
				this.eguna--;
			}
		}
	}
	
	//Eginda
	private int hilabeterarenEgunKopurua()
	{
		//metodo laguntzaile honek hilabete bakoitzaren azken egun posiblea bueltatzen du, horrela lana murrizteko bestelako metodoetan.
		
		int azkenEguna;
		
		if(this.bisustua()==true) {
			if(this.hilabetea<=7) {
				if(this.hilabetea!=2 && this.hilabetea%2==0) {
					azkenEguna=30;
				}
				else if(this.hilabetea==2) {
					azkenEguna=29;
				}
				else {
					azkenEguna=30;
				}
			}
			else {
				if(this.hilabetea%2==0) {
					azkenEguna=30;
				}
				else {
					azkenEguna=31;
				}
			}
		}
		else {
			if(this.hilabetea<=7) {
				if(this.hilabetea!=2 && this.hilabetea%2==0) {
					azkenEguna=30;
				}
				else if(this.hilabetea==2) {
					azkenEguna=28;
				}
				else {
					azkenEguna=30;
				}
			}
			else {
				if(this.hilabetea%2==0) {
					azkenEguna=31;
				}
				else {
					azkenEguna=30;
				}
			}
		}
		return azkenEguna;
	}
}
