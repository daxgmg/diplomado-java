import java.util.Scanner;

public class Ej3_ParesImpares {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[12];
        int cantPares = 0, cantImpares = 0;

        System.out.println("=== CANTIDAD DE PARES E IMPARES EN VECTOR ===");
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el número [" + i + "]: ");
            numeros[i] = ent.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            if (numeros[i] % 2 == 0)
                cantPares++;
            else
                cantImpares++;
        }

        System.out.println("\nCantidad de números pares:   " + cantPares);
        System.out.println("Cantidad de números impares: " + cantImpares);
    }
}
