package Esercizio.S7L3.entities;

import java.util.Date;


import java.util.Calendar;
import java.util.Date;

public class MainRunner {
    public static void main(String[] args) {

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        Calendar cal = Calendar.getInstance();
        cal.set(1985, Calendar.JUNE, 15);
        Date dataDiNascita = cal.getTime();


        info.setDataDiNascita(dataDiNascita);


        InfoAdapter adapter = new InfoAdapter(info);


        UserData userData = new UserData();


        userData.getData(adapter);


        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
