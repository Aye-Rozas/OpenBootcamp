package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Scanner scanner = new Scanner(System.in);
         * int myInt = scanner.nextInt();
         * double myDouble = scanner.nextDouble();
         * String myString = scanner.next();
         */

        /**
         * System.out.print("imprime un mensaje sin un enter al final de la linea")
         * System.out.println("imprime un mensaje y deja una nueva linea al final")
         */
    }

    /**
     * Declarar 2 variables numericas, e indicar cual es la mayor de las dos.
     * Si las dos variables son iguales, tambien indicar
     */
    public static void equals() {

    }

    /**
     * Pedir un numero al usuario e imprimir si el numero es divisible por dos (num % 2 == 0)
     */
    public static void divisible() {
        System.out.println("Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        if (myNumber % 2 == 0) {
            System.out.println("El numero es divisible por 2");
        }
    }

    /**
     * Mostrar los numeros del 1 al 100 que sean multiplos de 3
     */
    public static void multiplos() {
        int counter = 1;
        int f = 100;

        while (counter < f) {
            if (counter % 3 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }

    /**
     * 1. Escribir una contraseña y guardarla en un String
     * 2. Pedir a usuario que ingrese el password por consola
     * 3. Si el usuario ingresa una contraseña invalida, se le tiene que pedir que ingrese el password una vez mas
     * 4. Si a los 3 intentos, el usuario sigue ingresando un pass invalido, terminar el programa
     */
    public static void password() {
        String password = "ginny";
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese mail");
        String name = in.nextLine();
        System.out.println("El mail ingresado es:" + name);


        int counter = 0;
        int f = 3;
        while (counter < f) {
            System.out.println("Ingrese contraseña");
            String input = in.nextLine();
            if (password.equals(input)) {
                System.out.println("Mail y contraseña son correctos");
                break;
            } else {
                System.out.println("Clave incorrecta");
            }
            counter++;
        }
    }

    /**
     * Pedir al usuario que ingrese 5 veces un numero que desee
     * y calcular el promedio de esos 5 numeros, e imprimir en pantalla el resultado
     */
    public static void average() {

    }

    /**
     * Pedir al usuario ingresar un numero mayor a 1. Luego, imprimir en pantalla una escalera de "x"
     * Por ejemplo: usuario ingresa el numero 3. Se tiene que imprimir en pantalla el siguiente patron:
     * x
     * xx
     * xxx
     *
     * Segundo ejemplo: usuario ingresa el numero 6. Se imprime en pantalla el siguiente patron:
     * x
     * xx
     * xxx
     * xxxx
     * xxxxx
     * xxxxxx
     *
     */
    public static void staircase() {

    }

    /**
     * Pedir al usuario que ingrese un numero (superior a 1)
     * El metodo debe imprimir "el numero es primo" o "el numero no es primo" al evaluar
     * si el numero ingresado es primo o no
     *
     * Un numero es primo si es divisible por si mismo y por 1 solamente (es decir, el resto de la division
     * entre los demás numeros que lo preceden nunca debe ser distinto de 0)
     *
     */
    public static void prime() {

    }
}
