package org.pmobo.teleazterketa;

import java.util.Scanner;

public class Teklatua {
	private static Teklatua nireTeklatua = null;
	private Scanner sc;
	
	private Teklatua() {
		sc = new Scanner(System.in);
	}
	
	public static Teklatua getNireTeklatua() {
		if(nireTeklatua==null) {
			nireTeklatua = new Teklatua();
		}
		
		return nireTeklatua;
	}
	
	public String irakurriString() {
		String erantzuna="";
		while(erantzuna == "") {
			erantzuna = sc.nextLine();
		}
		return erantzuna;
	}
	
	public int irakurriInt(){
		boolean ondo = false;
		int emaitza = 0;
		do {
			try {
                emaitza = Integer.parseInt(sc.nextLine());
                ondo = true;
            }
            catch(NumberFormatException e) {
                System.out.println("Zenbaki bat sartu behar duzu.");
            }
			catch (Exception e) {
				System.out.println("Errore ezezaguna gertatu da.");
			}
		} while (ondo == false);
		return emaitza;
	}
	
	public char hizkiaIrakurri() {
		String chara = sc.next();
		return chara.charAt(0);
	}
}
