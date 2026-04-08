package org.osantos.ejercicios.reto6;

import java.util.Scanner;

public class EjercicioReto6 {
    public static void main(String[] args) {
        //Actividad: Secuencia fibonacci
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuántos números quieres de salida: ");
        short valor = scanner.nextShort();
        int a = 0, b = 1, c = 0;
        System.out.println("======[Con FOR]======[");
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= valor - 2; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }


    }
}
