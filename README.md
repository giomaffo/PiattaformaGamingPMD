# PiattaformaGamingPMD

## Benvenuti nel progetto PiattaformaGaming!

### Descrizione:

Questo progetto ha lo scopo di creare una piattaforma di gaming completa con tutte le funzionalità necessarie per gestire videogiochi e personaggi giocabili.

### Classi:

Le classi principali incluse in questo progetto sono:

- **PersonaggioGiocabile**: Rappresenta i personaggi giocabili all'interno dei videogiochi.
  - Attributi:
    - `id`: identificatore univoco del personaggio.
    - `nome`: il nome del personaggio giocabile.
    - `livello`: il livello del personaggio giocabile.
    - `puntiVita`: i punti vita del personaggio giocabile.
    - `attacco`: il valore di attacco del personaggio giocabile.
    - `difesa`: il valore di difesa del personaggio giocabile.
    - `skillPoints`: gli skill points disponibili per l'utente.
    - `ultimaModifica`: un attributo di tipo `LocalDateTime` che tiene traccia della data e dell'ora dell'ultima modifica apportata al personaggio giocabile.

- **Videogioco**: Rappresenta i videogiochi disponibili sulla piattaforma.
  - Attributi:
    - `titolo`: il titolo del videogioco.
    - `genere`: il genere del videogioco.
    - `annoPubblicazione`: l'anno di pubblicazione del videogioco.
  - Metodi:
    - `getTitolo()`: restituisce il titolo del videogioco.
    - `getGenere()`: restituisce il genere del videogioco.
    - `getAnnoPubblicazione()`: restituisce l'anno di pubblicazione del videogioco.

- **PiattaformaGaming**: Rappresenta la piattaforma di gaming nel suo complesso.
  - Attributi:
    - Lista di Videogiochi: un elenco dei videogiochi presenti sulla piattaforma.
    - Lista di PersonaggiGiocabili: un elenco dei personaggi giocabili presenti sulla piattaforma.
  - Metodi:
    - `aggiungiVideogioco(Videogioco videogioco)`: aggiunge un videogioco alla piattaforma.
    - `rimuoviVideogioco(String titolo)`: rimuove un videogioco dalla piattaforma.
    - `cercaVideogioco(String titolo)`: cerca un videogioco nella piattaforma.
    - `aggiungiPersonaggio(PersonaggioGiocabile personaggio)`: aggiunge un personaggio giocabile alla piattaforma.
    - `rimuoviPersonaggio(String nome)`: rimuove un personaggio giocabile dalla piattaforma.
    - `cercaPersonaggio(String nome)`: cerca un personaggio giocabile nella piattaforma.
    - `ordinamentoVideogiochi(String criterio)`: permette agli utenti di ordinare i videogiochi in base a diversi criteri, come il titolo o il genere.
    - `esportaDatiCSV()`: consente agli utenti di esportare i dati dei videogiochi presenti nella piattaforma in un file CSV.
    - `importaDatiCSV(String nomeFile)`: consente agli utenti di importare i dati dei videogiochi da un file CSV nella piattaforma.
    - `aggiungiPersonaggioGiocabile(PersonaggioGiocabile personaggio, String titoloVideogioco)`: permette allo sviluppatore del gioco di aggiungere un nuovo personaggio giocabile a un videogioco esistente.
    - `eliminaPersonaggioGiocabile(String nomePersonaggio, String titoloVideogioco)`: consente allo sviluppatore del gioco di eliminare un personaggio giocabile da un videogioco.
    - `ricercaPersonaggioGiocabile(String criterio, String valore)`: consente agli utenti di cercare un personaggio giocabile in un videogioco in base al nome o alla classe.
   - `aggiornaDettagliPersonaggioGiocabile(String nomePersonaggio, String attributo, int valore)`: permette agli utenti di aggiornare i dettagli di un personaggio giocabile, come ad esempio i punti vita,     l'attacco o la difesa. Gli skill points sono un valore predefinito iniziale di 5 e aumentano di 2 ad ogni aumento di livello. Una volta spesi su una statistica, la statistica stessa aumenta. I valori iniziali per i punti vita sono 500, mentre i valori iniziali per l'attacco e la difesa sono 1.
    - `ordinamentoPersonaggiGiocabili(String criterio)`: permette agli utenti di ordinare i personaggi giocabili in base a diversi criteri, come il nome o il livello.

### Repository:

All'interno della repository verrà caricato tutto il necessario per comprendere il progetto. I progressi verranno caricati man mano che il lavoro procede.
