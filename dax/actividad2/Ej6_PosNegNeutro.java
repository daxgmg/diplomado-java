import java.util.Scanner;

public class Ej6_PosNegNeutro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== NÚMERO POSITIVO, NEGATIVO O NEUTRO ===");
        System.out.print("Ingrese un número entero: ");
        int num = entrada.nextInt();

        System.out.println("");
        if (num > 0)
            System.out.println("El número es POSITIVO");
        else if (num < 0)
            System.out.println("El número es NEGATIVO");
        else
            System.out.println("El número es NEUTRO (cero)");
    }
}
