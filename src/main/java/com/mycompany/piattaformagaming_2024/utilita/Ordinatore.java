/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.piattaformagaming_2024.utilita;

import com.mycompany.piattaformagaming_2024.PersonaggioGiocabile;
/**
 * La classe {@code Ordinatore} fornisce metodi statici per ordinare gli oggetti di tipo {@code PersonaggioGiocabile}.
 * Attualmente, implementa un algoritmo di ordinamento basato sull'algoritmo di selection sort.
 */
public class Ordinatore {

    /**
     * Ordina in ordine decrescente i personaggi di un array
     * utilizzando l'algoritmo selection sort basato sul livello.
     *
     * @param personaggi l'array di {@code PersonaggioGiocabile} da ordinare
     * @return un array ordinato in ordine decrescente per livello
     */
    public static PersonaggioGiocabile[] selectionSortPerLivelloDecrescente(PersonaggioGiocabile[] personaggi) {
        PersonaggioGiocabile[] copia = copiaArray(personaggi);
        int lunghezza = copia.length;

        for (int i = 0; i < lunghezza - 1; i++) {
            int indiceMaxLivello = i;
            for (int j = i + 1; j < lunghezza; j++) {
                if (copia[j].getLivello() > copia[indiceMaxLivello].getLivello()) {
                    indiceMaxLivello = j;
                }
            }
            scambiaPersonaggi(copia, i, indiceMaxLivello);
        }
        return copia;
    }

    /**
     * Crea una copia dell'array di {@code PersonaggioGiocabile}.
     *
     * @param array l'array di {@code PersonaggioGiocabile} da copiare
     * @return una copia dell'array di {@code PersonaggioGiocabile}
     */
    private static PersonaggioGiocabile[] copiaArray(PersonaggioGiocabile[] array) {
        PersonaggioGiocabile[] copia = new PersonaggioGiocabile[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = new PersonaggioGiocabile(array[i]);
        }
        return copia;
    }

    /**
     * Scambia due personaggi in un array.
     *
     * @param array l'array in cui scambiare i personaggi
     * @param posizione1 la posizione del primo personaggio
     * @param posizione2 la posizione del secondo personaggio
     */
    private static void scambiaPersonaggi(PersonaggioGiocabile[] array, int posizione1, int posizione2) {
        PersonaggioGiocabile temp = array[posizione1];
        array[posizione1] = array[posizione2];
        array[posizione2] = temp;
    }
}
