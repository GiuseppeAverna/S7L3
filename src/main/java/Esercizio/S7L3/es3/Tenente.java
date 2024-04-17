package Esercizio.S7L3.es3;
public class Tenente extends Ufficiale {
    public Tenente(Ufficiale superiore) {
        super(superiore, 1000);
    }

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Il Tenente gestisce la richiesta.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
