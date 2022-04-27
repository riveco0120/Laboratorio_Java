package com.sofka.tallerejava.domainnumeros;

import java.util.Scanner;

public class InformacionNumero {

    protected int numeroUno;
    protected int numeroDos;
    protected Scanner consola;
    protected double radio;

    public InformacionNumero() {

    }

    public InformacionNumero(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public void imprimirResultado(String resultado) {
        System.out.println(resultado);
    }

    public int ingresarNumero() {
        this.consola = new Scanner(System.in);
        int numero = consola.nextInt();
        return numero;

    }
}
