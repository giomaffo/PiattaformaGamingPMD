/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.piattaformagaming_2024.utilita;

import com.mycompany.piattaformagaming_2024.PersonaggioGiocabile;



public class Ordinatore {

    // Altri metodi della classe Ordinatore...

    /**
     * Ordina in ordine decrescente i personaggi di un array
     * utilizzando l'algoritmo selection sort basato sul livello.
     *
     * @param personaggi l'array di PersonaggioGiocabile da ordinare
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

    // Metodo di supporto per creare una copia dell'array di PersonaggioGiocabile
    private static PersonaggioGiocabile[] copiaArray(PersonaggioGiocabile[] array) {
        PersonaggioGiocabile[] copia = new PersonaggioGiocabile[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = new PersonaggioGiocabile(array[i]);
        }
        return copia;
    }

    // Metodo di supporto per scambiare due personaggi in un array
    private static void scambiaPersonaggi(PersonaggioGiocabile[] array, int posizione1, int posizione2) {
        PersonaggioGiocabile temp = array[posizione1];
        array[posizione1] = array[posizione2];
        array[posizione2] = temp;
    }
}