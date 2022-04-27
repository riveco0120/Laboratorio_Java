package com.sofka.tallerejava.punto17;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejecutable {

    public Televisor crearTelevisor(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT){
        Televisor nuevoElectrodomestico = new Televisor(precioBase,color,consumoEnergetico,peso,resolucion,sintonizadorTDT);
        return nuevoElectrodomestico;
    }

    public Lavadora crearLavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso){
        Lavadora lavadora = new Lavadora(carga,precioBase,color,consumoEnergetico,peso);
        return lavadora;

    }

    public void imprimirElectrodomesticos(Electrodomestico electrodomesticos[]){
        double totalPorTipo = 0;
        double acomulador = 0;
        System.out.println("Lavadoras");
        for (int i = electrodomesticos.length - 1; i >= 0; i--){
            if(electrodomesticos[i]instanceof Lavadora) {
                System.out.println(electrodomesticos[i].precioFinal());
                acomulador = electrodomesticos[i].precioFinal();
                totalPorTipo += acomulador;
            }
        }
        System.out.println("El total Lavadoras es de: " + totalPorTipo);
        totalPorTipo = 0;

        System.out.println("Televisores");
        for (int i = electrodomesticos.length - 1; i >= 0; i--){
            if(electrodomesticos[i]instanceof Televisor) {
                System.out.println(electrodomesticos[i].precioFinal());
                acomulador = electrodomesticos[i].precioFinal();
                totalPorTipo += acomulador;
            }
        }
        System.out.println("El total de Televisores es de: " + totalPorTipo);
    }
    public static void main(String[] args) {
        Electrodomestico electrodomesticos[] = new Electrodomestico[10];
        Ejecutable ejecutable = new Ejecutable();
        System.out.println("Creando lavadoras");
        electrodomesticos[0] = ejecutable.crearLavadora(30,210, "blanco", 'A', 12);
        electrodomesticos[1]  = ejecutable.crearLavadora(15,400, "azul", 'B', 12);
        electrodomesticos[2]  = ejecutable.crearLavadora(20,233, "rojo", 'C', 12);
        electrodomesticos[3] = ejecutable.crearLavadora(10,125, "blanco", 'D', 12);
        electrodomesticos[4] = ejecutable.crearLavadora(15,200, "gris", 'F', 12);

        System.out.println("Crando televis");

        electrodomesticos[5]  = ejecutable.crearTelevisor(150, "negro", 'F', 7, 40,true);
        electrodomesticos[6]  = ejecutable.crearTelevisor(100, "gris", 'A', 7, 55,false);
        electrodomesticos[7]  = ejecutable.crearTelevisor(200, "blanco", 'C', 7, 35,false);
        electrodomesticos[8] = ejecutable.crearTelevisor(300, "azul", 'F', 7, 47,false);
        electrodomesticos[9]  = ejecutable.crearTelevisor(100, "rojo", 'D', 7, 60,true);

        ejecutable.imprimirElectrodomesticos(electrodomesticos);
    }

}

