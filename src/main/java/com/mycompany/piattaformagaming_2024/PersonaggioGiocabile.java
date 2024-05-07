/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * La classe rappresenta un personaggio giocabile in un videogioco.
 * I suoi attributi sono:<br>
 * id: identificativo univoco del personaggio<br>
 * nome: nome del personaggio<br>
 * livello: livello del personaggio<br>
 * puntiVita: punti vita del personaggio<br>
 * attacco: valore di attacco del personaggio<br>
 * difesa: valore di difesa del personaggio<br>
 * ultimaModifica: data e ora dell'ultima modifica al personaggio<br>
 * In questa classe vengono inserite tutte le informazioni di un personaggio giocabile.
 * @author GiorgioMaffolini
 * @version 1.0
 */
public class PersonaggioGiocabile implements Serializable {
    private int id;
    private String nome;
    private int livello;
    private int puntiVita;
    private int attacco;
    private int difesa;
    private LocalDateTime ultimaModifica;

    /**
     * Costruttore della classe PersonaggioGiocabile.
     * Consente di istanziare un nuovo personaggio giocabile.
     * @param id identificativo univoco del personaggio
     * @param nome nome del personaggio
     * @param livello livello del personaggio
     * @param puntiVita punti vita del personaggio
     * @param attacco valore di attacco del personaggio
     * @param difesa valore di difesa del personaggio
     */
    public PersonaggioGiocabile(int id, String nome, int livello, int puntiVita, int attacco, int difesa) {
        this.id = id;
        this.nome = nome;
        this.livello = livello;
        this.puntiVita = puntiVita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.ultimaModifica = LocalDateTime.now();
    }

    /**
     * Costruttore di copia della classe PersonaggioGiocabile.
     * Consente di istanziare un nuovo personaggio giocabile copia di quello passato come parametro.
     * @param personaggio personaggio di cui verrà effettuata la copia nel costruttore di copia
     */
    public PersonaggioGiocabile(PersonaggioGiocabile personaggio) {
        this.id = personaggio.getId();
        this.nome = personaggio.getNome();
        this.livello = personaggio.getLivello();
        this.puntiVita = personaggio.getPuntiVita();
        this.attacco = personaggio.getAttacco();
        this.difesa = personaggio.getDifesa();
        this.ultimaModifica = personaggio.getUltimaModifica();
    }

    /**
     * Metodo getter per l'identificativo univoco del personaggio.
     * @return l'identificativo univoco del personaggio
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo setter per l'identificativo univoco del personaggio.
     * @param id l'identificativo univoco da assegnare al personaggio
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo getter per il nome del personaggio.
     * @return il nome del personaggio
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo setter per il nome del personaggio.
     * @param nome il nome da assegnare al personaggio
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo getter per il livello del personaggio.
     * @return il livello del personaggio
     */
    public int getLivello() {
        return livello;
    }

    /**
     * Metodo setter per il livello del personaggio.
     * @param livello il livello da assegnare al personaggio
     */
    public void setLivello(int livello) {
        this.livello = livello;
        this.ultimaModifica = LocalDateTime.now();
    }

    /**
     * Metodo getter per i punti vita del personaggio.
     * @return i punti vita del personaggio
     */
    public int getPuntiVita() {
        return puntiVita;
    }

    /**
     * Metodo setter per i punti vita del personaggio.
     * @param puntiVita i punti vita da assegnare al personaggio
     */
    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
        this.ultimaModifica = LocalDateTime.now();
    }

    /**
     * Metodo getter per il valore di attacco del personaggio.
     * @return il valore di attacco del personaggio
     */
    public int getAttacco() {
        return attacco;
    }

    /**
     * Metodo setter per il valore di attacco del personaggio.
     * @param attacco il valore di attacco da assegnare al personaggio
     */
    public void setAttacco(int attacco) {
        this.attacco = attacco;
        this.ultimaModifica = LocalDateTime.now();
    }

    /**
     * Metodo getter per il valore di difesa del personaggio.
     * @return il valore di difesa del personaggio
     */
    public int getDifesa() {
        return difesa;
    }

    /**
     * Metodo setter per il valore di difesa del personaggio.
     * @param difesa il valore di difesa da assegnare al personaggio
     */
    public void setDifesa(int difesa) {
        this.difesa = difesa;
        this.ultimaModifica = LocalDateTime.now();
    }

    /**
     * Metodo getter per la data e l'ora dell'ultima modifica al personaggio.
     * @return la data e l'ora dell'ultima modifica
     */
    public LocalDateTime getUltimaModifica() {
        return this.ultimaModifica;
    }

    /**
     * Metodo toString di tutti gli attributi della classe PersonaggioGiocabile.
     * Ci permette di visualizzare il valore di tutti gli attributi del personaggio giocabile.
     * @return una stringa contenente il valore degli attributi del personaggio giocabile
     */
    @Override
    public String toString() {
        return getId() + ";" + getNome() + ";" + getLivello() + ";" + getPuntiVita() + ";" + getAttacco() + ";" + getDifesa();
    }
    /**
    * Determina se questo personaggio giocabile è uguale a un altro oggetto.
    * Due personaggi giocabili sono considerati uguali se hanno lo stesso ID.
    *
    * @param o l'oggetto da confrontare con questo personaggio giocabile
    * @return true se l'oggetto specificato è uguale a questo personaggio giocabile,
    *         false altrimenti
    */
    @Override
    public boolean equals(Object o)
    {
        PersonaggioGiocabile personaggio;
        personaggio=(PersonaggioGiocabile)o;
        if (personaggio.getAttacco()==getAttacco() && personaggio.getPuntiVita()==getPuntiVita() && personaggio.getNome()==getNome() && personaggio.getDifesa()==getDifesa())
            return true;
        else
            return false;
    }
}
