package Esercizio.S7L3.es3;
public class Generale extends Ufficiale {
    public Generale(Ufficiale superiore) {
        super(superiore, 5000);
    }

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Il Generale gestisce la richiesta.");
        } else {
            System.out.println("Nessun ufficiale può gestire la richiesta.");
        }
    }
}
