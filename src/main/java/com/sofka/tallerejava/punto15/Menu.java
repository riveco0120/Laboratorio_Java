package com.sofka.tallerejava.punto15;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner consola = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 8) {
            try {
                System.out.println("----GESTION CINEMATOGRAFICA----");
                System.out.println("1-NUEVO ACTOR"
                        + "\n" + "2-BUSCAR ACTOR"
                        + "\n" + "3-ELIMINAR ACTOR"
                        + "\n" + "4-MODIFICAR ACTOR"
                        + "\n" + "5-VER TODOS LOS ACTORES"
                        + "\n" + "6-VER PELICULAS DE LOS ACTORES"
                        + "\n" + "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES"
                        + "\n" + "8-SALIR");
                System.out.println("Elija una opcion");
                opcion = Integer.parseInt(consola.nextLine());
                switch (opcion) {
                    case 1:
                        continue;
                    case 2:
                        continue;
                    case 3:
                        continue;
                    case 4:
                        continue;
                    case 5:
                        continue;
                    case 6:
                        continue;
                    case 7:
                        continue;
                    case 8:
                        System.out.println("Salio del menu");
                        break;
                    default:
                        System.out.println("Utilizo una opcion invalidad");
                        continue;

                }

            }catch(Exception ex){
                System.out.println("Ocurrio un error al selecionar la opcion");
            }
        }
        System.out.println("Hasta Pronto");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
    }
    }


