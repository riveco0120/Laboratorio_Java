package com.sofka.tallerejava.domaintexto;

import javax.xml.stream.FactoryConfigurationError;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesTexto implements InformacionTextoI {

    public Scanner consola = new Scanner(System.in);
    public ArrayList list = new ArrayList<>();

    @Override
    public String verificarDia() {
        System.out.println("Ingrese el dia: ");
        String diaSemana = consola.nextLine();
        switch (diaSemana.toLowerCase()) {
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
        String mensaje = "";
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = frase.replace("a", "e");
        System.out.println("Ingrese una frase: ");
        String fraseIngresada = consola.nextLine();
        String nuevaIngresada = fraseIngresada.replace("a", "e");
        mensaje = nuevaFrase.concat(" " + nuevaIngresada);
        return mensaje;
    }

    @Override
    public String eliminarSpacios() {
        System.out.println("Ingrese una frase");
        String Frase = consola.nextLine();
        String nuevaFrase = Frase.replace(" ", "");
        return nuevaFrase;
    }

    @Override
    public String longitud() {
        System.out.println("Ingresa una frase");
        String frase = consola.nextLine();
        int logitu = frase.length();
        System.out.println(this.cantidadVocales(frase));
        return "logitud " + logitu;
    }

    @Override
    public String compararPalabras() {
        System.out.println("Ingrese una palabra: ");
        String primeraPalabra = consola.nextLine();
        System.out.println("Ingrese otra palabra: ");
        String segundaPalabra = consola.nextLine();
        if (primeraPalabra.equalsIgnoreCase(segundaPalabra)) {
            return "Las palabras son iguales";
        }
        return "Las palabras no son iguales";
    }

    //metodos de la propia clase
    public String cantidadVocales(String frase) {
        frase = frase.toLowerCase();
        int contador = 0;
        int vocala = 0;
        int vocale = 0;
        int vocali = 0;
        int vocalo = 0;
        int vocalu = 0;
        for (int i = frase.length() - 1; i >= 0; i--) {
            switch (frase.charAt(i)) {
                case 'a':
                    contador++;
                    vocala++;
                    break;
                case 'e':
                    contador++;
                    vocale++;
                    break;
                case 'i':
                    contador++;
                    vocali++;
                    break;
                case 'o':
                    contador++;
                    vocalo++;
                    break;
                case 'u':
                    vocalu++;
                    contador++;
                    break;
            }
        }

        return "Canitdad a: " + vocala + " \n " + "Canitdad e: " + vocale + " \n "
                + "Canitdad i: " + vocali + " \n " + "Canitdad 0: " + vocalo + " \n " + "Canitdad u: " + vocalu
                + " \n " + "Canitdad total: " + contador;

    }


    public void imprimirRespues(String respuesta) {
        System.out.println(respuesta);
    }

    public static void main(String[] args) {
        OperacionesTexto texto = new OperacionesTexto();
        System.out.println(texto.cantidadVocales("cantidad voclaes " + "Hola"));
    }

}
