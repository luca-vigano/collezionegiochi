package lucavig;

public class GiocoDaTavolo extends Gioco {

    private int numeroDiGiocatori;
    private int durataMediaPartita;


    public GiocoDaTavolo(int idGioco, String titolo, int annoPubblicazione, double prezzo, int numeroDiGiocatori, int durataMediaPartita) {
        super(idGioco, titolo, annoPubblicazione, prezzo);
        this.numeroDiGiocatori= numeroDiGiocatori;
        this.durataMediaPartita = durataMediaPartita;
    }

    public int getNumeroDiGiocatori() {
        return numeroDiGiocatori;
    }

    public void setNumeroDiGiocatori(int numeroDiGiocatori) {
        this.numeroDiGiocatori = numeroDiGiocatori;
    }

    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    public void setDurataMediaPartita(int durataMediaPartita) {
        this.durataMediaPartita = durataMediaPartita;
    }

    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                "numeroDiGiocatori=" + numeroDiGiocatori +
                ", durataMediaPartita=" + durataMediaPartita +
                ", idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
