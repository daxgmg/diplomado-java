import java.util.Scanner;

public class Ej7_PuntoDeSilla {
    /*
     * PUNTO DE SILLA: Un elemento es punto de silla si es el MENOR de su fila
     * y al mismo tiempo el MAYOR de su columna.
     * La matriz es de 3x4 = 12 valores.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double[][] matriz = new double[3][4];

        System.out.println("=== PUNTO DE SILLA EN MATRIZ 3x4 ===");
        System.out.println("(Un punto de silla es el menor de su fila y el mayor de su columna)\n");

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Ingrese un valor [" + f + "][" + c + "]: ");
                matriz[f][c] = ent.nextDouble();
            }
        }

        // Mostrar matriz ingresada
        System.out.println("\nMatriz ingresada:");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++)
                System.out.print(matriz[f][c] + "\t");
            System.out.println();
        }

        // Buscar punto de silla
        boolean encontrado = false;
        for (int f = 0; f < 3; f++) {
            // Encontrar el mínimo de la fila f
            double minFila = matriz[f][0];
            int colMin = 0;
            for (int c = 1; c < 4; c++) {
                if (matriz[f][c] < minFila) {
                    minFila = matriz[f][c];
                    colMin = c;
                }
            }

            // Verificar si ese mínimo es el máximo de su columna
            double maxCol = matriz[0][colMin];
            for (int i = 1; i < 3; i++) {
                if (matriz[i][colMin] > maxCol)
                    maxCol = matriz[i][colMin];
            }

            if (minFila == maxCol) {
                System.out.println("\n¡Se encontró un PUNTO DE SILLA!");
                System.out.println("Valor: " + minFila + "  en posición [" + f + "][" + colMin + "]");
                encontrado = true;
            }
        }

        if (!encontrado)
            System.out.println("\nNo existe ningún punto de silla en la matriz.");
    }
}
