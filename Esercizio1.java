import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in);
        int eta, numerocertificazioni, anniesperienza; //creo le variabili numeriche 
        // creo lo scanner per i numeri in input
        boolean idoneo = false; //booleano per l'idoneità, assunto falso
        double totaleanni; // double della radice del totale degli anni
        System.out.println("Ciao! Verica la tua idoneità per il corso avanzato"); //messaggio di benvenuto
        System.out.println("Inserisci la tua età"); //richiedo l'età
        eta = scannerNum.nextInt(); //input dell'età
        System.out.println("Inserisci il numero di anni di programmazione posseduti"); // richiedo l'esperienza
        anniesperienza = scannerNum.nextInt(); //input degli anni  di esperienza
        System.out.println("Inserisci il numero di certificazione possedute"); //richiedo le certificazioni
        numerocertificazioni = scannerNum.nextInt(); // input del numero di certificazioni
        if (eta>18 && anniesperienza>=2){ //se è maggiorenne e ha almeno 2 anni di esperienza
            idoneo= true; //cambio idoneo a true
        }
        if(numerocertificazioni>=1 && (eta>=16 && eta<=18)){ // se il numero di certificazioni è di almeno una e letà è nel range 16-18
            idoneo = true; //cambio idoneo a true
        }
        totaleanni = Math.sqrt(eta+anniesperienza); //calcolo la radice quadrata del totale di anni ed esperienza
        System.out.println("Il totale dell'esperienza è: " +totaleanni); //stampo il risultato della radice quadrata
        if(idoneo==true){ //se idoneo è true
            System.out.println("Idoneo al corso"); //stampa messaggio idoeno
        } else{
            System.out.println("Non idoneo al corso"); //stampa messaggio non idoneo
        }
        scannerNum.close();
    }


}