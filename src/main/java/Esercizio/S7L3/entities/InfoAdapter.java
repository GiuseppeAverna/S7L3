package Esercizio.S7L3.entities;

import java.util.Calendar;



public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }


    @Override
    public int getEta() {
        Calendar calNascita = Calendar.getInstance();
        calNascita.setTime(info.getDataDiNascita());
        int annoNascita = calNascita.get(Calendar.YEAR);
        int meseNascita = calNascita.get(Calendar.MONTH);
        int giornoNascita = calNascita.get(Calendar.DAY_OF_MONTH);

        Calendar calOggi = Calendar.getInstance();
        int annoOggi = calOggi.get(Calendar.YEAR);
        int meseOggi = calOggi.get(Calendar.MONTH);
        int giornoOggi = calOggi.get(Calendar.DAY_OF_MONTH);

        int eta = annoOggi - annoNascita;


        if (meseOggi < meseNascita || (meseOggi == meseNascita && giornoOggi < giornoNascita)) {
            eta--;
        }

        return eta;
    }

}
