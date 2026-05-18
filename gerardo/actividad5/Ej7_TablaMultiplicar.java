import java.util.Scanner;

public class Ej7_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== TABLA DE MULTIPLICAR (For) ===");
        System.out.print("Ingrese un número natural: ");
        int num = entrada.nextInt();

        System.out.println("\nTabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
