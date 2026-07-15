package primoEsercizio;

import java.util.Scanner;

public class RegistrazioneTest {
	public static void main(String[] args)
	{
		Registrazione reg1 = new Registrazione();
		
	    Scanner inputNumeri = new Scanner(System.in);
	    Scanner inputTesti = new Scanner(System.in);
	    
	    System.out.println("Inserisci Canale Televisivo:");
	    reg1.setCanaleTelevisivo(inputNumeri.nextInt());
	    
	    System.out.println("Inserisci Anno Registrazione:");
	    reg1.setAnnoRegistrazione(inputNumeri.nextInt());
	    
	    System.out.println("Inserisci Mese Registrazione (1-12):");
	    reg1.setMeseRegistrazione(inputNumeri.nextInt());
	    
	    System.out.println("Inserisci Giorno Registrazione (1-31):");
	    reg1.setGiornoRegistrazione(inputNumeri.nextInt());
	    
	    System.out.println("Inserisci Ora Inizio Registrazione (0-23):");
	    reg1.setOraRegistrazione(inputNumeri.nextInt());
	    
	    System.out.println("Inserisci Minuti Inizio Registrazione (0-59):");
	    reg1.setMinutiRegistrazione(inputNumeri.nextInt());
	    
	    System.out.println("Inserisci Durata Registrazione (in minuti):");
	    reg1.setDurataRegistrazione(inputNumeri.nextInt());
	    
	    reg1.display();
	    
	    inputNumeri.close();
	    inputTesti.close();
	}
}