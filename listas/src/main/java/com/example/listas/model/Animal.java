package com.example.listas.model;

public class Animal {
    private String nombre;

    private String familia;
    private boolean esCazador;
    private int fuerza;
    private boolean esVegetariano;
    private int peso;

    public Animal(String nombre, String familia, boolean esCazador, int fuerza, boolean esVegetariano, int peso) {
        this.nombre = nombre;
        this.familia = familia;
        this.esCazador = esCazador;
        this.fuerza = fuerza;
        this.esVegetariano = esVegetariano;
        this.peso = peso;
    }

    public Animal() {


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public boolean isEsCazador() {
        return esCazador;
    }

    public void setEsCazador(boolean esCazador) {
        this.esCazador = esCazador;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isEsVegetariano() {
        return esVegetariano;
    }

    public void setEsVegetariano(boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", familia='" + familia + '\'' +
                ", esCazador=" + esCazador +
                ", fuerza=" + fuerza +
                ", esVegetariano=" + esVegetariano +
                ", peso=" + peso +
                '}';
    }
}


