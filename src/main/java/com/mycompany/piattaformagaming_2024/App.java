/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.piattaformagaming_2024;

/**
 *
 * @author Studente
 */
import com.mycompany.piattaformagaming_2024.utilita.Menu;
import com.mycompany.piattaformagaming_2024.eccezioni.EccezioneValoreNonEsistente;
import com.mycompany.piattaformagaming_2024.eccezioni.FileException;
import com.mycompany.piattaformagaming_2024.utilita.Ordinatore;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App implements Serializable
{
    public static void main(String[] args) 
    {
        String[] vociMenu=new String[12];
        int sceltaUtente=-1;
        Scanner tastiera=new Scanner(System.in);
        
        Videogioco v=new Videogioco();
        String nome;
        int livello;
        int puntiVita;
        int attacco;
        int difesa;
        LocalDateTime ultimaModifica;
        //LocalDate data;
        int giorno,mese,anno;
        
        String nomeFile="videogioco.csv";
        String nomeFileBin="videogioco.bin";
        
        
        vociMenu[0]="0- esci";
        vociMenu[1]="1- aggiungere un nuovo personaggio";
        vociMenu[2]="2- elimina un personaggio esistente";
        vociMenu[3]="3- cerca un personaggio tramite id";
        vociMenu[4]="4- ordina personaggi dal livello piu' alto";
        vociMenu[5]="5- modifica statistica personaggio";
        vociMenu[6]="6- esportazione csv";
        vociMenu[7]="7- importazione csv";
        vociMenu[8]="8- salva filebin";
        vociMenu[9]="9- carica filebin";
        vociMenu[10]="10- visualizza ultima modifica";
        vociMenu[11]="11- visualizza tutti i personaggi";
        
        Menu menu=new Menu(vociMenu);
        
        do
        {
            try
            {
                    int id;
                    if(v.getNumPersonaggiGiocabili()>0)
                    {
                       id=v.getCodice(v.getNumPersonaggiGiocabili()-1); 
                    }
                    else
                    {
                        id=-1;
                    }
                    
                    
                    
                    //System.out.println("Premi un tasto per continuare...");
                    tastiera.nextLine();
                    sceltaUtente=menu.sceltaMenu();
                    System.out.println("Premi un tasto per continuare...");
                    tastiera.nextLine();

                    switch(sceltaUtente)
                    {
                        case 0:
                        {
                            System.out.println("L'applicazione e' terminata");
                            break;
                        }
                        case 1:
                            // Aggiungi un nuovo personaggio
                            System.out.println("Inserisci i dettagli del nuovo personaggio:");
                            System.out.print("Nome: ");
                            nome = tastiera.nextLine();
                            System.out.print("Livello: ");
                            livello = tastiera.nextInt();
                            System.out.print("Punti Vita: ");
                            puntiVita = tastiera.nextInt();
                            System.out.print("Attacco: ");
                            attacco = tastiera.nextInt();
                            System.out.print("Difesa: ");
                            difesa = tastiera.nextInt();
                            
                            id++;
                            tastiera.nextLine(); // Consuma il newline
                            PersonaggioGiocabile nuovoPersonaggio = new PersonaggioGiocabile(id, nome, livello, puntiVita, attacco, difesa);
                            v.aggiungiPersonaggio(nuovoPersonaggio);
                            System.out.println("Nuovo personaggio aggiunto con successo!");
                            break;

                        case 2:
                            // Elimina un personaggio esistente
                            try
                            {
                                int codice,x;
                                System.out.println("codice-->");
                                codice=tastiera.nextInt();

                                x=v.eliminaPersonaggio(codice);
                                if(x==0)
                                    System.out.println("eliminazione avvenuta correttamente");
                                else
                                    System.out.println("eliminazione non avvenuta");

                                break;
                            }
                            catch(InputMismatchException ex)
                            {
                                System.out.println("l'inserimento non è valido");
                                System.out.println("Premi un tasto per continuare...");
                                tastiera.nextLine();
                                break;
                            } 
                            catch(EccezioneValoreNonEsistente ex)
                            {
                                System.out.println(ex.toString());
                                System.out.println("Premi un tasto per continuare...");
                                tastiera.nextLine();
                                break;
                            } 

                        case 3:
                            // Cerca un personaggio tramite nome
                            System.out.print("Inserisci il nome del personaggio da cercare: ");
                            String nomePersonaggioDaCercare = tastiera.nextLine();
                            PersonaggioGiocabile personaggioTrovato = v.cercaPersonaggio(nomePersonaggioDaCercare);
                            if (personaggioTrovato != null) 
                            {
                                System.out.println("Personaggio trovato:");
                                System.out.println(personaggioTrovato);
                            } else 
                            {
                                System.out.println("Personaggio non trovato.");
                            }
                            break;
                        case 4:
                            try
                            {
                                PersonaggioGiocabile[] personaggiOrdinati = Ordinatore.selectionSortPerLivelloDecrescente(v.getPersonaggiGiocabili());
                                System.out.println("Personaggi ordinati per livello più alto:");
                                for (PersonaggioGiocabile personaggio : personaggiOrdinati) 
                                {
                                    System.out.println(personaggio);
                                }
                                break;
                            }
                            catch(NullPointerException ex)
                            {
                                System.out.println("Non funziona.");
                            }
                        case 5:
                            // Modifica statistica personaggio
                            System.out.print("Inserisci l'ID del personaggio da modificare: ");
                            int idPersonaggioDaModificare = tastiera.nextInt();
                            tastiera.nextLine(); // Consuma il newline
                            PersonaggioGiocabile personaggioDaModificare = v.cercaPersonaggioPerId(idPersonaggioDaModificare);
                            if (personaggioDaModificare != null) {
                                System.out.println("Quale statistica vuoi modificare?");
                                System.out.println("1. Livello");
                                System.out.println("2. Punti Vita");
                                System.out.println("3. Attacco");
                                System.out.println("4. Difesa");
                                System.out.print("Scelta: ");
                                int sceltaStatistica = tastiera.nextInt();
                                tastiera.nextLine(); // Consuma il newline
                                switch (sceltaStatistica) {
                                        case 1:
                                            System.out.print("Nuovo livello: ");
                                            int nuovoLivello = tastiera.nextInt();
                                            tastiera.nextLine(); // Consuma il newline
                                            personaggioDaModificare.setLivello(nuovoLivello);
                                            break;
                                        case 2:
                                            System.out.print("Nuovi punti vita: ");
                                            int nuoviPuntiVita = tastiera.nextInt();
                                            tastiera.nextLine(); // Consuma il newline
                                            personaggioDaModificare.setPuntiVita(nuoviPuntiVita);
                                            break;
                                        case 3:
                                            System.out.print("Nuovo attacco: ");
                                            int nuovoAttacco = tastiera.nextInt();
                                            tastiera.nextLine(); // Consuma il newline
                                            personaggioDaModificare.setAttacco(nuovoAttacco);
                                            break;
                                        case 4:
                                            System.out.print("Nuova difesa: ");
                                            int nuovaDifesa = tastiera.nextInt();
                                            tastiera.nextLine(); // Consuma il newline
                                            personaggioDaModificare.setDifesa(nuovaDifesa);
                                            break;
                                        default:
                                            System.out.println("Scelta non valida.");
                                    }
                                    System.out.println("Statistiche del personaggio modificate con successo!");
                                } else {
                                    System.out.println("Personaggio non trovato.");
                                }
                                break;
                            case 6:
                                try {
                                    v.esportaCSV(nomeFile);
                                    System.out.println("Esportazione completata con successo!");
                                } catch (IOException | FileException e) {
                                    System.out.println("Errore durante l'esportazione: " + e.getMessage());
                                }
                                break;
                            case 7:
                                try {
                                    v.importaCSV(nomeFile);
                                    System.out.println("Importazione completata con successo!");
                                } catch (IOException e) {
                                    System.out.println("Errore durante l'importazione: " + e.getMessage());
                                }
                                break;
                            case 8:
                                try
                                {

                                    v.salvaVideogioco(nomeFileBin);
                                    System.out.println("Salvataggio avvenuto correttamente");
                                } 
                                catch (IOException ex) 
                                {
                                    System.out.println("Impossibile salvare su file");
                                }
                                break;
                            case 9: 
                                try 
                                {
                                    //carica scaffale
                                    v=v.caricaVideogioco(nomeFileBin);
                                    System.out.println("Caricamento avvenuto con successo");
                                } 
                                catch (IOException ex) 
                                {
                                    System.out.println("Impossibile leggere da file");
                                } 
                                catch (ClassNotFoundException ex) 
                                {
                                    System.out.println("Impossibile leggere i dati del videogioco");
                                }

                                break;
                            case 10:
                                // Visualizza l'ultima modifica delle statistiche di un personaggio cercato per ID
                                System.out.print("Inserisci l'ID del personaggio che si desidera visualizzare: ");
                                int idPersonaggioDaVisualizzare = tastiera.nextInt();
                                tastiera.nextLine(); // Consuma il newline

                                PersonaggioGiocabile personaggioDaVisualizzare = v.cercaPersonaggioPerId(idPersonaggioDaVisualizzare);
                                
                                // Se il personaggio è stato trovato, stampa l'ultima modifica
                                if (personaggioDaVisualizzare != null) 
                                {
                                    ultimaModifica = personaggioDaVisualizzare.getUltimaModifica();
                                    System.out.println("Ultima modifica delle statistiche del personaggio:");
                                    System.out.println("Data e ora: " + ultimaModifica);
                                } 
                                else 
                                {
                                    System.out.println("Personaggio non trovato.");
                                }
                                break;
                            case 11:
                                // Visualizza tutti i personaggi
                                System.out.println("Lista dei personaggi:");
                                v.visualizzaPersonaggi();
                                break;
                    }
            }
            catch(InputMismatchException | NumberFormatException e1)
            {
                tastiera.nextLine();
                System.out.println("l'input non è corretto");
            }   
            catch(ArrayIndexOutOfBoundsException ex)
            {
                tastiera.nextLine();
                System.out.println("Si è verificato un problema");
            } 
            catch(DateTimeException ex)
            {
                tastiera.nextLine();
                System.out.println("l'inserimento della data non è corretto");
            }
        }while(sceltaUtente!=0);
    }
}
