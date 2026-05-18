import java.util.Scanner;

public class Ej3_Descuento10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== DESCUENTO DEL 10% ===");
        System.out.print("Ingrese el monto de la compra: $");
        double monto = entrada.nextDouble();

        double descuento = monto * 0.10;
        double totalPagar = monto - descuento;

        System.out.println("");
        System.out.println("Monto original:  $" + monto);
        System.out.println("Descuento (10%): $" + descuento);
        System.out.println("Total a pagar:   $" + totalPagar);
    }
}
