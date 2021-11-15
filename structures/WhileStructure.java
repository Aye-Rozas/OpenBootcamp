package com.company;

public class WhileStructure {

    public void test() {
        // evalua una condicion booleana y ejecuta lo que se encuentre en el bloque de codigos
        // mientras la condicion se mantenga verdadera

        int counter = 1;
        while (counter < 10) {
            System.out.println("El contador está en: " + counter);
            counter++; // esto es lo mismo a escribir "counter = counter + 1;"
        }

        do {
            System.out.println("Mi mensaje");
            counter++;
        } while(counter < 30);

        // se puede escribir while en una sola linea tambien, hay que evitarlo
        while (counter < 20)
            counter++;
            System.out.println("El contador está en: " + counter); // esto se imprime una sola vez

        while (3 > 1) { // se ejecuta siempre que 3 > 1
            // el codigo del bloque se va a ejecutar por siempre
        }
    }
}
