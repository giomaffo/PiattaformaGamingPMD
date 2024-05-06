/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

import java.io.Serializable;
import java.util.ArrayList;

public class Videogioco implements Serializable 
{
    private String titolo;
    private ArrayList<PersonaggioGiocabile> personaggi;

    public Videogioco() {
        this.personaggi = new ArrayList<>();
    }

    public Videogioco(Videogioco videogioco) {
        this.titolo = videogioco.getTitolo();
        this.personaggi = new ArrayList<>(videogioco.getPersonaggi());
    }

    public void aggiungiPersonaggio(PersonaggioGiocabile personaggio) {
        personaggi.add(personaggio);
    }

    public void rimuoviPersonaggio(String nome) {
        PersonaggioGiocabile daRimuovere = null;
        for (PersonaggioGiocabile personaggio : personaggi) {
            if (personaggio.getNome().equalsIgnoreCase(nome)) {
                daRimuovere = personaggio;
                break;
            }
        }
        if (daRimuovere != null) {
            personaggi.remove(daRimuovere);
            System.out.println("Personaggio rimosso con successo.");
        } else {
            System.out.println("Personaggio non trovato.");
        }
    }

    public ArrayList<PersonaggioGiocabile> getPersonaggi() {
        return personaggi;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String toString() {
        String s = "Videogioco: " + titolo + "\n";
        for (PersonaggioGiocabile personaggio : personaggi) {
            s += personaggio.toString() + "\n";
        }
        return s;
    }
}