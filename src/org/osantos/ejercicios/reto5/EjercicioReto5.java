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
        double saldo = 12000.0;
        //Divisas
        double usd = 17.54; //usd --> mxn
        double eur = 20.48; //eur --> mxn
        double eur_usd = 1.17; //eur --> usd


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

        do {
            System.out.println("======[MENÚ]======");
            System.out.print("[1] Consultar saldo \n"
                    + "[2] Ingresar dinero \n"
                    + "[3] Retirar dinero \n"
                    + "[4] Consultar últimos movimientos \n"
                    + "[5] Convertir divisas \n"
                    + "[6] Salida \n"
                    + "Elige una opción: ");
            options = scanner.nextByte();

            switch (options) {
                case 1:
                    System.out.println("Tu saldo es de: $" + saldo + "\n");
                    break;
                case 2:
                    System.out.print("Cuánto deseas depositar: $");
                    double depositar = scanner.nextDouble();
                    saldo += depositar;
                    System.out.println("Deposito exitoso!\n");
                    break;
                case 3:
                    System.out.print("Cuánto deseas retirar: $");
                    double retiro = scanner.nextDouble();
                    if (saldo < retiro) {
                        System.out.println("Saldo insuficiente...\n");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso!\n");
                    }
                    break;
                case 4:
                    System.out.println("Sin contenido");
                    break;
                case 5:
                    byte opcionDivisas;
                    do {
                        System.out.print("\n======[Divisa]======\n"
                                + "[1] MXN --> USD\n"
                                + "[2] USD --> MXN\n"
                                + "[3] MXN --> EUR\n"
                                + "[4] EUR --> MXN\n"
                                + "[5] USD --> EUR\n"
                                + "[6] EUR --> USD\n"
                                + "[7] Salir\n"
                                + "Elige una opción: ");
                        opcionDivisas = scanner.nextByte();

                        double divisas;

                        switch (opcionDivisas) {
                            case 1:
                                System.out.print("Cuánto MXN deseas convertir a USD: ");
                                divisas = scanner.nextDouble();
                                System.out.println(divisas + "MXN --> " + (divisas / usd) + "USD");
                                break;
                            case 2:
                                System.out.print("Cuánto USD deseas convertir a MXN: ");
                                divisas = scanner.nextDouble();
                                System.out.println(divisas + "USD --> " + (divisas * usd) + "MXN");
                                break;
                            case 3:
                                System.out.print("Cuánto MXN deseas convertir a EUR: ");
                                divisas = scanner.nextDouble();
                                System.out.println(divisas + "MXN --> " + (divisas / eur) + "EUR");
                                break;
                            case 4:
                                System.out.print("Cuánto EUR deseas convertir a MXN: ");
                                divisas = scanner.nextDouble();
                                System.out.println(divisas + "EUR --> " + (divisas * eur) + "MXN\n");
                                break;
                            case 5:
                                System.out.print("Cuánto USD deseas convertir a EUR: ");
                                divisas = scanner.nextDouble();
                                System.out.println(divisas + "USD --> " + (divisas / eur_usd) + "EUR\n");
                                break;
                            case 6:
                                System.out.print("Cuánto EUR deseas convertir a USD: ");
                                divisas = scanner.nextDouble();
                                System.out.println(divisas + "EUR --> " + eur_usd + "USD\n");
                                break;

                            case 7:
                                System.out.println("Saliendo de conversiones de divisas...\n");
                                break;
                            default:
                                System.out.println("Opción no reconocida...");
                        }
                    } while (opcionDivisas != 7);

                    break;
                case 6:
                    System.out.println("Regresa pronto...!\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no reconocida...\n");
            }
        } while (true);

    }
}
