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

class PiattaformaGaming implements Serializable 
{
    private List<Videogioco> videogiochi;
    private List<PersonaggioGiocabile> personaggiGiocabili;

    public PiattaformaGaming() 
    {
        this.videogiochi = new ArrayList<>();
        this.personaggiGiocabili = new ArrayList<>();
    }

    public void aggiungiVideogioco(Videogioco videogioco) 
    {
        videogiochi.add(videogioco);
    }

    public void rimuoviVideogioco(String titolo) 
    {
        Videogioco videogioco = cercaVideogioco(titolo);
        if (videogioco != null) {
            videogiochi.remove(videogioco);
        }
    }

    public Videogioco cercaVideogioco(String titolo) 
    {
        for (Videogioco videogioco : videogiochi) 
        {
            if (videogioco.getTitolo().equals(titolo))
            {
                return videogioco;
            }
        }
        return null;
    }

    public void aggiungiPersonaggioGiocabile(PersonaggioGiocabile personaggio) 
    {
        personaggiGiocabili.add(personaggio);
    }

    public void rimuoviPersonaggioGiocabile(String nome) 
    {
        PersonaggioGiocabile personaggio = cercaPersonaggio(nome);
        if (personaggio != null) 
        {
            personaggiGiocabili.remove(personaggio);
        }
    }

    public PersonaggioGiocabile cercaPersonaggio(String nome) 
    {
        for (PersonaggioGiocabile personaggio : personaggiGiocabili) 
        {
            if (personaggio.getNome().equals(nome)) 
            {
                return personaggio;
            }
        }
        return null;
    }
}
    /*
    public void esportaCSV(String fileName) throws IOException, Object 
    {
        TextFile f1 = new TextFile(fileName, 'W');
        String datiPersonaggio;

        for (Videogioco videogioco : videogiochi) {
            for (PersonaggioGiocabile personaggio : videogioco.getPersonaggiGiocabili()) {
                datiPersonaggio = videogioco.getTitolo() + ";" +
                        personaggio.getNome() + ";" +
                        personaggio.getLivello() + ";" +
                        personaggio.getPuntiVita() + ";" +
                        personaggio.getAttacco() + ";" +
                        personaggio.getDifesa();
                f1.toFile(datiPersonaggio);
            }
        }
        f1.close();
    }
    
    public void importaCSV(String fileName) throws IOException {
    TextFile f1 = new TextFile(fileName, 'R');
    String rigaLetta;
    String[] datiPersonaggio;
    String nomePersonaggio;
    int id, livello, puntiVita, attacco, difesa;
    
    try {
        while (true) {
            rigaLetta = f1.fromFile();
            datiPersonaggio = rigaLetta.split(";");
            id = Integer.parseInt(datiPersonaggio[0]); // Considerando che il primo campo sia l'id del personaggio
            nomePersonaggio = datiPersonaggio[1];
            livello = Integer.parseInt(datiPersonaggio[2]);
            puntiVita = Integer.parseInt(datiPersonaggio[3]);
            attacco = Integer.parseInt(datiPersonaggio[4]);
            difesa = Integer.parseInt(datiPersonaggio[5]);

            PersonaggioGiocabile personaggio = new PersonaggioGiocabile(id, nomePersonaggio, livello, puntiVita, attacco, difesa);

            Videogioco videogioco = cercaVideogioco(titoloVideogioco);
            if (videogioco != null) {
                videogioco.aggiungiPersonaggio(personaggio);
            } else {
                System.out.println("Videogioco non trovato: " + titoloVideogioco);
            }
        }
    } catch (FileException ex) {
        // E' finito il file di testo
        f1.close();
    }
    }


    public void aggiornaDettagliPersonaggioGiocabile(String nomePersonaggio, String attributo, int valore) {
        PersonaggioGiocabile personaggio = cercaPersonaggio(nomePersonaggio);
        if (personaggio != null) {
            switch (attributo) {
                case "livello":
                    personaggio.setLivello(valore);
                    break;
                case "puntiVita":
                    personaggio.setPuntiVita(valore);
                    break;
                case "attacco":
                    personaggio.setAttacco(valore);
                    break;
                case "difesa":
                    personaggio.setDifesa(valore);
                    break;
                default:
                    System.out.println("Attributo non valido.");
            }
        } else {
            System.out.println("Il personaggio " + nomePersonaggio + " non è presente nella piattaforma.");
        }
    }
}
*/