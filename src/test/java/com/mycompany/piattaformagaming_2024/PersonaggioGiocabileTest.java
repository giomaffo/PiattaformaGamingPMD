/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.piattaformagaming_2024;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

public class PersonaggioGiocabileTest {

    @Test
    public void testCostruttoreConValoriValidi() {
        LocalDateTime now = LocalDateTime.now();
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);

        assertEquals(1, personaggio.getId());
        assertEquals("Mario", personaggio.getNome());
        assertEquals(10, personaggio.getLivello());
        assertEquals(100, personaggio.getPuntiVita());
        assertEquals(20, personaggio.getAttacco());
        assertEquals(15, personaggio.getDifesa());
        assertTrue(now.isBefore(personaggio.getUltimaModifica()) || now.isEqual(personaggio.getUltimaModifica()));
    }

    @Test
    public void testCostruttoreDiCopia() {
        LocalDateTime now = LocalDateTime.now();
        PersonaggioGiocabile originale = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        PersonaggioGiocabile copia = new PersonaggioGiocabile(originale);

        assertEquals(originale.getId(), copia.getId());
        assertEquals(originale.getNome(), copia.getNome());
        assertEquals(originale.getLivello(), copia.getLivello());
        assertEquals(originale.getPuntiVita(), copia.getPuntiVita());
        assertEquals(originale.getAttacco(), copia.getAttacco());
        assertEquals(originale.getDifesa(), copia.getDifesa());
        assertTrue(now.isBefore(copia.getUltimaModifica()) || now.isEqual(copia.getUltimaModifica()));
    }

    @Test
    public void testSetId() {
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        personaggio.setId(2);
        assertEquals(2, personaggio.getId());
    }

    @Test
    public void testSetNome() {
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        personaggio.setNome("Luigi");
        assertEquals("Luigi", personaggio.getNome());
    }

    @Test
    public void testSetLivello() {
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        personaggio.setLivello(15);
        assertEquals(15, personaggio.getLivello());
    }

    @Test
    public void testSetPuntiVita() {
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        personaggio.setPuntiVita(120);
        assertEquals(120, personaggio.getPuntiVita());
    }

    @Test
    public void testSetAttacco() {
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        personaggio.setAttacco(25);
        assertEquals(25, personaggio.getAttacco());
    }

    @Test
    public void testSetDifesa() {
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        personaggio.setDifesa(20);
        assertEquals(20, personaggio.getDifesa());
    }

    @Test
    public void testToString() {
        PersonaggioGiocabile personaggio = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        String expected = "1;Mario;10;100;20;15";
        assertEquals(expected, personaggio.toString());
    }
    
    @Test
    public void testEquals() {
        // Creiamo due personaggi con gli stessi attributi
        PersonaggioGiocabile personaggio1 = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);
        PersonaggioGiocabile personaggio2 = new PersonaggioGiocabile(1, "Mario", 10, 100, 20, 15);

        // Verifichiamo se sono uguali
        assertTrue(personaggio1.equals(personaggio2));
    }
}
