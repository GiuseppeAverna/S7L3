package Esercizio.S7L3.es3;
public class Maggiore extends Ufficiale {
    public Maggiore(Ufficiale superiore) {
        super(superiore, 3000);
    }

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Il Maggiore gestisce la richiesta.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
