package com.sofka.tallerejava.punto17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

    static final double PRECIOBASE =100;
    static final double PESOPORDEFECTO=5;
    static final char CONSUMOENERGETICO='F';
    static final String COLORPORDEFECTO = "Blanco";
    protected List<String>coloresDisponible= Arrays.asList("blanco","nego","rojo","azul","gris");
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {

        String letrasDisponibles ="ABCDEF";
        String auxiliar=String.valueOf(letra);
        auxiliar=auxiliar.toUpperCase();

        if(letrasDisponibles.contains(auxiliar)){
            return auxiliar.charAt(0);
        }

        return Electrodomestico.CONSUMOENERGETICO;
    }

    public void comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "negro":
                this.color = color;
                break;
            case "azul":
                this.color = color;
                break;
            case "rojo":
                this.color = color;
                break;
            case "gris":
                this.color = color;
                break;
            default:
                this.color = "blnco";
        }
    }

    public double precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;

            case 'D':
                this.precioBase += 50;
                break;

            case 'E':
                this.precioBase += 30;
                break;

            case 'F':
                this.precioBase += 10;
                break;

        }

        return precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }


    public double getPeso() {
        return peso;
    }

    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico();
        char letra= electrodomestico.comprobarConsumoEnergetico('A');
        System.out.println(letra);
    }


}

