import java.util.Scanner;

public class Ej4_MayorMenor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("=== MAYOR Y MENOR DE 10 NÚMEROS ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número [" + i + "]: ");
            numeros[i] = ent.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor)
                mayor = numeros[i];
            if (numeros[i] < menor)
                menor = numeros[i];
        }

        System.out.println("\nEl valor MAYOR ingresado es: " + mayor);
        System.out.println("El valor MENOR ingresado es: " + menor);
    }
}
