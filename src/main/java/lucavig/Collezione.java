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
}
