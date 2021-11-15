package com.company;

public class SwitchStructure {

    public void test() {
        // la estructura de control switch evalua el contenido de la variable y lo compara con las opciones
        // disponibles en el bloque

        String dayOfWeek = "Saturday";
        switch (dayOfWeek) { // dentro del parentesis puede ir un String, o variables finales
            case "Monday":
                System.out.println("Day of the week is Monday");
                break;
            case "Tuesday":
                System.out.println("Day of the week is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Day of the week is Wednesday");
                break;
            case "Thursday":
                System.out.println("Day of the week is Thursday");
                break;
            case "Friday":
                System.out.println("Day of the week is Friday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Day of the week is Weekend");
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }
}
