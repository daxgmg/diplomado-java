import java.util.Scanner;

public class Ej6_TranspuestaMatriz {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        double[][] transpuesta = new double[3][3];

        System.out.println("=== TRANSPUESTA DE UNA MATRIZ 3x3 ===");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Ingrese un valor [" + f + "][" + c + "]: ");
                matriz[f][c] = ent.nextDouble();
            }
        }

        // Calcular transpuesta
        for (int f = 0; f < 3; f++)
            for (int c = 0; c < 3; c++)
                transpuesta[c][f] = matriz[f][c];

        System.out.println("\nMatriz original:");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++)
                System.out.print(matriz[f][c] + "\t");
            System.out.println();
        }

        System.out.println("\nMatriz TRANSPUESTA:");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++)
                System.out.print(transpuesta[f][c] + "\t");
            System.out.println();
        }
    }
}
