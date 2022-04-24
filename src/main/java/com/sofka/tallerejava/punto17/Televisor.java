package com.sofka.tallerejava.punto17;

public class Televisor extends Electrodomestico {
    public double resolucion = 20;
    public boolean sintonizadorTDT = false;

    public Televisor() {

    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

}
