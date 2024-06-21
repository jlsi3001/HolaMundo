package com.acme;

public record Persona(String nombre, String apellidos) {

    @Override
    public String toString() {
        return "%s %s".concat(nombre + apellidos);
    }
}

