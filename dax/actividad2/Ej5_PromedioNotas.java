import java.util.Scanner;

public class Ej5_PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== PROMEDIO DE NOTAS ===");
        System.out.print("Ingrese la nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = entrada.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("");
        System.out.println("Promedio: " + promedio);

        if (promedio >= 6.0)
            System.out.println("Estado: APROBADO");
        else
            System.out.println("Estado: REPROBADO");
    }
}
