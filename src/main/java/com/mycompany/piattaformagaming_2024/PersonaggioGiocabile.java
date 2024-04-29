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

class PersonaggioGiocabile {
    private int id;
    private String nome;
    private int livello;
    private int puntiVita;
    private int attacco;
    private int difesa;
    private int skillPoints;
    private LocalDateTime ultimaModifica;

    // Costruttore
    public PersonaggioGiocabile(int id, String nome, int livello, int puntiVita, int attacco, int difesa) {
        this.id = id;
        this.nome = nome;
        this.livello = livello;
        this.puntiVita = puntiVita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.skillPoints = 5; // Valore iniziale degli skill points
        this.ultimaModifica = LocalDateTime.now();
    }

    // Metodi Getter e Setter
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
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public LocalDateTime getUltimaModifica() {
        return ultimaModifica;
    }

}