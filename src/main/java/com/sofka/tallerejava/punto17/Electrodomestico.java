package com.sofka.tallerejava.punto17;

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

        return CONSUMOENERGETICO;
    }

    public String comprobarColor(String color) {
        final String colorElegido[] ={COLORPORDEFECTO};
        coloresDisponible.forEach(elemento->{
            if(elemento.equalsIgnoreCase(color)){
               colorElegido[0] = color;
            }
        });

        return colorElegido[0];
    }

    public double precioSegunConsumoEnergetico() {
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

    protected double precioSegunPeso(){
        double precio=0;
        double peso=getPeso();
        if(peso>=0 && peso<=19){
            precio=10;
        }else if(peso>19 && peso<50){
            precio=50;
        }else if(peso>49 && peso<80){
            precio=80;
        }else if(precio>80){
            precio =100;
        }
        return precio;
    }

    public double precioFinal(){
        return getPrecioBase()+this.precioSegunPeso()+this.precioSegunConsumoEnergetico();
    }


    //metodos getter

    public double getPeso() {
        return peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }


}

