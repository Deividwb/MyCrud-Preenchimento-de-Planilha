package com.dwb.meustestes;

import br.com.dwb.model.Ciudad;

public enum Horario {
    MANHA,
    TARDE,
    NOITE;

    String diaInteiro;

    Horario(String diaInteiro) {
        this.diaInteiro = diaInteiro;
    }

    Horario(){
        for (Horario horario : Horario.values()) {
           return;
        }
    }
}
