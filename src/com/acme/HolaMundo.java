package com.acme;

public class HolaMundo {

    public static void main(String[] args) {

        //Se crea el objeto
        Mensaje msg = new Mensaje();

        //alt + enter ==> para introducir una variable local
        String nombre = msg.solicitaDatos("Ingresa tu nombre: ");
        String apellidos = msg.solicitaDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre, apellidos);
        msg.saludar(p1);
    }

}
