package com.sofka.tallerejava.punto16;

import java.util.Scanner;

public class Ejecutable {
    private Scanner consola = new Scanner(System.in);
    public Ejecutable(){


    }

    public char sexoLetra(String sexo){
        String letra = sexo.toLowerCase();
        if(letra=="masculino" || letra=="hombre"){
            sexo="H";
        }
        else if(sexo=="femenino" || letra=="mujer") {
            sexo="F";
        }
        else {
            sexo=sexo;
        }
        char sexo1= sexo.charAt(0);
        return sexo1;
    }

    
}
