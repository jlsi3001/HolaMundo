package com.acme;

public class HolaMundo {

    public static void main(String[] args) {

        //Se crea el objeto
        Mensaje msg = new Mensaje();

        //alt + enter ==> para introducir una variable local
        String nombre = msg.solicitaDatos("Ingresa tu nombre");
        msg.saludar(nombre);


    }

}
