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
    @Override
    public double precioFinal(){
        switch (consumoEnergetico){
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

}

