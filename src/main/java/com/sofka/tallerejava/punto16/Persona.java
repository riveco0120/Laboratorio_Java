package com.sofka.tallerejava.punto16;

public class Persona {
    //Atributos
        private String nombre="";
        private int edad=0;
        private String DNI;
        private char sexo='h';
        private double peso=0;
        private double altura=0;
    //contructor vacio
        Persona(){

        }

        public Persona(String nombre, int edad, char sexo) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
        }

        public Persona(String nombre, int edad,char sexo, double peso, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }

        

}