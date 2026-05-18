import java.util.Scanner;

public class Ej8_MayorDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MAYOR DE TRES NÚMEROS ===");
        System.out.print("Ingrese el número 1: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el número 2: ");
        double num2 = entrada.nextDouble();

        System.out.print("Ingrese el número 3: ");
        double num3 = entrada.nextDouble();

        double mayor;
        if (num1 >= num2 && num1 >= num3)
            mayor = num1;
        else if (num2 >= num1 && num2 >= num3)
            mayor = num2;
        else
            mayor = num3;

        System.out.println("");
        System.out.println("El número mayor es: " + mayor);
    }
}
