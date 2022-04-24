package com.sofka.tallerejava.punto17;

public class Electrodomestico {
    protected double precioBase=100;
    protected String color ="Blanco";
    protected char consumoEnergetico='F';
    protected double peso=5;

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

    private void comprobarConsumoEnergetico(char letra){
        if(letra!='A' || letra !='F'){
            this.consumoEnergetico='F';
        }
    }
    

}

