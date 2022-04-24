package com.sofka.tallerejava.domaintexto;

import java.util.Scanner;

public class OperacionesTexto implements InformacionTextoI {

    public Scanner consola = new Scanner(System.in);

    @Override
    public String verificarDia() {
        System.out.println("Ingrese el dia: ");
        String diaSemana=consola.nextLine();
        switch (diaSemana.toLowerCase()){
            case "lunes":
                return "Dia laboral";
            case "martes":
                return "Dia laboral";
            case "miercoles":
                return "Dia laboral";
            case "jueves":
                return "Dia laboral";
            case "viernes":
                return "Dia labora";
            default:
                return "Dia no laboral";
        }
    }

    public void imprimirRespues(String respuesta){
        System.out.println(respuesta);
    }
}
