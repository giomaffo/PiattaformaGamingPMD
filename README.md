# PiattaformaGamingPMD

## Benvenuti nel progetto PiattaformaGaming!

### Descrizione:

Questo progetto ha lo scopo di creare una piattaforma di gaming completa con tutte le funzionalità necessarie per gestire videogiochi e personaggi giocabili.

### Classi:

Le classi principali incluse in questo progetto sono:

- **PersonaggioGiocabile**: Rappresenta i personaggi giocabili all'interno dei videogiochi.
  - Attributi:
    - `nome`: il nome del personaggio giocabile.
    - `livello`: il livello del personaggio giocabile.
    - `puntiVita`: i punti vita del personaggio giocabile.
  - Metodi:
    - `getNome()`: restituisce il nome del personaggio giocabile.
    - `getLivello()`: restituisce il livello del personaggio giocabile.
    - `getPuntiVita()`: restituisce i punti vita del personaggio giocabile.
    - Altri metodi per modificare e gestire gli attributi del personaggio giocabile.

- **Videogioco**: Rappresenta i videogiochi disponibili sulla piattaforma.
  - Attributi:
    - `titolo`: il titolo del videogioco.
    - `genere`: il genere del videogioco.
    - `annoPubblicazione`: l'anno di pubblicazione del videogioco.
  - Metodi:
    - `getTitolo()`: restituisce il titolo del videogioco.
    - `getGenere()`: restituisce il genere del videogioco.
    - `getAnnoPubblicazione()`: restituisce l'anno di pubblicazione del videogioco.
    - Altri metodi per modificare e gestire gli attributi del videogioco.

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
    - Altri metodi per gestire e interagire con i videogiochi e i personaggi giocabili sulla piattaforma.

### Repository:

All'interno della repository verrà caricato tutto il necessario per comprendere il progetto. I progressi verranno caricati man mano che il lavoro procede.
