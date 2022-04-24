package com.sofka.tallerejava.punto17;

public class Lavadora extends Electrodomestico {
    public int carga =5;

    public Lavadora(){

    }

    public Lavadora(double precioBase, double peso)
    {
        super(precioBase, peso);
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
}

