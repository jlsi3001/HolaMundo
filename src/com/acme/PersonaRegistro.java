package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        return "%s %s".formatedd(nombre, apellidos);
    }
}
