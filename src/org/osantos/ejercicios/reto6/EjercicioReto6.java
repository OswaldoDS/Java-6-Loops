package org.osantos.ejercicios.reto6;

import java.util.Scanner;

public class EjercicioReto6 {
    public static void main(String[] args) {
        //Actividad: Secuencia fibonacci
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuántos números quieres de salida: ");
        short valor = scanner.nextShort();
        int a = 0, b = 1, c = 0;
        System.out.println("======[Con FOR]======");
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= (valor - 2); i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        System.out.println("======[Con WHILE]======");
        a = 0;
        b = 1;
        c = 0;
        int count = 1;
        System.out.println(a);
        System.out.println(b);
        while (count <= (valor - 2)) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            count++;
        }

        System.out.println("======[Con DO-WHILE]======");
        a = 0;
        b = 1;
        c = 0;
        count = 1;
        System.out.println(a);
        System.out.println(b);
        do {
            if (valor <= 2) {
                break;
            }
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            count++;
        } while (count <= (valor - 2));

//        System.out.println("======[Con Recursividad]======"); //Esto es con un for y creando una función

    }
}
