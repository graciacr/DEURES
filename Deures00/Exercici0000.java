package com.exercicis;

import java.util.Scanner;

public class Exercici0000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriu el primer número: ");
        int x = scanner.nextInt();
        System.out.println("Escriu el segon número: ");
        int y = scanner.nextInt();
        int z = x - y;

        System.out.println("El resultat de calcular " + x + " - " + y + " és " + z);

        scanner.close();
    }
}
