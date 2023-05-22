package com.company;

public class ExercisesCoche {
    public static void main(String[] args) {
        Coche miCoche= new Coche();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.contarPuertas());
    }
}


class Coche {
    private int puerta;

    public void incrementarPuertas() {
        puerta++;
    }

    public int contarPuertas() {
        return puerta;
    }
}

