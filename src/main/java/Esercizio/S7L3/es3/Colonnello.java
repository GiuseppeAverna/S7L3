package Esercizio.S7L3.es3;
public class Colonnello extends Ufficiale {
    public Colonnello(Ufficiale superiore) {
        super(superiore, 4000);
    }

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Il Colonnello gestisce la richiesta.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
