import java.util.Scanner;

public class Ej1_FrutasInverso {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String[] frutas = new String[10];

        System.out.println("=== VECTOR DE FRUTAS EN ORDEN INVERSO ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el nombre de una fruta [" + i + "]: ");
            frutas[i] = ent.nextLine();
        }

        System.out.println("\nContenido del vector en orden INVERSO:");
        for (int i = 9; i >= 0; i--) {
            System.out.println("[" + i + "] " + frutas[i]);
        }
    }
}
