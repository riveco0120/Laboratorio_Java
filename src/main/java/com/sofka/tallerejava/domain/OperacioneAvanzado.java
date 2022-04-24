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


    public void numerosImpares(){
        int contador=1;
        String mensaje="";
        while (contador<=100){
            if(contador%2==0){
                mensaje = "El numero " + contador + "es par";
            }
            else {
                mensaje ="El numero " + contador + "es impar";
            }
        }

        this.imprimirResultado(mensaje);
    }

}

