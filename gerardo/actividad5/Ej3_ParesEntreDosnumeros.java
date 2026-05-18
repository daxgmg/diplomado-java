import java.util.Scanner;

public class Ej3_ParesEntreDosnumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== NÚMEROS PARES ENTRE DOS NÚMEROS (While) ===");
        System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("\nNúmeros pares entre " + menor + " y " + mayor + ":");
        int i = menor;
        while (i <= mayor) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
