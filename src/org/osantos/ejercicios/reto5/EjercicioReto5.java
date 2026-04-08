package org.osantos.ejercicios.reto5;

import java.util.Scanner;

public class EjercicioReto5 {
    public static void main(String[] args) {
        //Actividad: Programa que solicite username y password
        Scanner scanner = new Scanner(System.in);

        //Username predefinido
        String username = "OswaldoGen";
        String usernameT = null;
        //Password predefinido
        String password = "admin123";
        String passwordT = null;
        byte options;

        do {
            System.out.print("Ingrese su username: ");
            usernameT = scanner.nextLine();

            System.out.print("Ingrese su password: ");
            passwordT = scanner.nextLine();

            if (username.equals(usernameT) && password.equals(passwordT)) {
                System.out.println("Usuario y contraseña correcto! \n");
                break;
            }
            System.out.println("Usuario o contraseña incorrecta");
        } while (true);

        System.out.println("Bienvenido " + usernameT);

        System.out.println("======[MENÚ]======");
        System.out.print("[1] "
                + "[2] Consultar saldo \n"
                + "[3] Ingresar dinero \n"
                + "[4] Retirar dinero \n"
                + "[5] Consultar últimos movimientos \n"
                + "[6] Salida \n"
                + "Elige una opción: ");
        options = scanner.nextByte();


    }
}
