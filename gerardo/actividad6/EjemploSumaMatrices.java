import java.util.Scanner;

public class EjemploSumaMatrices {
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);
        double[][] mat1 = new double[3][3];
        double[][] mat2 = new double[3][3];
        double[][] matR = new double[3][3];

        //llenar la matriz 1
        System.out.println("Llenando la matriz 1");
        for(int f = 0; f < 3; f++)
        {
            for (int c = 0; c < 3; c++)
            {
                System.out.println("Ingrese un número [" + f + "][" + c + "]");
                mat1[f][c] = ent.nextDouble();
            }
        }

        //llenar la matriz 2
        System.out.println("");
        System.out.println("Llenando la matriz 2");
        for(int f = 0; f < 3; f++)
        {
            for (int c = 0; c < 3; c++)
            {
                System.out.println("Ingrese un número [" + f + "][" + c + "]");
                mat2[f][c] = ent.nextDouble();
            }
        }

        //sumar los valores
        for(int f = 0; f < 3; f++)
        {
            for(int c = 0; c < 3; c++)
            {
                matR[f][c] = mat1[f][c] + mat2[f][c];
            }
        }

        //mostrar el resultado
        System.out.println("\nResultado de la suma de matrices:");
        for(int f = 0; f < 3; f++)
        {
            for(int c = 0; c < 3; c++)
            {
                System.out.print(matR[f][c] + "\t");
            }
            System.out.print("\n");
        }
    }
}
