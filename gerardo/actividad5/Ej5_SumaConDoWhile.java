import java.util.Scanner;

public class Ej5_SumaConDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        String continuar;

        System.out.println("=== SUMA ACUMULADA CON DO WHILE ===");

        do {
            System.out.print("Ingrese un número: ");
            double num = entrada.nextDouble();
            suma += num;

            System.out.print("¿Desea continuar? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("");
        System.out.println("La suma total de los números ingresados es: " + suma);
    }
}
