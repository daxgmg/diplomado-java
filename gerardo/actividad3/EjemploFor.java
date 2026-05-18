import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);
        int num, suma = 0;
        double prom;

        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Escriba un número [" + i + "]");
            num = ent.nextInt();
            suma += num;
        }

        prom = suma / 10.0;
        System.out.println("");
        System.out.println("El promedio es: " + prom);
    }
}
