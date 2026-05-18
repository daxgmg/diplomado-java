import java.util.Scanner;

public class Ej4_Hipotenusa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== HIPOTENUSA DE UN TRIÁNGULO RECTÁNGULO ===");
        System.out.print("Ingrese el valor del cateto A: ");
        double catetoA = entrada.nextDouble();

        System.out.print("Ingrese el valor del cateto B: ");
        double catetoB = entrada.nextDouble();

        double hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

        System.out.println("");
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
