package com.company;

public class ForStructure {

    public void test() {
        // for( CONTADOR ; CONDICION ; INCREMENTO ) {
        //     BLOQUE DE CODIGO
        // }

        // Orden de ejecucion del FOR:
        // 1ero se ejecuta linea en CONTADOR
        // 2to se ejecuta la CONDICION
        // 3do se ejecuta el bloque de codigo
        // 4ero se ejecuta el INCREMENTO
        // 5to -> se repite el paso 2do al 4to

        for (int counter = 0; counter < 10; counter++) {
            System.out.println("El valor del contador es: " + counter);
        }

        for (int counter = 0; counter < 10; ) {
            System.out.println("El valor del contador es: " + counter);
            counter++;
        }

        int counter = 0;
        for (; counter < 10; ) {
            System.out.println("El valor del contador es: " + counter);
            counter++;
        }
    }
}
