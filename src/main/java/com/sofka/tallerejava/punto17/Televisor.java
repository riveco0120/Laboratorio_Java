package com.sofka.tallerejava.punto17;

public class Televisor extends Electrodomestico {
    static final int RESOLUCIONPORDEFECTO=20;
    static final boolean SINTONIZADORTDTPORDEFECTO=false;
    public double resolucion;
    public boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = RESOLUCIONPORDEFECTO;
        this.sintonizadorTDT=SINTONIZADORTDTPORDEFECTO;

    }

    public Televisor(double precioBase, double peso) {

        super(precioBase, peso);

        this.resolucion = RESOLUCIONPORDEFECTO;
        this.sintonizadorTDT=SINTONIZADORTDTPORDEFECTO;
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }


    public double getResolucion() {

        return resolucion;
    }

    public boolean isSintonizadorTDT() {

        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioTotal = super.precioFinal();
        if(getResolucion()>40){
            precioTotal += precioTotal*0.30;
        }
        if(isSintonizadorTDT())
        {
            precioTotal+=250000;
        }
        return precioTotal;
    }

}
