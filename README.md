# PiattaformaGamingPMD

## Benvenuti nel progetto PiattaformaGaming!

# README - Classi Videogioco e PersonaggioGiocabile

## Videogioco

La classe Videogioco rappresenta un videogioco all'interno della piattaforma di gaming. Contiene metodi per gestire i personaggi giocabili presenti nel videogioco.

### Attributi:

- `personaggiGiocabili`: array di personaggi giocabili presenti nel videogioco.
- `NUM_MAX_PERSONAGGI`: attributo statico che rappresenta il numero massimo di personaggi giocabili nel videogioco.
- `numeroPersonaggiPresenti`: numero attuale di personaggi presenti nel videogioco.

### Metodi Principali:

- `aggiungiPersonaggio(PersonaggioGiocabile personaggio)`: aggiunge un personaggio giocabile al videogioco.
- `eliminaPersonaggio(int codice)`: elimina un personaggio giocabile dal videogioco in base al codice identificativo.
- `cercaPersonaggio(String nome)`: cerca un personaggio giocabile nel videogioco per nome.
- `cercaPersonaggioPerId(int id)`: cerca un personaggio giocabile nel videogioco per ID.
- `esportaCSV(String fileName)`: esporta i personaggi giocabili del videogioco in un file CSV.
- `importaCSV(String fileName)`: importa i personaggi giocabili da un file CSV nel videogioco.
- `salvaVideogioco(String fileName)`: salva lo stato corrente del videogioco in un file.
- `caricaVideogioco(String fileName)`: carica lo stato del videogioco da un file.
- `visualizzaPersonaggi()`: visualizza tutti i personaggi giocabili presenti nel videogioco.

# README - Classe PersonaggioGiocabile

La classe PersonaggioGiocabile rappresenta un personaggio giocabile all'interno di un videogioco. Contiene tutti gli attributi e metodi necessari per gestire un personaggio giocabile.

### Attributi:

- `id`: identificativo univoco del personaggio.
- `nome`: nome del personaggio.
- `livello`: livello del personaggio.
- `puntiVita`: punti vita del personaggio.
- `attacco`: valore di attacco del personaggio.
- `difesa`: valore di difesa del personaggio.
- `ultimaModifica`: data e ora dell'ultima modifica al personaggio.

### Metodi Principali:

- Costruttori per la creazione di un nuovo personaggio giocabile.
- Metodi getter e setter per ogni attributo.
- `toString()`: restituisce una stringa rappresentante il personaggio giocabile.
- `equals(Object o)`: determina se questo personaggio giocabile è uguale a un altro oggetto.


### Repository:

All'interno della repository verrà caricato tutto il necessario per comprendere il progetto. I progressi verranno caricati man mano che il lavoro procede.
