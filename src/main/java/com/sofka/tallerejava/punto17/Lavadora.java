package com.sofka.tallerejava.punto17;

public class Lavadora extends Electrodomestico {
    static final int CARGAPORDEFECTO =5;
    public int carga = 5;

    public Lavadora() {
        super();
        this.carga=CARGAPORDEFECTO;

    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga=CARGAPORDEFECTO;
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        if (getCarga() > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }

}

