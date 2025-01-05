package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0003 {
    public static double calcularPreuFinal(double preuBase, double iva, double descompte) {
        double preuAmbIva = preuBase + (preuBase * iva / 100);
        return preuAmbIva - (preuAmbIva * descompte / 100);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Introdueix el preu base: ");
        String preuBaseInput = scanner.nextLine();
        double preuBase = Double.parseDouble(preuBaseInput.replace(',', '.'));

        System.out.print("Introdueix l'IVA (%): ");
        String ivaInput = scanner.nextLine();
        double iva = Double.parseDouble(ivaInput.replace(',', '.'));

        System.out.print("Introdueix el descompte (%): ");
        String descompteInput = scanner.nextLine();
        double descompte = Double.parseDouble(descompteInput.replace(',', '.'));

        double preuFinal = calcularPreuFinal(preuBase, iva, descompte);

        System.out.printf(localeUS, "El preu final és: %.2f\n", preuFinal);
        
        scanner.close();
    }
}
