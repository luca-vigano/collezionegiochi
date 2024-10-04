package lucavig;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Collezione {

    private final List<Gioco> giochi;

    public Collezione() {
        this.giochi = new ArrayList<>();
    }

    public void aggiungiGioco (Gioco gioco){
    giochi.add(gioco);
    System.out.println("Gioco aggiunto");
    }

    public Optional<Gioco> cercaId (int id){
        return giochi.stream().filter(gioco -> gioco.getIdGioco() == id).findFirst();
    }

    public List<Gioco> cercaPerPrezzo(double prezzo) {
        return giochi.stream()
                .filter(g -> g.getPrezzo() < prezzo).toList();

    }


    public List<GiocoDaTavolo> cercaPerNumeroGiocatori(int giocatori){
        return giochi.stream()
                .filter(g -> g instanceof GiocoDaTavolo)
                .map(g -> (GiocoDaTavolo) g)
                .filter(g -> g.getNumeroDiGiocatori() == giocatori).toList();
    }

    public void rimuoviGioco (int id){
        giochi.remove(giochi.stream().filter(gioco -> gioco.getIdGioco() == id));
        System.out.println("gioco con id: " + id + "rimosso correttamente");
    }

}
