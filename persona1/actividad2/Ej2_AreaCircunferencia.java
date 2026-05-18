import java.util.Scanner;

public class Ej2_AreaCircunferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== ÁREA DE UNA CIRCUNFERENCIA ===");
        System.out.print("Ingrese el radio: ");
        double radio = entrada.nextDouble();

        double area = Math.PI * radio * radio;

        System.out.println("");
        System.out.println("El área de la circunferencia es: " + area);
    }
}
