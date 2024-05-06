/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

import java.io.Serializable;

public class Videogioco implements Serializable {

    private String titolo;
    private String genere;
    private int annoPubblicazione;
    private PersonaggioGiocabile[] personaggiGiocabili;
    private final static int NUM_MAX_PERSONAGGI = 15;

    public Videogioco(String titolo, String genere, int annoPubblicazione) {
        this.titolo = titolo;
        this.genere = genere;
        this.annoPubblicazione = annoPubblicazione;
        this.personaggiGiocabili = new PersonaggioGiocabile[NUM_MAX_PERSONAGGI];
    }

    public Videogioco(Videogioco videogioco) {
        this.titolo = videogioco.getTitolo();
        this.genere = videogioco.getGenere();
        this.annoPubblicazione = videogioco.getAnnoPubblicazione();
        this.personaggiGiocabili = new PersonaggioGiocabile[NUM_MAX_PERSONAGGI];
        for (int i = 0; i < NUM_MAX_PERSONAGGI; i++) {
            if (videogioco.getPersonaggiGiocabili()[i] != null) {
                this.personaggiGiocabili[i] = new PersonaggioGiocabile(videogioco.getPersonaggiGiocabili()[i]);
            }
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public PersonaggioGiocabile[] getPersonaggiGiocabili() {
        return personaggiGiocabili;
    }

    public void aggiungiPersonaggio(PersonaggioGiocabile personaggio) {
        for (int i = 0; i < NUM_MAX_PERSONAGGI; i++) {
            if (personaggiGiocabili[i] == null) {
                personaggiGiocabili[i] = personaggio;
                break;
            }
        }
    }

    public void rimuoviPersonaggio(PersonaggioGiocabile personaggio) {
        for (int i = 0; i < NUM_MAX_PERSONAGGI; i++) {
            if (personaggiGiocabili[i] == personaggio) {
                personaggiGiocabili[i] = null;
                break;
            }
        }
    }

    public PersonaggioGiocabile cercaPersonaggio(String nome) {
        for (PersonaggioGiocabile personaggio : personaggiGiocabili) {
            if (personaggio != null && personaggio.getNome().equals(nome)) {
                return personaggio;
            }
        }
        return null;
    }
}
