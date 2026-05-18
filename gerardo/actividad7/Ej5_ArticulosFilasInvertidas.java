import java.util.Scanner;

public class Ej5_ArticulosFilasInvertidas {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        // Matriz 3x3 = 9 artículos
        String[][] articulos = new String[3][3];

        System.out.println("=== MATRIZ DE ARTÍCULOS (filas invertidas) ===");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Ingrese el nombre de un artículo [" + f + "][" + c + "]: ");
                articulos[f][c] = ent.nextLine();
            }
        }

        System.out.println("\nContenido de la matriz con FILAS INVERTIDAS:");
        for (int f = 2; f >= 0; f--) {
            for (int c = 0; c < 3; c++) {
                System.out.print(articulos[f][c] + "\t");
            }
            System.out.println();
        }
    }
}
