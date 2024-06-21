package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje) {
        System.out.print(mensaje);
        //alt + insert sobre el igual para agregar ciertos valores
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
        }

    public void saludar(Persona p) {

        //lo que realiza el %s es tomar el valor del nombre
        System.out.printf("Hola %s, Bienvenido a Java \n", p);
    }
}