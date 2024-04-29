/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

/**
 *
 * @author Studente
 */
class Videogioco 
{
    private String titolo;
    private String genere;
    private int annoPubblicazione;

    // Costruttore
    public Videogioco(String titolo, String genere, int annoPubblicazione) {
        this.titolo = titolo;
        this.genere = genere;
        this.annoPubblicazione = annoPubblicazione;
    }

    // Metodi Getter
    public String getTitolo() {
        return titolo;
    }

    public String getGenere() {
        return genere;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }
}

