package lucavig;

public abstract class Gioco {

    int idGioco;
    String titolo;
    int annoPubblicazione;
    double prezzo;

    public Gioco(int idGioco, String titolo, int annoPubblicazione, double prezzo) {
        this.idGioco = idGioco;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Gioco{" +
                "idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }

    public int getIdGioco() {
        return idGioco;
    }

    public void setIdGioco(int idGioco) {
        this.idGioco = idGioco;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
