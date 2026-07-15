package secondoEsercizio;

import java.util.Scanner;

public class RettangoloTest {
	public static void main(String[] args)
	{
		Rettangolo ret1 = new Rettangolo();
		Rettangolo ret2 = new Rettangolo();
		Scanner inputNumeri = new Scanner(System.in);
		
		System.out.println("Inserisci Base Primo Rettangolo:");
		ret1.setBase(inputNumeri.nextInt());
		

		System.out.println("Inserisci Altezza Primo Rettangolo:");
		ret1.setAltezza(inputNumeri.nextInt());
		
		int areaRet1 = ret1.calcolaArea();
		ret1.stampaArea();
		
		ret1.disegna();
		
		
		System.out.println("Inserisci Base Secondo Rettangolo:");
		ret2.setBase(inputNumeri.nextInt());
		

		System.out.println("Inserisci Altezza Secondo Rettangolo:");
		ret2.setAltezza(inputNumeri.nextInt());
		
		int areaRet2 = ret2.calcolaArea();
		ret2.stampaArea();
		
		ret2.disegna();
		
	}

}
