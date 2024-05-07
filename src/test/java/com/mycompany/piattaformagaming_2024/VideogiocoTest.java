/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gioma
 */

public class VideogiocoTest {

    @Test
    public void testGetNUM_MAX_PERSONAGGI() {
        Videogioco instance = new Videogioco();
        int expResult = 15; 
        int result = instance.getNUM_MAX_PERSONAGGI();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNumeroPersonaggiPresenti() {
        Videogioco instance = new Videogioco();
        int expResult = 0;
        int result = instance.getNumeroPersonaggiPresenti();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNumPersonaggiGiocabili() {
        Videogioco instance = new Videogioco();
        int expResult = 0;
        int result = instance.getNumPersonaggiGiocabili();
        assertEquals(expResult, result);
    }

    @Test
    public void testAggiungiPersonaggio() {
        Videogioco instance = new Videogioco();
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        instance.aggiungiPersonaggio(personaggio);
        assertEquals(1, instance.getNumeroPersonaggiPresenti());
    }

    @Test
    public void testEliminaPersonaggio() throws Exception {
        Videogioco instance = new Videogioco();
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        instance.aggiungiPersonaggio(personaggio);
        int expResult = 0;
        int result = instance.eliminaPersonaggio(1);
        assertEquals(expResult, result);
        assertEquals(0, instance.getNumeroPersonaggiPresenti());
    }

    @Test
    public void testCercaPersonaggio() {
        Videogioco instance = new Videogioco();
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        instance.aggiungiPersonaggio(personaggio);
        PersonaggioGiocabile expResult = personaggio;
        PersonaggioGiocabile result = instance.cercaPersonaggio("Mario");
        assertEquals(expResult, result);
    }

    @Test
    public void testCercaPersonaggioPerId() {
        Videogioco instance = new Videogioco();
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        instance.aggiungiPersonaggio(personaggio);
        PersonaggioGiocabile expResult = personaggio;
        PersonaggioGiocabile result = instance.cercaPersonaggioPerId(1);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsportaCSV() throws Exception {
        Videogioco instance = new Videogioco();
        String fileName = "test.csv"; 
        instance.esportaCSV(fileName);
    }

    @Test
    public void testImportaCSV() throws Exception {
        Videogioco instance = new Videogioco();
        String fileName = "test.csv"; 
        instance.importaCSV(fileName);
    }

    @Test
    public void testSalvaVideogioco() throws Exception {
        Videogioco instance = new Videogioco();
        String fileName = "test.dat"; 
        instance.salvaVideogioco(fileName);
    }
}
