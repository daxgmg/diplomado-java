import java.util.Scanner;

public class Ej7_PromedioConValidacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.println("=== PROMEDIO CON VALIDACIÓN (notas entre 0 y 10) ===");

        System.out.print("Ingrese la nota 1 (0-10): ");
        nota = entrada.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida. Ingrese la nota 1 (0-10): ");
            nota = entrada.nextDouble();
        }
        double nota1 = nota;

        System.out.print("Ingrese la nota 2 (0-10): ");
        nota = entrada.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida. Ingrese la nota 2 (0-10): ");
            nota = entrada.nextDouble();
        }
        double nota2 = nota;

        System.out.print("Ingrese la nota 3 (0-10): ");
        nota = entrada.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida. Ingrese la nota 3 (0-10): ");
            nota = entrada.nextDouble();
        }
        double nota3 = nota;

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("");
        System.out.println("Promedio: " + promedio);
        if (promedio >= 6.0)
            System.out.println("Estado: APROBADO");
        else
            System.out.println("Estado: REPROBADO");
    }
}
