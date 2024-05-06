/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
package com.mycompany.piattaformagaming_2024;

/**
 *
 * @author Studente
 */


/*
public class App {

    public static void main(String[] args) {
        
        P piattaforma = new P();

        // Creazione del menu
        Menu menu = new Menu();
        menu.aggiungiVoce("1. Aggiungi videogioco");
        menu.aggiungiVoce("2. Rimuovi videogioco");
        menu.aggiungiVoce("3. Aggiungi personaggio giocabile");
        menu.aggiungiVoce("4. Rimuovi personaggio giocabile");
        menu.aggiungiVoce("5. Visualizza personaggi giocabili di un videogioco");
        menu.aggiungiVoce("6. Esci");

        Scanner scanner = new Scanner(System.in);

        int scelta;
        do {
            menu.stampaMenu();
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline dopo la lettura dell'intero

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il titolo del videogioco:");
                    String titoloVideogioco = scanner.nextLine();
                    System.out.println("Inserisci il genere del videogioco:");
                    String genereVideogioco = scanner.nextLine();
                    System.out.println("Inserisci l'anno di pubblicazione del videogioco:");
                    int annoPubblicazione = scanner.nextInt();
                    piattaforma.aggiungiVideogioco(new Videogioco(titoloVideogioco, genereVideogioco, annoPubblicazione));
                    break;
                case 2:
                    System.out.println("Inserisci il titolo del videogioco da rimuovere:");
                    String titoloRimozione = scanner.nextLine();
                    piattaforma.rimuoviVideogioco(titoloRimozione);
                    break;
                case 3:
                    System.out.println("Inserisci il nome del personaggio giocabile:");
                    String nomePersonaggio = scanner.nextLine();
                    System.out.println("Inserisci l'ID del personaggio giocabile:");
                    int idPersonaggio = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline
                    System.out.println("Inserisci il titolo del videogioco in cui aggiungere il personaggio:");
                    String titoloVideogiocoPersonaggio = scanner.nextLine();
                    piattaforma.aggiungiPersonaggioGiocabile(new PersonaggioGiocabile(idPersonaggio, nomePersonaggio), titoloVideogiocoPersonaggio);
                    break;
                case 4:
                    System.out.println("Inserisci il nome del personaggio giocabile da rimuovere:");
                    String nomePersonaggioRimozione = scanner.nextLine();
                    System.out.println("Inserisci il titolo del videogioco in cui rimuovere il personaggio:");
                    String titoloVideogiocoRimozione = scanner.nextLine();
                    piattaforma.eliminaPersonaggioGiocabile(nomePersonaggioRimozione, titoloVideogiocoRimozione);
                    break;
                case 5:
                    System.out.println("Inserisci il titolo del videogioco di cui visualizzare i personaggi:");
                    String titoloVideogiocoVisualizzazione = scanner.nextLine();
                    piattaforma.visualizzaPersonaggiGiocabili(titoloVideogiocoVisualizzazione);
                    break;
                case 6:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 6);

        scanner.close();
    }
    
}
*/


