/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piattaformagaming_2024.utilita;

import com.mycompany.piattaformagaming_2024.eccezioni.FileException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Studente
 */
/**
 * La classe {@code TextFile} fornisce metodi per leggere e scrivere da file di testo.
 * Supporta due modalità di operazione: lettura (R) e scrittura (W).
 * È possibile specificare se il file deve essere aperto in modalità di aggiunta (append) per la scrittura.
 */

public class TextFile {

    private char mode;
    private BufferedReader reader;
    private BufferedWriter writer;

    /**
     * Costruttore della classe {@code TextFile}.
     * Apre il file specificato in modalità di lettura o scrittura.
     *
     * @param fileName il nome del file da aprire
     * @param mode la modalità di apertura del file (R per lettura, W per scrittura)
     * @throws FileNotFoundException se il file non viene trovato
     * @throws IOException se si verifica un errore di I/O durante l'apertura del file
     */
    public TextFile(String fileName, char mode) throws FileNotFoundException, IOException {
        this.mode = 'R';
        if (mode == 'W' || mode == 'w')
            this.mode = 'W';

        if (this.mode == 'R') {
            reader = new BufferedReader(new FileReader(fileName));
        } else {
            writer = new BufferedWriter(new FileWriter(fileName));
        }
    }

    /**
     * Costruttore della classe {@code TextFile} con opzione di aggiunta.
     * Apre il file specificato in modalità di lettura o scrittura, con l'opzione di aggiungere al file esistente.
     *
     * @param fileName il nome del file da aprire
     * @param mode la modalità di apertura del file (R per lettura, W per scrittura)
     * @param append true se si vuole aggiungere al file esistente, false altrimenti
     * @throws FileNotFoundException se il file non viene trovato
     * @throws IOException se si verifica un errore di I/O durante l'apertura del file
     */
    public TextFile(String fileName, char mode, boolean append) throws FileNotFoundException, IOException {
        this.mode = 'R';
        if (mode == 'W' || mode == 'w')
            this.mode = 'W';

        if (this.mode == 'R') {
            reader = new BufferedReader(new FileReader(fileName));
        } else {
            writer = new BufferedWriter(new FileWriter(fileName, append));
        }
    }

    /**
     * Scrive una riga nel file aperto in modalità di scrittura.
     *
     * @param line la riga da scrivere nel file
     * @throws FileException se il file è aperto in modalità di lettura
     * @throws IOException se si verifica un errore di I/O durante la scrittura nel file
     */
    public void toFile(String line) throws FileException, IOException {
        if (mode == 'R') {
            throw new FileException("Il file è aperto in lettura!");
        } else {
            writer.write(line);
            writer.newLine();
        }
    }

    /**
     * Legge una riga dal file aperto in modalità di lettura.
     *
     * @return la riga letta dal file
     * @throws FileException se il file è aperto in modalità di scrittura o se si raggiunge la fine del file
     * @throws IOException se si verifica un errore di I/O durante la lettura dal file
     */
    public String fromFile() throws FileException, IOException {
        String line;
        if (mode == 'W') {
            throw new FileException("Il file è aperto in scrittura!");
        } else {
            line = reader.readLine();
        }
        if (line == null)
            throw new FileException("Fine del file");
        return line;
    }

    /**
     * Chiude il file aperto.
     *
     * @throws IOException se si verifica un errore durante la chiusura del file
     */
    public void close() throws IOException {
        if (mode == 'R') {
            reader.close();
        } else {
            writer.close();
        }
    }
}
