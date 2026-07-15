package secondoEsercizio;

import java.util.Scanner;

public class Rettangolo {
	private int base;
	private int altezza;
	private int area;
	Scanner inputNumeri = new Scanner(System.in);
	
	public Rettangolo() {
	}
	
	public Rettangolo(int base, int altezza) {
		setBase(base);
		setAltezza(altezza);
	}
	
	public void setBase(int base) {
		boolean ancora = true;
		
		do {
			if(base > 0)
			{
				this.base = base;
				ancora = false;
				
			}
			else {
				System.out.println("Base Non Valida, deve essere maggiore di 0, reinserisci:");
				base = inputNumeri.nextInt();
				
			}
		}while(ancora);
	}
	
	public void setAltezza(int altezza) {
		boolean ancora = true;
		
		do {
			if(altezza > 0)
			{
				this.altezza = altezza;
				ancora = false;
			}
			else {
				System.out.println("Altezza Non Valida, deve essere maggiore di 0, reinserisci:");
				altezza = inputNumeri.nextInt();
			}
		}while(ancora);
	}
	
	
	public int calcolaArea() {
		this.area = this.base * this.altezza;
		return this.area;
	}
	
	public void stampaArea() {
		System.out.println("L'area del rettangolo è: " + calcolaArea());
	}
	
	public void disegna() {
		for (int i = 0; i < altezza; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("R ");
			}
			System.out.println();
		}
		System.out.println();
	}
}