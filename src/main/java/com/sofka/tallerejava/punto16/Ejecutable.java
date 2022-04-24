package com.sofka.tallerejava.punto16;

import java.util.Scanner;

public class Ejecutable {
    private Scanner consola = new Scanner(System.in);

    public Ejecutable() {


    }


    public char sexoLetra(String sexo) {
        String letra = sexo.toLowerCase();
        if (letra == "masculino" || letra == "hombre") {
            sexo = "H";
        } else if (sexo == "femenino" || letra == "mujer") {
            sexo = "F";
        } else {
            sexo = sexo;
        }
        char sexo1 = sexo.charAt(0);
        return sexo1;
    }

    //Creanto entidades
    public void persona1() {
        Scanner consola2 = new Scanner(System.in);
        System.out.println("Ingresar tu nombre");
        String nombre = consola.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = consola.nextInt();
        System.out.println("Ingesa tu sexo");
        String sexo = consola2.nextLine();
        char sexol = this.sexoLetra(sexo);
        System.out.println("Ingresa tu peso");
        double peso = consola.nextDouble();
        System.out.println("Ingresa tu altura");
        double altura = consola.nextDouble();
        Persona persona = new Persona(nombre, edad, sexol, peso, altura);
        String pesoIdeal = persona.calcularIMC();
        String mayorEdad = persona.esMayorEdad();
        String numeroDni = persona.generaDNI(0);
        System.out.println("Calculo IMC: " + pesoIdeal);
        System.out.println("Mayor de edad: " + mayorEdad);
        System.out.println("Numero DNI: " + numeroDni);
        System.out.println(persona.toString());


    }

    public void persona2() {
        Scanner consola2 = new Scanner(System.in);
        System.out.println("Ingresar tu nombre");
        String nombre = consola2.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = consola.nextInt();
        System.out.println("Ingresa tu sexo");
        String sexo = consola2.nextLine();
        char sexol = this.sexoLetra(sexo);
        Persona persona2 = new Persona(nombre, edad, sexol);
        String pesoIdeal = persona2.calcularIMC();
        String mayorEdad = persona2.esMayorEdad();
        String numeroDni = persona2.generaDNI(0);
        System.out.println("Calculo IMC: " + pesoIdeal);
        System.out.println("Mayor de edad: " + mayorEdad);
        System.out.println("Numero DNI: " + numeroDni);
        System.out.println(persona2.toString());

    }

    public void persona3() {
        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setAltura(150);
        persona3.setEdad(18);
        persona3.setSexo('H');
        persona3.setPeso(56);
        String pesoIdeal = persona3.calcularIMC();
        String mayorEdad = persona3.esMayorEdad();
        String numeroDni = persona3.generaDNI(0);
        System.out.println("Calculo IMC: " + pesoIdeal);
        System.out.println("Mayor de edad: " + mayorEdad);
        System.out.println("Numero DNI: " + numeroDni);
        System.out.println(persona3.toString());

    }


}
