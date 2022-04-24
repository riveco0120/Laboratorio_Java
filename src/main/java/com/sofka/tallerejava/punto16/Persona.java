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

        //Metodos
        public String esMayorEdad(){
            String respues=" ";
            if(this.edad>17){
                respues="Eres mayor de edad";

            }
            else {
                respues="Eres menor de edad";
            }

            return respues;
        }

    protected void comprobarSexo(char sexo){
        if(sexo != this.sexo){
            this.sexo='H';
        }
    }

    public String calcularIMC(){
        double alturaMetro = this.altura/100;
        double calculoIMC=(this.peso/Math.pow(alturaMetro,2));
        String numero="";
        if(calculoIMC<20){
            numero = String.valueOf(-1) + " Estas en tu peso ideal";
        }
        else if(calculoIMC>=20 && calculoIMC<=25){
            numero= String.valueOf(0) +" Esta por debajo de tu peso ideal";
        }
        else {
            numero=String.valueOf(1) +" Estas sobre tu peso ideal";
        }

        return numero;
    }

}


