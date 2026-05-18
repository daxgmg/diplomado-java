import java.util.Scanner;

public class Ej1_DescuentoEtiqueta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== DESCUENTO POR ETIQUETA ===");
        System.out.println("Etiquetas: verde=5%, roja=10%, azul=15%, dorada=20%");
        System.out.print("Ingrese el color de etiqueta (verde/roja/azul/dorada): ");
        String etiqueta = entrada.next().toLowerCase();

        System.out.print("Ingrese el monto de la compra: $");
        double monto = entrada.nextDouble();

        double porcentaje = 0;
        switch (etiqueta) {
            case "verde":  porcentaje = 0.05; break;
            case "roja":   porcentaje = 0.10; break;
            case "azul":   porcentaje = 0.15; break;
            case "dorada": porcentaje = 0.20; break;
            default:
                System.out.println("Etiqueta no reconocida. Sin descuento.");
        }

        double descuento = monto * porcentaje;
        double totalPagar = monto - descuento;

        System.out.println("");
        System.out.println("Monto:          $" + monto);
        System.out.println("Descuento (" + (int)(porcentaje*100) + "%): $" + descuento);
        System.out.println("Total a pagar:  $" + totalPagar);
    }
}
