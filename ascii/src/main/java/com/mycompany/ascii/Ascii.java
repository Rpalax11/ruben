package com.mycompany.ascii;

import java.util.Scanner;

public class Ascii {

    public static void main(String[] args) {
        int numero;
        char caracter;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta un caracter");
        caracter = scanner.next().charAt(0);
        numero = (int) caracter;
        System.out.println("ASCII: " + numero);
    }
}
