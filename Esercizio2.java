/*Traccia: Lista della spesa intelligente  
 Dopo l’inserimento, stampa: 
 Tutti gli elementi della lista (uno per riga) 
 
 Il numero totale di elementi inseriti 
 
 Se l’utente ha scritto sia "pane" e "latte" (usa .contains() e un if), stampa: "Hai pensato alla colazione!" */

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        ArrayList <String> listaspesa = new ArrayList<String>(); //creo un arraylist per la lista della spesa
        Scanner scannerStr = new Scanner(System.in);
        //creo lo scanner per le str
        String risposta = new String(); //variabile stringa per l'input 
        do{
            System.out.println("Inserisci il prodotto da aggiungere alla lista"); //stampo messaggio
            risposta = scannerStr.nextLine(); //input della risposta
            if(!risposta.equals("fine")){//se non ho digitato fine
                listaspesa.add(risposta); //aggiungo l'elemento
            }
        }while (!risposta.equals("fine")); //finchè l'input non è fine
        System.out.println("Ecco la tua lista della spesa: "); //stampo messaggio
        for(int i=0; i<listaspesa.size(); i++){//ciclo sugli elementi della lista
            System.out.println(listaspesa.get(i)); //stampo l'elemento il posizione i
        }
        System.out.println("Il totale di articoli è: " +listaspesa.size()); //stampo il numerod i articoli
        if(listaspesa.contains("latte") && listaspesa.contains("pane")){ // se la lista contiene pane e latte
            System.out.println("Hai pensato alla colazione!"); //stampo la stringa 
        }





    }

}
