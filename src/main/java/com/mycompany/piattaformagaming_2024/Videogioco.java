/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

import java.util.ArrayList;

public class Videogioco 
{
    private String titolo;
    private String genere;
    private int annoPubblicazione;
    private ArrayList<PersonaggioGiocabile> personaggiGiocabili;

    // Costruttore
    public Videogioco(String titolo, String genere, int annoPubblicazione) {
        this.titolo = titolo;
        this.genere = genere;
        this.annoPubblicazione = annoPubblicazione;
        this.personaggiGiocabili = new ArrayList<>();
    }

    // Costruttore di copia
    public Videogioco(Videogioco videogioco) {
        this.titolo = videogioco.getTitolo();
        this.genere = videogioco.getGenere();
        this.annoPubblicazione = videogioco.getAnnoPubblicazione();
        this.personaggiGiocabili = new ArrayList<>(videogioco.getPersonaggiGiocabili());
    }

    // Metodi getter e setter per titolo, genere e annoPubblicazione
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

    // Metodo getter per personaggiGiocabili
    public ArrayList<PersonaggioGiocabile> getPersonaggiGiocabili() {
        return personaggiGiocabili;
    }

    // Metodi per gestire i personaggi giocabili
    public void aggiungiPersonaggio(PersonaggioGiocabile personaggio) {
        personaggiGiocabili.add(personaggio);
    }

    public void rimuoviPersonaggio(PersonaggioGiocabile personaggio) {
        personaggiGiocabili.remove(personaggio);
    }

    public PersonaggioGiocabile cercaPersonaggio(String nome) {
        for (PersonaggioGiocabile personaggio : personaggiGiocabili) {
            if (personaggio.getNome().equals(nome)) {
                return personaggio;
            }
        }
        return null;
    }
}
