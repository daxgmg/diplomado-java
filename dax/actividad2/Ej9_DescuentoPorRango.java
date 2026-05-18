import java.util.Scanner;

public class Ej9_DescuentoPorRango {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== DESCUENTO POR RANGO DE COMPRA ===");
        System.out.print("Ingrese el valor de la compra: $");
        double compra = entrada.nextDouble();

        double porcentaje = 0;
        if (compra < 100) {
            porcentaje = 0;
        } else if (compra >= 100 && compra <= 300) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0.15;
        }

        double descuento = compra * porcentaje;
        double totalPagar = compra - descuento;

        System.out.println("");
        System.out.println("Compra:          $" + compra);
        System.out.println("Descuento (" + (int)(porcentaje * 100) + "%):  $" + descuento);
        System.out.println("Total a pagar:   $" + totalPagar);
    }
}
