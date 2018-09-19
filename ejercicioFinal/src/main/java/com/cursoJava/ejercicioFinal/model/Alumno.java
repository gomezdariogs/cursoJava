package com.cursoJava.ejercicioFinal.model;

public class Alumno {
    private String nombre;
    private String apellido;
    private int nota;
    private String curso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Alumno(String nombre, String apellido, int nota, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.curso = curso;
    }

    public Alumno() {
    }


}
