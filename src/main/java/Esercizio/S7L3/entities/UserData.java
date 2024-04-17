package Esercizio.S7L3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource adapter) {
        nomeCompleto = adapter.getNomeCompleto();
        eta = adapter.getEta();
    }
}
