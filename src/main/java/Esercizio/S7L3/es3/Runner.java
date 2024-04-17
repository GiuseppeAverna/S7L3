package Esercizio.S7L3.es3;
public class Runner {
    public static void main(String[] args) {
        Ufficiale tenente = new Tenente(null);
        Ufficiale capitano = new Capitano(tenente);
        Ufficiale maggiore = new Maggiore(capitano);
        Ufficiale colonnello = new Colonnello(maggiore);
        Ufficiale generale = new Generale(colonnello);


        int[] importi = { 1500, 2500, 3500, 4500, 5500 };

        for (int importo : importi) {
            System.out.println("\nControllo importo: $" + importo);
            generale.gestisciRichiesta(importo);
        }
    }
}
