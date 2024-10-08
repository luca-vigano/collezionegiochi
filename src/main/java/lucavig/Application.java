package lucavig;

import lucavig.raccolta.Generi;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Collezione collezione = new Collezione();

        boolean acceso = true;

        while (acceso) {
            System.out.println("menu");
            System.out.println("1. Aggiungi videogioco");
            System.out.println("2. Aggiungi gioco da tavolo");
            System.out.println("3. Cerca per Id");
            System.out.println("4. Cerca giochi per prezzo massimo");
            System.out.println("5. Cerca giochi per numero giocatori");
            System.out.println("6. Rimuovi gioco con Id");
            System.out.println("7. Modifica il gioco con Id");
            System.out.println("8. Mostra statistiche della collezione di giochi");
            System.out.println("9. Esci");

            int comando = Integer.parseInt(scanner.nextLine());

            switch (comando) {

                case 1:
                    System.out.println("Inserisci Id: ");
                    int idVideogioco = Integer.parseInt(scanner.nextLine());
                    System.out.print("Titolo: ");
                    String titoloVideogioco = scanner.nextLine();
                    System.out.print("Anno di pubblicazione: ");
                    int annoVideogioco = Integer.parseInt(scanner.nextLine());
                    System.out.print("Prezzo: ");
                    double prezzoVideogioco= Double.parseDouble(scanner.nextLine());
                    System.out.print("Piattaforma: ");
                    String piattaforma = scanner.nextLine();
                    System.out.print("Durata gioco in ore: ");
                    int durataVideogioco = Integer.parseInt(scanner.nextLine());
                    System.out.print("Genere (scegli tra: AZIONE, AVVENTURA, SPARATUTTO, STRATEGIA, SPORTIVO, SIMULAZIONE, HORROR, CORSE, SURVIVAL ");
                    String genereVideogioco= scanner.nextLine().toUpperCase();

                    collezione.aggiungiGioco(new Videogiochi(idVideogioco,titoloVideogioco,annoVideogioco,prezzoVideogioco,piattaforma, durataVideogioco, Generi.valueOf(genereVideogioco)));
                    break;

                case 2:
                    System.out.print("ID: ");
                    int idGiocoDaTavolo= Integer.parseInt(scanner.nextLine());
                    System.out.print("Titolo: ");
                    String titoloGiocoDaTavolo = scanner.nextLine();
                    System.out.print("Anno di pubblicazione: ");
                    int annoGiocoDaTavolo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Prezzo: ");
                    double prezzoGiocoDaTavolo = Double.parseDouble(scanner.nextLine());
                    System.out.print("Numero di giocatori: ");
                    int numGiocatori = Integer.parseInt(scanner.nextLine());
                    System.out.print("Durata media (minuti): ");
                    int durataGiocoDaTavolo = Integer.parseInt(scanner.nextLine());

                    collezione.aggiungiGioco(new GiocoDaTavolo(
                            idGiocoDaTavolo, titoloGiocoDaTavolo, annoGiocoDaTavolo, prezzoGiocoDaTavolo,
                            numGiocatori, durataGiocoDaTavolo));
                    break;

                case 3:
                    System.out.print("Inserisci ID da cercare: ");
                    int idRicerca = Integer.parseInt(scanner.nextLine());
                    Optional<Gioco> gioco = collezione.cercaId(idRicerca); // capire optional suggerito dall'ide
                    System.out.println(gioco);
                    break;

                case 4:
                    System.out.print("Inserisci prezzo massimo: ");
                    double prezzoMax = Double.parseDouble(scanner.nextLine());
                    List<Gioco> giochiPerPrezzo = collezione.cercaPerPrezzo(prezzoMax);
                    giochiPerPrezzo.forEach(g -> System.out.println(g));
                    break;

                case 5:
                    System.out.print("Inserisci numero di giocatori: ");
                    int numGiocatoriRicerca = Integer.parseInt(scanner.nextLine());
                    List<GiocoDaTavolo> giochiPerNumGiocatori = collezione.cercaPerNumeroGiocatori(numGiocatoriRicerca);
                    giochiPerNumGiocatori.forEach(g -> System.out.println(g));
                    break;

                case 6:
                    System.out.print("Inserisci ID gioco da eliminare: ");
                    int idRicerca2 = Integer.parseInt(scanner.nextLine());
                    collezione.rimuoviGioco(idRicerca2);
                    break;

                case 7:
                    System.out.print("Inserisci ID del gioco da aggiornare: ");
                    int idDaAggiornare = Integer.parseInt(scanner.nextLine());
                    Optional<Gioco> giocoDaAggiornare = collezione.cercaId(idDaAggiornare);
                        if (giocoDaAggiornare.isPresent()){
                            Gioco gioco1 = giocoDaAggiornare.get();

                    if (gioco1 instanceof Videogiochi) {
                        System.out.print("Nuovo Titolo: ");
                        String nuovoTitolo = scanner.nextLine();
                        System.out.print("Nuovo Anno di pubblicazione: ");
                        int nuovoAnno = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nuovo Prezzo: ");
                        double nuovoPrezzo = scanner.nextDouble();
                        System.out.print("Nuova Piattaforma: ");
                        String nuovaPiattaforma = scanner.next();
                        System.out.print("Nuova Durata (ore): ");
                        int nuovaDurata = scanner.nextInt();
                        System.out.print("Nuovo Genere: ");
                        String nuovoGenere = scanner.next().toUpperCase();

                        Videogiochi nuovoVideogioco = new Videogiochi(idDaAggiornare, nuovoTitolo, nuovoAnno, nuovoPrezzo, nuovaPiattaforma, nuovaDurata, Generi.valueOf(nuovoGenere));

                        collezione.aggiornaGioco(idDaAggiornare, nuovoVideogioco);



                    } else if (gioco1 instanceof GiocoDaTavolo) {
                        System.out.print("Nuovo Titolo: ");
                        String nuovoTitoloGiocoDaTavolo = scanner.nextLine();
                        System.out.print("Nuovo Prezzo: ");
                        double nuovoPrezzoGiocoDaTavolo = scanner.nextDouble();
                        System.out.print("Anno di pubblicazione: ");
                        int nuovoAnno = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nuovo Numero di Giocatori: ");
                        int nuovoNumGiocatori = scanner.nextInt();
                        System.out.print("Nuova Durata media (minuti): ");
                        int nuovaDurataMinuti = scanner.nextInt();

                        GiocoDaTavolo nuovoGiocoDaTavolo = new GiocoDaTavolo(idDaAggiornare, nuovoTitoloGiocoDaTavolo,nuovoAnno, nuovoPrezzoGiocoDaTavolo, nuovoNumGiocatori, nuovaDurataMinuti);
                        collezione.aggiornaGioco(idDaAggiornare, nuovoGiocoDaTavolo);
                    }
                        }
                    break;

                case 8:
                    collezione.statistiche();
                    break;

                case 9:
                    acceso=false;
                    scanner.close();
                    break;

                default:
                    System.out.println("Comando non valido! riprova");
            }
        }

    }
}
