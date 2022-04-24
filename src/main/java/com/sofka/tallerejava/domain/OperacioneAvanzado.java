package com.sofka.tallerejava.domain;

public class OperacioneAvanzado extends InformacionNumero{

    public final double IVA =(21/100);

    public void calcularIva(){
       double precio,precioFinal;
        System.out.println("Ingrese el precio: ");
        precio=this.ingresarNumero();
        precioFinal = precio + precio*IVA;
        String resultado = String.valueOf(precioFinal);
        this.imprimirResultado(resultado);
    }

}

