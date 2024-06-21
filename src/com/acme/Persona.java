package com.acme;

public class Persona {

    //ATRIBUTOS
    private String nombre, apellidos;

    //ALT + INSERT ==> REALIZAMOS UN CONSTRUCTOR
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellido(String apellidos) {
        this.apellidos = apellidos;
    }

    //GENERAR UNA CADENA
    @Override
    public String toString() {
        return "%s %s".formatted(nombre, apellidos);

    }
}
