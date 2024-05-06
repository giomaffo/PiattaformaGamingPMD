/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

/**
 *
 * @author gioma
 */

import com.mycompany.piattaformagaming_2024.eccezioni.*;
import com.mycompany.piattaformagaming_2024.utilita.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class PiattaformaGaming {
    private Videogioco[] videogiochi;
    private PersonaggioGiocabile[] personaggiGiocabili;
    private static final int MAX_VIDEOGIOCHI = 100;
    private static final int MAX_PERSONAGGI = 100;

    public PiattaformaGaming() {
        this.videogiochi = new Videogioco[MAX_VIDEOGIOCHI];
        this.personaggiGiocabili = new PersonaggioGiocabile[MAX_PERSONAGGI];
    }

    public PiattaformaGaming(PiattaformaGaming piattaformaGaming) {
        this.videogiochi = new Videogioco[MAX_VIDEOGIOCHI];
        this.personaggiGiocabili = new PersonaggioGiocabile[MAX_PERSONAGGI];
        for (int i = 0; i < piattaformaGaming.videogiochi.length; i++) {
            if (piattaformaGaming.videogiochi[i] != null) {
                this.videogiochi[i] = new Videogioco(piattaformaGaming.videogiochi[i]);
            }
        }
        for (int i = 0; i < piattaformaGaming.personaggiGiocabili.length; i++) {
            if (piattaformaGaming.personaggiGiocabili[i] != null) {
                this.personaggiGiocabili[i] = new PersonaggioGiocabile(piattaformaGaming.personaggiGiocabili[i]);
            }
        }
    }

    public void aggiungiVideogioco(Videogioco videogioco) {
        for (int i = 0; i < videogiochi.length; i++) {
            if (videogiochi[i] == null) {
                videogiochi[i] = videogioco;
                break;
            }
        }
    }

    public void rimuoviVideogioco(String titolo) {
        for (int i = 0; i < videogiochi.length; i++) {
            if (videogiochi[i] != null && videogiochi[i].getTitolo().equals(titolo)) {
                videogiochi[i] = null;
                break;
            }
        }
    }

    public Videogioco cercaVideogioco(String titolo) {
        for (Videogioco videogioco : videogiochi) {
            if (videogioco != null && videogioco.getTitolo().equals(titolo)) {
                return videogioco;
            }
        }
        return null;
    }

    public void aggiungiPersonaggioGiocabile(PersonaggioGiocabile personaggio) {
        for (int i = 0; i < personaggiGiocabili.length; i++) {
            if (personaggiGiocabili[i] == null) {
                personaggiGiocabili[i] = personaggio;
                break;
            }
        }
    }

    public void rimuoviPersonaggioGiocabile(String nome) {
        for (int i = 0; i < personaggiGiocabili.length; i++) {
            if (personaggiGiocabili[i] != null && personaggiGiocabili[i].getNome().equals(nome)) {
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

    // Altri metodi della classe PiattaformaGaming rimangono invariati
}
