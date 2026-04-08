package org.osantos.ejercicios.reto2;

import java.util.Scanner;

public class EjercicioReto2 {
    public static void main(String[] args) {
        //Actividad: Solicitar un texto al usuario y determinar si es palíndromo
        //Out: "Es un palíndromo", "No es un palíndromo"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para verificar si el texto es palíndromo");
        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine().toLowerCase();

        boolean esPalindromo = true;

        for (int i = 0; i < texto.length() / 2; i++) {
            //aerea -> 5-1-i ; i=0; 4=a (ya que en los arreglos va de 0 a N)-->
//            System.out.println(texto.charAt(texto.length() - 1 - i) + " : " + i);
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        System.out.println(esPalindromo ? "Es palíndromo" : "No es palíndromo");
    }
}
