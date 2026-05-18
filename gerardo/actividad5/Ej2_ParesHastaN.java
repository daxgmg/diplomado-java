import java.util.Scanner;

public class Ej2_ParesHastaN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== NÚMEROS PARES ENTRE 0 Y N (While) ===");
        System.out.print("Ingrese un número entero: ");
        int n = entrada.nextInt();

        System.out.println("\nNúmeros pares entre 0 y " + n + ":");
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
