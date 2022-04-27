package com.sofka.tallerejava.presentacion;

import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int opcion = -1;
        int opcion2 = -1;
        while (opcion != 0) {
            try {
                System.out.println("Elige una opncion: \n"
                        + "1. Comenzar \n"
                        + "0. Salir");
                opcion = Integer.parseInt(consola.nextLine());
                switch (opcion) {
                    case 1:
                        while (opcion2 != 0) {
                            try {
                                System.out.println("Menu principal");
                                System.out.println("Elige una opncion: \n"
                                        + "1. Comparar dos numeros cuales quiera\n"
                                        + "2. Comarar numero ingresado por consola\n"
                                        + "3. Calcular area de un circulo\n"
                                        + "4. Mostrar precio con iva\n"
                                        + "5. Numeros impares y pares del 1 al 100\n"
                                        + "6. Numeros impares y pares usando for\n"
                                        + "7. Comprobar numero mayor que cero\n"
                                        + "8. Dia laboral de la semana\n"
                                        + "9. Modificar frase y agregar\n"
                                        + "10. Eliminar los espacio de una frease\n"
                                        + "11. Contador de vocales\n"
                                        + "12. Comparar palabras\n"
                                        + "13. Consultar fecha\n"
                                        + "14. Contador de 2 en 2\n"
                                        + "15. Menu\n"
                                        + "16. Ejercicio 16(Persona)\n"
                                        + "17. Ejercicio 17(Electrodomesticos)\n"
                                        + "18. Ejercicio 18()\n"
                                        + "0. Atras");
                                opcion2 = Integer.parseInt(consola.nextLine());
                                switch (opcion2) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        break;
                                    case 9:
                                        break;
                                    case 10:
                                        break;
                                    case 11:
                                        break;
                                    case 12:
                                        break;
                                    case 13:
                                        break;
                                    case 14:
                                        break;
                                    case 15:
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        break;
                                    case 18:
                                        break;
                                    case 0:
                                        System.out.println("Salio del menu");
                                        break;
                                    default:
                                        System.out.println("Opcion invalidad");
                                        break;

                                }
                            } catch (Exception e) {
                                System.out.println("No ingrese letras solo numeros");
                            }

                        }
                    case 0:
                        System.out.println("Hasta pronto");
                        break;
                    default:
                        System.out.println("Opcion invalidad");
                        break;
                }

            } catch (Exception e) {
                System.out.println("No ingrese letras solo numeros");
            }
        }
    }

}
