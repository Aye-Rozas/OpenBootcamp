package com.company;

public class IfElseStructure {

    public void test() {
        // if evalua una condicion booleana, y ejecuta el codigo en bloques
        // si la condicion es verdadera
        if (3 > 1) { // condicion verdadera
            System.out.println("El numero ingresado es mayor a 1");
        }

        // se puede agregar un else, que se ejecuta solamente si la condicion es falsa
        if (3 < 1) { // condicion falsa
            System.out.println("El numero ingresado es menor a 1");
        } else {
            System.out.println("El numero ingresado no es menor que 1");
        }

        // se pueden concatenar if else
        int numero = -10;
        if (numero > 100) {
            System.out.println("El numero ingresado es mayor a 100");
        } else if (numero > 0) {
            System.out.println("El numero es positivo y menor a 100");
        } else {
            System.out.println("El numero es negativo");
        }

        // se pueden anidar if dentro de if else
        int numero2 = 10;
        if (numero2 > 10) {
            System.out.println("El numero ingresado es mayor a 10");
        } else {
            System.out.println("El numero no es mayor a 10");

            if (numero2 > 0) {
                System.out.println("El numero ingresado es positivo");
            }
        }

        // se puede escribir un if sin llaves -> {} si tiene una sola linea a ejecutar
        if (10 > 1)
            System.out.println("El numero ingresado es mayor a 1");
        System.out.println("Esta linea se va a ejecutar incluso si el if es falso");
    }
}
