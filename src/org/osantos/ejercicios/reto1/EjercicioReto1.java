package org.osantos.ejercicios.reto1;

import java.util.Random;
import java.util.Scanner;

public class EjercicioReto1 {
    public static void main(String[] args) {
        //Actividad: Programa generador de número ganador al azar
        Scanner scanner = new Scanner(System.in);

        //Número total de participantes
        System.out.print("Ingresa el número total de participantes: ");
        int participantes = scanner.nextInt();

        //Número ganador usando la Clase Random en vez de la clase Math
        Random randomObj = new Random();
        //Se define el rango de 1 a N de forma incluyente
        int random = 1 + randomObj.nextInt(participantes);
        System.out.println("El número ganador es: " + random);
    }
}
