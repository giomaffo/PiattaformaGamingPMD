/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

/**
 *
 * @author Studente
 */
public class PiattaformaGaming 
{
    private static final int MAX_VIDEOGIOCHI = 100;
    private static final int MAX_PERSONAGGI_GIOCABILI = 100;

    private Videogioco[] videogiochi = new Videogioco[MAX_VIDEOGIOCHI];
    private PersonaggioGiocabile[] personaggiGiocabili = new PersonaggioGiocabile[MAX_PERSONAGGI_GIOCABILI];
    private int numVideogiochi = 0;
    private int numPersonaggiGiocabili = 0;

    // Metodi per aggiungere e rimuovere videogiochi
    public void aggiungiVideogioco(Videogioco videogioco) {
        if (numVideogiochi < MAX_VIDEOGIOCHI) {
            videogiochi[numVideogiochi++] = videogioco;
        } else {
            System.out.println("Limite massimo di videogiochi raggiunto.");
        }
    }

    public void rimuoviVideogioco(String titolo) {
        for (int i = 0; i < numVideogiochi; i++) {
            if (videogiochi[i].getTitolo().equals(titolo)) 
            {
                // Rimuove il videogioco spostando gli elementi successivi indietro di una posizione
                for (int j = i; j < numVideogiochi - 1; j++) {
                    videogiochi[j] = videogiochi[j + 1];
                }
                videogiochi[numVideogiochi - 1] = null; // Elimina l'ultimo elemento duplicato
                numVideogiochi--;
                System.out.println("Videogioco rimosso con successo.");
                return;
            }
        }
        System.out.println("Videogioco non trovato.");
    }

    public Videogioco cercaVideogioco(String titolo) {
        for (int i = 0; i < numVideogiochi; i++) {
            if (videogiochi[i].getTitolo().equals(titolo)) {
                return videogiochi[i];
            }
        }
        return null;
    }

    // Metodi per aggiungere e rimuovere personaggi giocabili
    public void aggiungiPersonaggio(PersonaggioGiocabile personaggio) {
        if (numPersonaggiGiocabili < MAX_PERSONAGGI_GIOCABILI) {
            personaggiGiocabili[numPersonaggiGiocabili++] = personaggio;
        } else {
            System.out.println("Limite massimo di personaggi giocabili raggiunto.");
        }
    }

    public void rimuoviPersonaggio(String nome) {
        for (int i = 0; i < numPersonaggiGiocabili; i++) {
            if (personaggiGiocabili[i].getNome().equals(nome)) {
                // Rimuove il personaggio spostando gli elementi successivi indietro di una posizione
                for (int j = i; j < numPersonaggiGiocabili - 1; j++) {
                    personaggiGiocabili[j] = personaggiGiocabili[j + 1];
                }
                personaggiGiocabili[numPersonaggiGiocabili - 1] = null; // Elimina l'ultimo elemento duplicato
                numPersonaggiGiocabili--;
                System.out.println("Personaggio giocabile rimosso con successo.");
                return;
            }
        }
        System.out.println("Personaggio giocabile non trovato.");
    }

    public PersonaggioGiocabile cercaPersonaggio(String nome) {
        for (int i = 0; i < numPersonaggiGiocabili; i++) {
            if (personaggiGiocabili[i].getNome().equals(nome)) {
                return personaggiGiocabili[i];
            }
        }
        return null;
    }

    // Altri metodi della classe PiattaformaGaming
    public void ordinamentoVideogiochi(String criterio) {
        // Implementazione dell'ordinamento dei videogiochi
        // Completamento alla fine del progetto
    }

    public void esportaDatiCSV() {
        // Implementazione dell'esportazione dei dati in formato CSV
        // Completamento alla fine del progetto
    }
}
