package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Escriu el pes (kg): ");
        String pes_input = scanner.nextLine();
        double pes = Double.parseDouble(pes_input.replace(',', '.'));

        System.out.print("Escriu l'alçada (cm): ");
        String altura_input = scanner.nextLine();
        double altura = Double.parseDouble(altura_input.replace(',', '.'));

        altura = altura / 100;

        double imc = pes / (altura * altura);

        System.out.printf(localeUS, "imc = %.2f%n", imc);

        scanner.close();
    }
}
