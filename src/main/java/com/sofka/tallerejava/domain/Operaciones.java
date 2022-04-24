package com.sofka.tallerejava.domain;

import java.util.Scanner;

public class Operaciones extends InformacionNumero{

    public Operaciones(int numeroUno, int numeroDos){
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

 



}
