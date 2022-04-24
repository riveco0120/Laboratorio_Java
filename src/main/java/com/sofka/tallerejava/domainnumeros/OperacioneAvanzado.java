package com.sofka.tallerejava.domainnumeros;

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
                this.imprimirResultado(mensaje);
            }
            else {
                mensaje ="El numero " + contador + "es impar";
                this.imprimirResultado(mensaje);
            }
        }

    }

    public void numeroImparesDos(){
       String mensaje="";
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                mensaje = "El numero " + i + "es par";
                this.imprimirResultado(mensaje);
            }
            else {
                mensaje ="El numero " + i + "es impar";
                this.imprimirResultado(mensaje);

            }


        }
    }

    public void mayorQueCero(){
        int numero;
        String mensaje="";
        do {
                System.out.println("Ingrese un numero: ");
                 numero = this.ingresarNumero();
                 mensaje=String.valueOf(numero);
                 this.imprimirResultado(mensaje);
            }while (numero<0);

        mensaje=("El numero "+ numero +"Es menor que cero");
        this.imprimirResultado(mensaje);
    }


}


