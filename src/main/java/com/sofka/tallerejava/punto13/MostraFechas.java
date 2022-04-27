package com.sofka.tallerejava.punto13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostraFechas {
    public void imprimirFechaHora() {
        System.out.println("Fecha y hora");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
    }

    public static void main(String[] args) {
        MostraFechas mostraFechas = new MostraFechas();
        mostraFechas.imprimirFechaHora();
    }
}
