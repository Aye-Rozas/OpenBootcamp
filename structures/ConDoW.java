package com.company;

public class ConDoW {
    public static void main(String[] args) {
        int w = 7;
        do {
            System.out.println(w++ < 3);
        }
        while (w < 3);
    }
}