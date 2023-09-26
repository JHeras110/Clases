package com.example.model;

public class Clase {
    private int codigoCurso;
    private String nombre;
    private int duracion;
    private int precio;
    public Clase() {
    }
    public Clase(int codigoCurso, String nombre, int duracion, int precio) {
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }
    public int getCodigoCurso() {
        return codigoCurso;
    }
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Clase [codigoCurso=" + codigoCurso + ", nombre=" + nombre + ", duracion=" + duracion + ", precio="
                + precio + "]";
    }
    

}
