/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

/**
 *
 * @author Studente
 */

import java.time.LocalDateTime;
import java.io.Serializable;

public class PersonaggioGiocabile implements Serializable 
{
    private int id;
    private String nome;
    private int livello;
    private int puntiVita;
    private int attacco;
    private int difesa;
    private LocalDateTime ultimaModifica;

    public PersonaggioGiocabile(int id, String nome, int livello, int puntiVita, int attacco, int difesa) 
    {
        this.id = id;
        this.nome = nome;
        this.livello = livello;
        this.puntiVita = puntiVita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.ultimaModifica = LocalDateTime.now();
    }

    public PersonaggioGiocabile(PersonaggioGiocabile personaggio) 
    {
        this.id = personaggio.getId();
        this.nome = personaggio.getNome();
        this.livello = personaggio.getLivello();
        this.puntiVita = personaggio.getPuntiVita();
        this.attacco = personaggio.getAttacco();
        this.difesa = personaggio.getDifesa();
        this.ultimaModifica = personaggio.getUltimaModifica();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
        this.ultimaModifica = LocalDateTime.now();
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
        this.ultimaModifica = LocalDateTime.now();
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
        this.ultimaModifica = LocalDateTime.now();
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
        this.ultimaModifica = LocalDateTime.now();
    }
    
    public LocalDateTime getUltimaModifica()
    {
        return this.ultimaModifica;
    }

    @Override
    public String toString() {
        return getId() + ";" + getNome() + ";" + getLivello() + ";" + getPuntiVita() + ";" + getAttacco() + ";" + getDifesa();
    }

}
