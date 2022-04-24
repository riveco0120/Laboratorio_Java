package com.sofka.tallerejava.domaintexto;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesTexto implements InformacionTextoI {

    public Scanner consola = new Scanner(System.in);
    public ArrayList list = new ArrayList<>();

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

    @Override
    public String cambiarLetra() {
        String mensaje="";
        String frase="La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = frase.replace("a","e");
        System.out.println("Ingrese una frase: ");
        String fraseIngresada = consola.nextLine();
        String nuevaIngresada = fraseIngresada.replace("a","e");
        mensaje = nuevaFrase.concat(" " + nuevaIngresada);
        return mensaje;
    }

    @Override
    public String eliminarSpacios() {
        System.out.println("Ingrese una frase");
        String Frase =consola.nextLine();
        String nuevaFrase = Frase.replace(" ", "");
        return nuevaFrase;
    }

    @Override
    public String longitud() {
        return null;
    }


    public void imprimirRespues(String respuesta){
        System.out.println(respuesta);
    }

    public static void main(String[] args) {
        OperacionesTexto texto = new OperacionesTexto();
        System.out.println(texto.cambiarLetra());
    }

}
