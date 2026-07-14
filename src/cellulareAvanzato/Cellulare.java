package cellulareAvanzato;

import java.util.ArrayList;
import java.util.Scanner;

public class Cellulare {
	private double creditoDisponibile;
	private int chiamateEffettuate;
	private double tariffa;
	private ArrayList<String> rubricaNomi = new ArrayList<String>();
	private ArrayList<String> rubricaNumeri = new ArrayList<String>();
	private ArrayList<String> cronologiaChiamate = new ArrayList<String>();

	public void ricaricaCellulare(int importo) {
		if (importo == 5 || importo == 10 || importo == 25) {
			creditoDisponibile += importo;
			System.out.println("--------------------------------");
			System.out.println("Ricarica effettuata con un importo di: " + importo);
			System.out.println("--------------------------------");
		} else {
			System.out.println("--------------------------------");
			System.out.println("Importo non Valido");
			System.out.println("--------------------------------");
		}
	}

	public void impostaTariffa(double centesimiAlMinuto) {
		tariffa = centesimiAlMinuto / 100.0;
		System.out.println("--------------------------------");
		System.out.println("Tariffa Impostata a " + tariffa + "/minuto");
		System.out.println("--------------------------------");
	}

	public void effettuaChiamata(String numero, int minuti) {
		int lunghezzanumero = numero.length();
		
		if (tariffa <= 0 || creditoDisponibile <= 0) {
			System.out.println("Il Credito non è sufficiente o la tariffa non è corretta");
		} else {
			if (lunghezzanumero > 8 && lunghezzanumero < 15) {
				double costoTeorico = minuti * tariffa;

				System.out.println("--------------------------------");
				
				if (costoTeorico <= creditoDisponibile) {
					creditoDisponibile -= costoTeorico;
				} else {
					creditoDisponibile = 0.0;
					System.out.println("Attenzione: Il credito è stato esaurito durante la chiamata");
				}
				cronologiaChiamate.add(numero);
				chiamateEffettuate++;
				System.out.println("Hai effettuato una chiamata al numero: " + numero);
				System.out.println("--------------------------------");
				
			} else {
				System.out.println("--------------------------------");
				System.out.println("Numero Non Valido. Il numero deve essere di almeno 8 caratteri, massimo 15");
				System.out.println("--------------------------------");
			}
		}
	}

	public void stampaCreditoDisponibile() {
		System.out.println("--------------------------------");
		System.out.println("Il Tuo credito disponibile attuale è di: " + creditoDisponibile);
		System.out.println("--------------------------------");
	}

	public void stampaChiamateEffettuate() {
		System.out.println("--------------------------------");
		System.out.println("Dettaglio chiamate effettuate:");
		for (int i = 0; i < cronologiaChiamate.size(); i++) {
			String num = cronologiaChiamate.get(i);
			String nome = cercaNomeDaNumero(num);
			if (nome != null) {
				System.out.println("- Chiamata a: " + nome + " (" + num + ")");
			} else {
				System.out.println("- Chiamata a: " + num);
			}
		}
		System.out.println("Numero totale chiamate effettuate: " + chiamateEffettuate);
		System.out.println("--------------------------------");
	}

	public void azzeraChiamate() {
		chiamateEffettuate = 0;
		cronologiaChiamate.clear();
		System.out.println("--------------------------------");
		System.out.println("Numero Chiamate Azzerato");
		System.out.println("--------------------------------");
		stampaChiamateEffettuate();
	}

	public void aggiungiContatto(String nome, String numero) {
		rubricaNomi.add(nome);
		rubricaNumeri.add(numero);
		System.out.println("--------------------------------");
		System.out.println("Contatto aggiunto con successo");
		System.out.println("--------------------------------");
	}

	public void rimuoviContatto(int indice) {
		if (indice > 0 && indice <= rubricaNomi.size()) {
			rubricaNomi.remove(indice - 1);
			rubricaNumeri.remove(indice - 1);
			System.out.println("--------------------------------");
			System.out.println("Contatto rimosso con successo");
			System.out.println("--------------------------------");
		} else {
			System.out.println("--------------------------------");
			System.out.println("Indice non valido");
			System.out.println("--------------------------------");
		}
	}

	public void visualizzaRubrica() {
		System.out.println("--------------------------------");
		System.out.println("Rubrica Contatti:");
		if (rubricaNomi.isEmpty()) {
			System.out.println("La rubrica è vuota");
		} else {
			for (int i = 0; i < rubricaNomi.size(); i++) {
				System.out.println((i + 1) + ". " + rubricaNomi.get(i) + " : " + rubricaNumeri.get(i));
			}
		}
		System.out.println("--------------------------------");
	}

	public int getNumeroContatti() {
		return rubricaNomi.size();
	}

	public String getNumeroDaIndice(int indice) {
		if (indice > 0 && indice <= rubricaNumeri.size()) {
			return rubricaNumeri.get(indice - 1);
		}
		return null;
	}

	private String cercaNomeDaNumero(String numero) {
		for (int i = 0; i < rubricaNumeri.size(); i++) {
			if (rubricaNumeri.get(i) != null && rubricaNumeri.get(i).equals(numero)) {
				return rubricaNomi.get(i);
			}
		}
		return null;
	}

	public void avviaSlotMachine(Scanner n) {
		int giocate = 0;
		int vittorie = 0;
		boolean gioca = true;
		while (gioca) {
			System.out.println("--------------------------------");

			System.out.println("Benvenuto nel gioco della Slot Machine");
			System.out.println("1. Gioca alla slot machine");
			System.out.println("2. Esci e mostra i risultati");
			System.out.println("Inserisci scelta:");
			int scelta = n.nextInt();
			if (scelta == 1) {
				int n1 = (int) (Math.random() * 3) + 1;
				int n2 = (int) (Math.random() * 3) + 1;
				int n3 = (int) (Math.random() * 3) + 1;
				System.out.println("--------------------------------");
				System.out.println("Risultato: [ " + n1 + " ] [ " + n2 + " ] [ " + n3 + " ]");
				if (n1 == n2 && n2 == n3) {
					System.out.println("Complimenti Hai Vinto!");
					vittorie++;
				} else {
					System.out.println("Hai Perso, Ritenta!");
				}
				giocate++;
			} else if (scelta == 2) {
				System.out.println("--------------------------------");
				System.out.println("hai vinto:" + vittorie + " volte su " + giocate + " partite giocate");
				System.out.println("--------------------------------");
				gioca = false;
			} else {
				System.out.println("Scelta non corretta");
			}
		}
	}
}