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


    public String numeroAletatorio(){
        String numeroRandom = "";
        int contador =0;
        while (contador<8){
            int numeroAle = (int) Math.floor(Math.random()*((9+1)+0));
            String numeroCaracter = String.valueOf(numeroAle);
            numeroRandom +=numeroCaracter;
            contador+=1;
        }
        return numeroRandom;
    }

    protected String generaDNI(int Dni){
        final String DNI="ABCDEFGH";
        String numeroRandom=this.numeroAletatorio();
        String letraSt="";
        if(Dni==0){
            int numeroConvertido =Integer.parseInt(numeroRandom);
            int oper=numeroConvertido%9;
            char letra = DNI.charAt(oper);
            letraSt=String.valueOf(letra);
        }
        if(Dni>10000000 && Dni<=99999999) {
            int oper=Dni%9;
            char letra = DNI.charAt(oper);
            letraSt=String.valueOf(letra);

        }
        else if(Dni>0 && Dni<=9999999) {
            numeroRandom = String.valueOf(Dni);
            System.out.println("El numero debe de ser de 8 cifras");
            letraSt="Numero no valido";
        }
        this.DNI=numeroRandom+letraSt;
        return numeroRandom+letraSt;
    }

    public String getNombre() {
        return this.nombre;
    }

}


