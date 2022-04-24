package com.sofka.tallerejava.punto18;

public class Serie implements IServicios{

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporda() {
        return numeroTemporda;
    }

    public void setNumeroTemporda(int numeroTemporda) {
        this.numeroTemporda = numeroTemporda;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporda=" + numeroTemporda +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void Entregar() {
        this.entregado = true;

    }

    @Override
    public void devolver() {
        this.entregado =false;
    }

    @Override
    public boolean IsEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        int auxRes=-1;
        Serie miSerie= (Serie) a;
        if (this.numeroTemporda>miSerie.getNumeroTemporda()){
            auxRes=1;
        }
        else if(this.numeroTemporda == miSerie.getNumeroTemporda()){
            auxRes=0;
        }
        return auxRes;
            }
}
