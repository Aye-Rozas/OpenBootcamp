package com.company;

public class ContSwitch {
    public static void main(String[] args) {
     var estacion = "Primavera";
        switch (estacion) {
            case "Verano":
                System.out.println("usar protector solar");
                break;
            case "Otoño":
                System.out.println("llevar pañuelos");
                break;
            case "Invierno":
                System.out.println("abrigarse bien");
                break;
            case "Primavera":
                System.out.println("no olvidarse el paraguas");
                break;
            default:
                System.out.println("no es una estacion del año");

        }
    }
}
