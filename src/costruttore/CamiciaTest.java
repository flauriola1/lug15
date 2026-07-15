package costruttore;

import java.util.Scanner;

public class CamiciaTest {

	public static void main(String[] args){
		// dovendo usare il costruttore personalizzato, c'è bisogno prima di recuperare tutti gli argomenti da passargli 
		Scanner inputTesti = new Scanner(System.in);
		Scanner inputNumeri = new Scanner(System.in);
		
		System.out.println("Inserisci l'ID della camicia (4 cifre): ");
		int id = inputNumeri.nextInt(); // devo salvare provvisoriamente i vari input
		
		System.out.println("Inserisci la descrizione (tra 8 e 20 caratteri) ");
		String de = inputTesti.nextLine();
		
		System.out.println("Inserisci il codice colore ( R = red, G = green, B = blue, W = white: ");
		char cc = inputTesti.nextLine().toUpperCase().charAt(0);
		
		System.out.println("Inserisci il prezzo unitario (compreso tra 10,0 e 100,0): ");
		double pr = inputNumeri.nextDouble();
		
		System.out.println("Inserisci la quantità di camicie disponibili (almeno 1) ");
		int di = inputNumeri.nextInt();
		
		System.out.println("Inserisci la quantità di camicie acquistate (almeno 1, al massimo quelle disponibili: " ); // non esistendo ancora una istanza di Camicia, non ho accesso ai campi 
		
		int ac = inputNumeri.nextInt();
		
		Camicia miaCamicia = new Camicia(id,de,cc,pr,di,ac); // tutte le chiamate ai setter sono delegate al costruttore ( in questo esempio!) 
		miaCamicia.display();
		
		
	}
}
