package org.osantos.ejercicios.reto3;

import java.util.Random;
import java.util.Scanner;

public class EjercicioReto3 {
    public static void main(String[] args) {
        //Actividad: El usuario debe adivinar el número
        Scanner scanner = new Scanner(System.in);

        //Se define el rango de 1 a 10 de forma incluyente
        Random randomObj = new Random();
        int random = 1 + randomObj.nextInt(10);

        byte numeroUser;

        do {
            System.out.println("Adivina el número del [1-10]");
            System.out.print("Ingresa un número: ");
            numeroUser = scanner.nextByte();

            //Evaluando los números random y numeroUser
            if (random == numeroUser){
                System.out.println("\nAdivinaste el número: " + random);
            } else if (numeroUser > random) {
                System.out.println("\nEl número que ingreso es mayor");
            }else {
                System.out.println("\nEl número que ingreso es menor");
            }

        } while (random != numeroUser); //Se ejecuta mientras random sea diferente de numeroUser, es decir, mientras sea true

    }
}
