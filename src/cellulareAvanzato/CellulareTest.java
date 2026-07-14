package cellulareAvanzato;

import java.util.Scanner;

public class CellulareTest {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Cellulare cel = new Cellulare();
		boolean spegni = false;
		
		while(!spegni)
		{
			System.out.println("--------------------------------");
			System.out.println("Benvenuto nel Cellulare ");
			System.out.println("Scelta 1: Ricarica");
			System.out.println("Scelta 2: Imposta Tariffa");
			System.out.println("Scelta 3: Chiamare(con credito sufficiente)");
			System.out.println("Scelta 4: Visualizza Credito Disponibile");
			System.out.println("Scelta 5: Visualizza Dettaglio Chiamate effettuate");
			System.out.println("Scelta 6: Azzera Chiamate");
			System.out.println("Scelta 7: Gestisci Rubrica");
			System.out.println("Scelta 8: Slot Machine");
			System.out.println("Scelta 9: Spegni Cellulare");
			System.out.println("Inserisci Scelta:");
			
			int scelta = n.nextInt();
			switch(scelta)
			{
			case 1:
				System.out.println("Inserisci Importo Da Ricaricare (5€-10€-25€ valori accettati)");
				int importoRicarica = n.nextInt();
				cel.ricaricaCellulare(importoRicarica);
				break;
			case 2:
				System.out.println("Inserisci Tariffa: Centesimi al minuto");
				double sceltaTariffa = n.nextInt();
				cel.impostaTariffa(sceltaTariffa);
				break;
			case 3:
				System.out.println("1. Chiama da rubrica");
				System.out.println("2. Digita il numero");
				int sceltaChiamata = n.nextInt();
				
				String numero = "";
				if (sceltaChiamata == 1) {
					cel.visualizzaRubrica();
					if (cel.getNumeroContatti() > 0) {
						System.out.println("Inserisci l'indice del contatto da chiamare:");
						int indiceContatto = n.nextInt();
						numero = cel.getNumeroDaIndice(indiceContatto);
						if (numero == null) {
							System.out.println("Indice non valido");
						}
					}
				} else if (sceltaChiamata == 2) {
					System.out.println("Inserisci Il Numero da chiamare:");
					numero = s.nextLine();
				} else {
					System.out.println("Scelta non corretta");
				}
				
				if (numero != null && !numero.equals("")) {
					System.out.println("Inserisci Minuti Necessari:");
					int minutes = n.nextInt();
					cel.effettuaChiamata(numero, minutes);
				}
				break;
			case 4:
				cel.stampaCreditoDisponibile();
				break;
			case 5:
				cel.stampaChiamateEffettuate();
				break;
			case 6:
				cel.azzeraChiamate();
				break;
			case 7:
				System.out.println("1. Visualizza Rubrica");
				System.out.println("2. Aggiungi Contatto");
				System.out.println("3. Rimuovi Contatto");
				int sceltaRubrica = n.nextInt();
				if (sceltaRubrica == 1) {
					cel.visualizzaRubrica();
				} else if (sceltaRubrica == 2) {
					System.out.println("Inserisci il nome:");
					String nomeContatto = s.nextLine();
					System.out.println("Inserisci il numero:");
					String numContatto = s.nextLine();
					cel.aggiungiContatto(nomeContatto, numContatto);
				} else if (sceltaRubrica == 3) {
					cel.visualizzaRubrica();
					if (cel.getNumeroContatti() > 0) {
						System.out.println("Inserisci l'indice del contatto da rimuovere:");
						int indiceRimuovi = n.nextInt();
						cel.rimuoviContatto(indiceRimuovi);
					}
				} else {
					System.out.println("Scelta non corretta");
				}
				break;
			case 8:
				cel.avviaSlotMachine(n);
				break;
			case 9:
				System.out.println("Il telefono è stato spento");
				spegni = true;
				break;
			default:
				System.out.println("Scelta non corretta");
				break;
			}
		}
		s.close();
		n.close();
	}
}