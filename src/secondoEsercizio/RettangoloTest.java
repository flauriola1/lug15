package secondoEsercizio;

import java.util.Scanner;

public class RettangoloTest {
	public static void main(String[] args)
	{
		Rettangolo ret1 = new Rettangolo();
		Rettangolo ret2;
		Scanner inputNumeri = new Scanner(System.in);
		
		System.out.println("Inserisci Base Primo Rettangolo:");
		ret1.setBase(inputNumeri.nextInt());
		

		System.out.println("Inserisci Altezza Primo Rettangolo:");
		ret1.setAltezza(inputNumeri.nextInt());
		
		int areaRet1 = ret1.calcolaArea();
		ret1.stampaArea();
		
		ret1.disegna();
		
		
		System.out.println("Inserisci Base Secondo Rettangolo:");
		int ret2base = inputNumeri.nextInt();
		

		System.out.println("Inserisci Altezza Secondo Rettangolo:");
		int ret2altezza = inputNumeri.nextInt();
		ret2 = new Rettangolo(ret2base, ret2altezza);
		
		int areaRet2 = ret2.calcolaArea();
		ret2.stampaArea();
		
		ret2.disegna();
		
	}

}
