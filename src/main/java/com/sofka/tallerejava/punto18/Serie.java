package com.sofka.tallerejava.punto18;

public class Serie {

    private String titulo = "";
    private int numeroTemporda = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() {

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporda, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporda = numeroTemporda;
        this.genero = genero;
        this.creador = creador;
    }
}
