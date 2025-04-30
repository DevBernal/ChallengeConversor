package com.devbernal.challengeconversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        APIService api = new APIService();

        while (true) {
            System.out.println("\n=== Conversor de Moneda ===");
            System.out.println("Monedas disponibles:");
            for (Divisa d : Divisa.values()) {
                System.out.println("- " + d);
            }

            System.out.print("\nIngrese la moneda origen (ej: USD): ");
            String origenStr = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese la moneda destino (ej: ARS): ");
            String destinoStr = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer

            try {
                Divisa origen = Divisa.valueOf(origenStr);
                Divisa destino = Divisa.valueOf(destinoStr);
                double tasa = api.obtenerTasaCambio(origen, destino);
                double resultado = Math.round(cantidad * tasa);
                System.out.println(cantidad +" "+origen+ " = " + resultado + " " + destino);
            } catch (IllegalArgumentException e) {
                System.out.println("Moneda no válida. Intente de nuevo.");
            } catch (Exception e) {
                System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            }

            System.out.print("\n¿Desea hacer otra conversión? (s/n): ");
            String continuar = scanner.nextLine().toLowerCase();
            if (!continuar.equals("s")) break;
        }
        scanner.close();
    }
}
