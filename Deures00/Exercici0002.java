package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Escriu el valor en Euros: ");
        String euros_input = scanner.nextLine();
        double euros = Double.parseDouble(euros_input.replace(',', '.'));

        System.out.print("Escriu la tasa de conversió (ex: 1.25): ");
        String tasa_conversio_input = scanner.nextLine();
        double tasa_conversio = Double.parseDouble(tasa_conversio_input.replace(',', '.'));

        double dollars = euros * tasa_conversio;

        System.out.printf(localeUS, "El valor de %.2f€ són %.2f$%n", euros, dollars);

        scanner.close();
    }
}
