package org.osantos.ejercicios.reto4;

import java.util.Scanner;

public class EjercicioReto4 {
    public static void main(String[] args) {
        //Actividad: Desarrollar sistema para calcular las primas mensuales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        byte edad = scanner.nextByte();

        System.out.print("Ingresa tus ingresos mensuales: ");
        double ingresos = scanner.nextDouble();
        double ingresosMensuales = ingresos;
        if (edad >= 70) {
            ingresos += 500.0;
        } else if (edad >= 50) { //&& edad <= 69
            ingresos += 400.0;
        } else if (edad >= 30) { //&& edad <= 49
            ingresos += 250.0;
        } else {    //edad <= 29
            ingresos += 100.0;
        }
        ingresos = (ingresosMensuales >= 300) ? ingresos * 1.1 : ingresos * 1.05;
        System.out.println("Prima mensual: " + Math.round(ingresos));
    }
}
