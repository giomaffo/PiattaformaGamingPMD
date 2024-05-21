/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

import com.mycompany.piattaformagaming_2024.eccezioni.EccezioneValoreNonEsistente;
import com.mycompany.piattaformagaming_2024.eccezioni.FileException;
import com.mycompany.piattaformagaming_2024.utilita.TextFile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;

/**
 * La classe rappresenta un videogioco.
 * Contiene metodi per gestire i personaggi giocabili nel videogioco.
 * I suoi attributi sono:<br>
 * personaggiGiocabili: array di personaggi giocabili presenti nel videogioco<br>
 * NUM_MAX_PERSONAGGI: attributo statico, rappresenta il numero massimo di personaggi giocabili
 * che possono essere presenti nel videogioco<br>
 * numeroPersonaggiPresenti: numero attuale di personaggi presenti nel videogioco
 * In questa classe vengono gestiti i personaggi giocabili all'interno di un videogioco.
 * @author GiorgioMaffolini
 * @version 1.0
 */
public class Videogioco implements Serializable {

    private PersonaggioGiocabile[] personaggiGiocabili;
    private final static int NUM_MAX_PERSONAGGI = 15;
    private int numeroPersonaggiPresenti = 0;

    /**
     * Costruttore della classe Videogioco.
     * Consente di istanziare un nuovo videogioco.
     */
    public Videogioco() {
        this.personaggiGiocabili = new PersonaggioGiocabile[NUM_MAX_PERSONAGGI];
    }

    /**
     * Costruttore di copia della classe Videogioco.
     * Consente di istanziare un nuovo videogioco copiando un altro oggetto di classe Videogioco.
     * @param videogioco videogioco da cui effettuare la copia
     */
    public Videogioco(Videogioco videogioco) {
        this.personaggiGiocabili = new PersonaggioGiocabile[NUM_MAX_PERSONAGGI];
        for (int i = 0; i < NUM_MAX_PERSONAGGI; i++) {
            if (videogioco.getPersonaggiGiocabili()[i] != null) {
                this.personaggiGiocabili[i] = new PersonaggioGiocabile(videogioco.getPersonaggiGiocabili()[i]);
            }
        }
    }

    /**
     * Metodo getter per l'array di personaggi giocabili del videogioco.
     * @return l'array di personaggi giocabili del videogioco
     */
    public PersonaggioGiocabile[] getPersonaggiGiocabili() {
        return personaggiGiocabili;
    }
    
    /**
     * Metodo getter per il numero massimo di personaggi consentiti nel videogioco.
     * @return il numero massimo di personaggi consentiti
     */
    public int getNUM_MAX_PERSONAGGI() {
        return NUM_MAX_PERSONAGGI;
    }

    /**
     * Metodo getter per il numero attuale di personaggi presenti nel videogioco.
     * @return il numero attuale di personaggi presenti
     */
    public int getNumeroPersonaggiPresenti() {
        return numeroPersonaggiPresenti;
    }
    
    /**
     * Restituisce il numero di personaggi giocabili presenti nell'array con valore diverso da null.
     * @return Il numero di personaggi giocabili presenti nell'array con valore diverso da null
     */
    public int getNumPersonaggiGiocabili() {
        int contatore = 0;
        for (PersonaggioGiocabile personaggio : personaggiGiocabili) {
            if (personaggio != null) {
                contatore++;
            }
        }
        return contatore;
    }

    /**
     * Restituisce il codice identificativo del personaggio giocabile in una determinata posizione dell'array.
     * @param posizione La posizione dell'array in cui si trova il personaggio giocabile
     * @return Il codice identificativo del personaggio giocabile in quella posizione dell'array
     */
    public int getCodice(int posizione) {
        if (posizione >= 0 && posizione < numeroPersonaggiPresenti) {
            return personaggiGiocabili[posizione].getId();
        } else {
            // Gestione dell'errore nel caso la posizione sia fuori dall'array
            System.out.println("Posizione non valida.");
            return -1; // Valore di default per indicare un errore
        }
    }

    /**
     * Metodo che aggiunge un personaggio giocabile all'array di personaggi giocabili del videogioco.
     * @param personaggio il personaggio da aggiungere al videogioco
     */
    public void aggiungiPersonaggio(PersonaggioGiocabile personaggio) {
        if (numeroPersonaggiPresenti < NUM_MAX_PERSONAGGI) {
            personaggiGiocabili[numeroPersonaggiPresenti] = personaggio;
            numeroPersonaggiPresenti++;
        } else {
            System.out.println("Impossibile aggiungere altri personaggi, numero massimo raggiunto.");
        }
    }

        /**
     * Elimina un personaggio dalla lista in base al codice identificativo fornito.
     * 
     * @param codice Il codice identificativo del personaggio da eliminare.
     * @return 0 se l'eliminazione è avvenuta con successo, -1 se il personaggio non è stato trovato.
     * @throws InputMismatchException Se si verifica un errore durante l'input del codice.
     * @throws EccezioneValoreNonEsistente Se non esiste un personaggio con il codice specificato.
     */
    public int eliminaPersonaggio(int codice) throws InputMismatchException, EccezioneValoreNonEsistente {
        int c = 0;

        for (int i = 0; i < numeroPersonaggiPresenti; i++) {
            if (personaggiGiocabili[i] != null) {
                if (personaggiGiocabili[i].getId() == codice) {
                    aggiornaPosizionePersonaggio(i);
                    return 0; 
                } else {
                    c++;
                }
            }
        }

        if (c == numeroPersonaggiPresenti) {
            throw new EccezioneValoreNonEsistente(); 
        }

        return -1;
    }
    
