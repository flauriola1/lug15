package primoEsercizio;

import java.util.Scanner;

public class Registrazione {
    private int canaleTelevisivo;
    private int annoRegistrazione;
    private int meseRegistrazione;
    private int giornoRegistrazione;
    private int oraRegistrazione;
    private int minutiRegistrazione;
    private int durataRegistrazione;
    
    Scanner inputNumeri = new Scanner(System.in);
    Scanner inputTesti = new Scanner(System.in);
    
    public void setCanaleTelevisivo(int canaleTelevisivo) {
        boolean ancora = true;
        do {
            if(canaleTelevisivo >= 1 && canaleTelevisivo <= 102) {
                this.canaleTelevisivo = canaleTelevisivo;
                ancora = false;
            } else {
                System.out.println("Il canale Televisivo deve essere compreso fra 1 e 102");
                System.out.print("Inserisci nuovamente: ");
                canaleTelevisivo = inputNumeri.nextInt();
            }
        } while(ancora);
    }
    
    public int getCanaleTelevisivo() {
        return canaleTelevisivo;
    }
    
    public void setAnnoRegistrazione(int annoRegistrazione) {
        boolean ancora = true;
        do {
            if(annoRegistrazione >= 2026 && annoRegistrazione <= 2027) {
                this.annoRegistrazione = annoRegistrazione;
                ancora = false; 
            } else {
                System.out.println("L'anno di registrazione deve essere compreso fra 2026 e 2027, reinserisci:");
                annoRegistrazione = inputNumeri.nextInt(); 
            }
        } while(ancora);
    }
    
    public int getAnnoRegistrazione() {
        return annoRegistrazione;
    }

    public void setMeseRegistrazione(int meseRegistrazione) {
        boolean ancora = true;
        do {
            if(meseRegistrazione >= 1 && meseRegistrazione <= 12) {
                this.meseRegistrazione = meseRegistrazione;
                ancora = false;
            } else {
                System.out.println("Il mese deve essere compreso fra 1 e 12, reinserisci:");
                System.out.print("Inserisci nuovamente: ");
                meseRegistrazione = inputNumeri.nextInt();
            }
        } while(ancora);
    }

    public int getMeseRegistrazione() {
        return meseRegistrazione;
    }

    public void setGiornoRegistrazione(int giornoRegistrazione) {
        boolean ancora = true;
        do {
            if(giornoRegistrazione >= 1 && giornoRegistrazione <= 31) {
                this.giornoRegistrazione = giornoRegistrazione;
                ancora = false;
            } else {
                System.out.println("Il giorno deve essere compreso fra 1 e 31, reinserisci:");
                giornoRegistrazione = inputNumeri.nextInt();
            }
        } while(ancora);
    }

    public int getGiornoRegistrazione() {
        return giornoRegistrazione;
    }

    public void setOraRegistrazione(int oraRegistrazione) {
        boolean ancora = true;
        do {
            if(oraRegistrazione >= 0 && oraRegistrazione <= 23) {
                this.oraRegistrazione = oraRegistrazione;
                ancora = false;
            } else {
                System.out.println("L'ora di inizio deve essere compresa fra 0 e 23, reinserisci:");
                oraRegistrazione = inputNumeri.nextInt();
            }
        } while(ancora);
    }

    public int getOraRegistrazione() {
        return oraRegistrazione;
    }

    public void setMinutiRegistrazione(int minutiRegistrazione) {
        boolean ancora = true;
        do {
            if(minutiRegistrazione >= 0 && minutiRegistrazione <= 59) {
                this.minutiRegistrazione = minutiRegistrazione;
                ancora = false;
            } else {
                System.out.println("I minuti di inizio devono essere compresi fra 0 e 59, reinserisci:");
                minutiRegistrazione = inputNumeri.nextInt();
            }
        } while(ancora);
    }

    public int getMinutiRegistrazione() {
        return minutiRegistrazione;
    }

    public void setDurataRegistrazione(int durataRegistrazione) {
        boolean ancora = true;
        do {
            if(durataRegistrazione >= 1) { 
                this.durataRegistrazione = durataRegistrazione;
                ancora = false;
            } else {
                System.out.println("La durata della registrazione deve essere di almeno 1 minuto, reinserisci:");
                durataRegistrazione = inputNumeri.nextInt();
            }
        } while(ancora);
    }

    public int getDurataRegistrazione() {
        return durataRegistrazione;
    }

    public void display() {
    	System.out.println("=============================================");
        System.out.println("     REGISTRAZIONE TV  ");
        System.out.println("=============================================");
        System.out.println("Canale TV: " + canaleTelevisivo);
        System.out.println("Data inizio: " + giornoRegistrazione + "/" + meseRegistrazione + "/" +  annoRegistrazione);
        System.out.println("Ora inizio: " +  oraRegistrazione + ":" +  minutiRegistrazione);
        System.out.println("Durata: " + durataRegistrazione + " minuti");
    }
}