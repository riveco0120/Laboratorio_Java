package com.sofka.tallerejava.domain;

import java.util.Scanner;

public class Operacione extends InformacionNumero{

    public Operacione(int numeroUno, int numeroDos){
        super(numeroUno,numeroDos);
    }

    public String compararMayor(int numeroDos, int numeroUno){
        if(numeroDos==numeroUno){
            return "Los numeros son iguales";
        }
        else if(numeroDos>numeroUno){
            return "El numero " + numeroDos + " Es mayor";
        }
         return "El numero " + numeroUno + "Es mayor";
    }

    public void compararMayorConsola(){
        System.out.println("Ingrese un numero: ");
        this.numeroUno = this.ingresarNumero();
        System.out.println("Ingrese otro numero: ");
        this.numeroDos = this.ingresarNumero();
        String resultado= this.compararMayor(numeroDos,numeroUno);
        System.out.println(resultado);
    }


    public void calcularAreaCirculo(){
        System.out.println("Ingrese el radio: ");
        this.radio =(this.ingresarNumero());
        double numeroPi = Math.PI;
        double resultado =(numeroPi*(Math.pow(radio,2)));
        System.out.println(resultado);
    }


}
