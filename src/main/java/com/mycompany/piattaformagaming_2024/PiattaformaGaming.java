/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

/**
 *
 * @author Studente
 */

import java.util.ArrayList;

public class PiattaformaGaming 
{
    private ArrayList<Videogioco> videogiochi;
    private ArrayList<PersonaggioGiocabile> personaggiGiocabili;

    public PiattaformaGaming() {
        this.videogiochi = new ArrayList<>();
        this.personaggiGiocabili = new ArrayList<>();
    }

    public PiattaformaGaming(PiattaformaGaming piattaformaGaming) {
        this.videogiochi = new ArrayList<>(piattaformaGaming.videogiochi);
        this.personaggiGiocabili = new ArrayList<>(piattaformaGaming.personaggiGiocabili);
    }

    public void aggiungiVideogioco(Videogioco videogioco) {
        videogiochi.add(videogioco);
    }

    public void rimuoviVideogioco(String titolo) {
        Videogioco videogioco = cercaVideogioco(titolo);
        if (videogioco != null) {
            videogiochi.remove(videogioco);
        }
    }

    public Videogioco cercaVideogioco(String titolo) {
        for (Videogioco videogioco : videogiochi) {
            if (videogioco.getTitolo().equals(titolo)) {
                return videogioco;
            }
        }
        return null;
    }

    public void aggiungiPersonaggio(PersonaggioGiocabile personaggio) {
        personaggiGiocabili.add(personaggio);
}

    public void rimuoviPersonaggio(String nome) {
        PersonaggioGiocabile personaggio = cercaPersonaggio(nome);
        if (personaggio != null) {
            personaggiGiocabili.remove(personaggio);
        }
    }

    public PersonaggioGiocabile cercaPersonaggio(String nome) {
        for (PersonaggioGiocabile personaggio : personaggiGiocabili) {
            if (personaggio.getNome().equals(nome)) {
                return personaggio;
            }
        }
        return null;
    }

    public void ordinamentoVideogiochi(String criterio) {
        // Implementazione dell'ordinamento dei videogiochi
    }

    public void esportaDatiCSV() {
        // Implementazione dell'esportazione dei dati dei videogiochi in un file CSV
    }

    public void importaDatiCSV(String nomeFile) {
        // Implementazione dell'importazione dei dati dei videogiochi da un file CSV
    }

    public void aggiungiPersonaggioGiocabile(PersonaggioGiocabile personaggio, String titoloVideogioco) 
    {
        Videogioco videogioco = cercaVideogioco(titoloVideogioco);
        if (videogioco != null) {
            videogioco.aggiungiPersonaggio(personaggio);
        }
    }

   public void eliminaPersonaggioGiocabile(String nomePersonaggio, String titoloVideogioco) 
   {
        Videogioco videogioco = cercaVideogioco(titoloVideogioco);
        if (videogioco != null) 
        {
            PersonaggioGiocabile personaggio = videogioco.cercaPersonaggio(nomePersonaggio);
            if (personaggio != null) 
            {
                videogioco.rimuoviPersonaggio(personaggio);
            }
            else 
            {
                System.out.println("Il personaggio " + nomePersonaggio + " non è presente nel videogioco " + titoloVideogioco + ".");
            }
        } 
            else 
        {
            System.out.println("Il videogioco " + titoloVideogioco + " non è presente nella piattaforma.");
        }
    }
    
    public void visualizzaPersonaggiGiocabili(String titoloVideogioco) {
        Videogioco videogioco = cercaVideogioco(titoloVideogioco);
        if (videogioco != null) {
            System.out.println("Personaggi giocabili del videogioco " + titoloVideogioco + ":");
            ArrayList<PersonaggioGiocabile> personaggi = videogioco.getPersonaggiGiocabili();
            for (PersonaggioGiocabile personaggio : personaggi) {
                System.out.println("- " + personaggio.getNome());
            }
        } 
        else {
            System.out.println("Il videogioco " + titoloVideogioco + " non è presente nella piattaforma.");
        }
    }

    public void ricercaPersonaggioGiocabile(String criterio, String valore) {
        // Implementazione della ricerca di un personaggio giocabile in un videogioco
    }

    public void aggiornaDettagliPersonaggioGiocabile(String nomePersonaggio, String attributo, int valore) {
        // Implementazione dell'aggiornamento dei dettagli di un personaggio giocabile
    }

    public void ordinamentoPersonaggiGiocabili(String criterio) {
        // Implementazione dell'ordinamento dei personaggi giocabili
    }
}
