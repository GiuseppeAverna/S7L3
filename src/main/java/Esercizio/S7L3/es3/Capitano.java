package Esercizio.S7L3.es3;
public class Capitano extends Ufficiale {
    public Capitano(Ufficiale superiore) {
        super(superiore, 2000);
    }

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Il Capitano gestisce la richiesta.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
