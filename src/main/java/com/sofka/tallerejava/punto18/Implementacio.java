package com.sofka.tallerejava.punto18;

public class Implementacio {
    public static void main(String[] args) {

        VideoJuego[] videoJuegos = new VideoJuego[5];
        videoJuegos[0] = new VideoJuego("Fifa", 10);
        videoJuegos[1] = new VideoJuego("Days Gone", 15);
        videoJuegos[2] = new VideoJuego("Assasins creed", 9);
        videoJuegos[3] = new VideoJuego("Tethen Arena", 14);
        videoJuegos[4] = new VideoJuego("Axie Infinity", 5);

        Serie[] series = new Serie[5];
        series[0] = new Serie("Dark", 3, "suspenso", "netflix");
        series[1] = new Serie("House of cards", 6, "intriga", "netflix");
        series[2] = new Serie("the Walking dead", 8, "zombies", "AMC");
        series[3] = new Serie("GOT", 8, "Accion", "HBO");
        series[4] = new Serie("Vikingos", 7, "Accion", "History");

        videoJuegos[0].Entregar();
        videoJuegos[3].Entregar();
        videoJuegos[4].Entregar();
        series[1].Entregar();
        series[4].Entregar();
        series[3].Entregar();

        int cantidadEntregados = 0;
        for (Serie s : series) {
            if (s.IsEntregado()) {
                cantidadEntregados += 1;
                s.devolver();
            }
        }
        for (VideoJuego v : videoJuegos) {
            if (v.IsEntregado()) {
                cantidadEntregados += 1;
                v.devolver();
            }
        }
        System.out.println("Existen " + cantidadEntregados + " entregados entre videojuegos y series");


        VideoJuego videoJuegoConMasHoras = videoJuegos[0];
        Serie miSerieConMasTemporadas = series[0];
        for (int i = 1; i < videoJuegos.length - 1; i++) {
            if (videoJuegos[i].compareTo(videoJuegoConMasHoras) == 1) {
                videoJuegoConMasHoras = videoJuegos[i];
            }
            if (series[i].compareTo(miSerieConMasTemporadas) == 1) {
                miSerieConMasTemporadas = series[i];
            }
        }

        System.out.println("el videojuego con más horas " + videoJuegoConMasHoras.toString());
        System.out.println("la serie con más temporadas " + miSerieConMasTemporadas.toString());
    }
}

