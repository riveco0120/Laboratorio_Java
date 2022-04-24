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

    @Override
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

    public double getResolucion() {

        return resolucion;
    }

    public boolean isSintonizadorTDT() {

        return sintonizadorTDT;
    }

}
