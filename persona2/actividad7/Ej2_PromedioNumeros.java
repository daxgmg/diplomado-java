import java.util.Scanner;

public class Ej2_PromedioNumeros {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        System.out.println("=== PROMEDIO DE 12 NÚMEROS ===");
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el número [" + i + "]: ");
            numeros[i] = ent.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / 12;
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);
    }
}
