/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piattaformagaming_2024.eccezioni;

/**
 *
 * @author GiorgioMaffolini
 */
public class EccezioneValoreNonEsistente extends Exception
{
   public String toString()
    {
        String s="";
        s+="Il codice inserito non è esistente";
        return s;
    } 
}
