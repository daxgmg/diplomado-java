import java.util.Scanner;

public class Ej4_SumaRepetitiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";

        System.out.println("=== SUMA DE DOS NÚMEROS REPETITIVA (While) ===");

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el primer número: ");
            double num1 = entrada.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = entrada.nextDouble();

            System.out.println("Resultado: " + (num1 + num2));

            System.out.print("¿Desea continuar? (s/n): ");
            continuar = entrada.next();
        }

        System.out.println("Programa finalizado.");
    }
}