        /**
     * Aggiorna la posizione degli oggetti nell'array dopo l'eliminazione di un personaggio.
     * 
     * @param posizione La posizione in cui spostare gli elementi.
     */
    private void aggiornaPosizionePersonaggio(int posizione) {
        for (int i = posizione; i < numeroPersonaggiPresenti - 1; i++) {
            personaggiGiocabili[i] = personaggiGiocabili[i + 1];
        }
        personaggiGiocabili[numeroPersonaggiPresenti - 1] = null; // Se ne elimina uno, sicuramente l'ultimo deve contenere null (lo faccio per togliere dall'array il personaggio eliminato).
        numeroPersonaggiPresenti--;
    }


    /**
     * Metodo che cerca un personaggio giocabile nel videogioco.
     * @param nome il nome del personaggio da cercare
     * @return il personaggio giocabile se presente nel videogioco, altrimenti null
     */
    public PersonaggioGiocabile cercaPersonaggio(String nome) {
        for (PersonaggioGiocabile personaggio : personaggiGiocabili) {
            if (personaggio != null && personaggio.getNome().equals(nome)) {
                return personaggio;
            }
        }
        return null;
    }
    
    /**
    * Cerca un personaggio giocabile nel videogioco utilizzando l'ID del personaggio.
    *
    * @param id l'ID del personaggio da cercare
    * @return il personaggio giocabile corrispondente all'ID se presente nel videogioco, altrimenti null
    */
    public PersonaggioGiocabile cercaPersonaggioPerId(int id) {
       for (PersonaggioGiocabile personaggio : personaggiGiocabili) {
           if (personaggio != null && personaggio.getId() == id) {
               return personaggio;
           }
       }
       return null;
    }

    /**
     * Metodo che esporta i personaggi giocabili del videogioco in un file CSV.
     * @param fileName il nome del file CSV in cui esportare i personaggi giocabili
     * @throws IOException se si verifica un errore di I/O durante l'operazione di scrittura del file
     * @throws FileException se si verifica un errore durante l'operazione di scrittura del file
     */
    public void esportaCSV(String fileName) throws IOException, FileException {
        TextFile f1 = new TextFile(fileName, 'W');
        PersonaggioGiocabile personaggio;
        String datiPersonaggio;

        for (int i = 0; i < NUM_MAX_PERSONAGGI; i++) {
            if (personaggiGiocabili[i] != null) {
                personaggio = personaggiGiocabili[i];
                datiPersonaggio = personaggio.getId() + ";" + personaggio.getNome() + ";" + personaggio.getLivello() + ";" + personaggio.getPuntiVita() + ";" + personaggio.getAttacco() + ";" + personaggio.getDifesa();
                f1.toFile(datiPersonaggio);
            }
        }
        f1.close();
    }

    /**
     * Metodo che importa i personaggi giocabili da un file CSV nel videogioco.
     * @param fileName il nome del file CSV da cui importare i personaggi giocabili
     * @throws IOException se si verifica un errore di I/O durante l'operazione di lettura del file
    */
    public void importaCSV(String fileName) throws IOException {
        TextFile f1 = new TextFile(fileName, 'R');
        String rigaLetta;
        String[] datiPersonaggio;
        String nome;
        int id, livello, puntiVita, attacco, difesa;
        PersonaggioGiocabile personaggio;

        try {
            while (true) {
                rigaLetta = f1.fromFile();
                datiPersonaggio = rigaLetta.split(";");
                id = Integer.parseInt(datiPersonaggio[0]);
                nome = datiPersonaggio[1];
                livello = Integer.parseInt(datiPersonaggio[2]);
                puntiVita = Integer.parseInt(datiPersonaggio[3]);
                attacco = Integer.parseInt(datiPersonaggio[4]);
                difesa = Integer.parseInt(datiPersonaggio[5]);

                personaggio = new PersonaggioGiocabile(id, nome, livello, puntiVita, attacco, difesa);
                
                try {
                    aggiungiPersonaggio(personaggio);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    // Ignora il personaggio se il numero massimo di personaggi è stato raggiunto
                }
            }
        } catch (FileException ex) {
            // Fine del file di testo
            f1.close();
        }
    }

    /**
     * Metodo che salva lo stato corrente del videogioco in un file.
     * @param fileName il nome del file in cui salvare lo stato del videogioco
     * @throws FileNotFoundException se il file specificato non è trovato
     * @throws IOException se si verifica un errore di I/O durante l'operazione di scrittura del file
     */
    public void salvaVideogioco(String fileName) throws FileNotFoundException, IOException {
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fileName));
        writer.writeObject(this);
        writer.flush();
        writer.close();
    }
    
    /**
     * Metodo che carica lo stato del videogioco da un file.
     * @param fileName il nome del file da cui caricare lo stato del videogioco
     * @return il videogioco caricato
     * @throws FileNotFoundException se il file specificato non è trovato
     * @throws IOException se si verifica un errore di I/O durante l'operazione di lettura del file
     * @throws ClassNotFoundException se la classe del file letto non è trovata
     */
    public Videogioco caricaVideogioco(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
       Videogioco v;
       ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileName));
       v = (Videogioco) reader.readObject();
       reader.close();
       return v;
    }
    
    /**
    * Metodo che visualizza tutti i personaggi giocabili presenti nel videogioco.
    */
    public void visualizzaPersonaggi() {
       if (numeroPersonaggiPresenti == 0) {
           System.out.println("Nessun personaggio presente.");
       } else {
           System.out.println("Elenco dei personaggi giocabili:");
           for (PersonaggioGiocabile personaggio : personaggiGiocabili) {
               if (personaggio != null) {
                   System.out.println(personaggio);
               }
           }
       }
   }
}
