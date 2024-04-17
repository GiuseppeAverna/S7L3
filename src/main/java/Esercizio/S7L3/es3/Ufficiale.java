package Esercizio.S7L3.es3;
public abstract class Ufficiale {
    protected Ufficiale superiore;
    protected int stipendio;

    public Ufficiale(Ufficiale superiore, int stipendio) {
        this.superiore = superiore;
        this.stipendio = stipendio;
    }

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public abstract void gestisciRichiesta(int importo);
}
