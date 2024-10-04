package lucavig;

import lucavig.raccolta.Generi;

public class Videogiochi extends Gioco{

    private String piattaforma;
    private int durataDiGioco;
    private Generi genere;

    public Videogiochi(int idGioco, String titolo, int annoPubblicazione, double prezzo, String piattaforma, int durataDiGioco, Generi genere) {
        super(idGioco, titolo, annoPubblicazione, prezzo);
        this.piattaforma = piattaforma;
        this.durataDiGioco = durataDiGioco;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getDurataDiGioco() {
        return durataDiGioco;
    }

    public void setDurataDiGioco(int durataDiGioco) {
        this.durataDiGioco = durataDiGioco;
    }

    public Generi getGenere() {
        return genere;
    }

    public void setGenere(Generi genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Videogiochi{" +
                "genere=" + genere +
                ", idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
