import java.util.Scanner;

public class Ejemplo1Matrices {
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);
        String[][] animales = new String[3][3];

        //llenado de la matriz
        for(int f = 0; f < 3; f++)
        {
            for(int c = 0; c < 3; c++)
            {
                System.out.println("Escriba el nombre de un animal [" + f + "][" + c + "]");
                animales[f][c] = ent.next();
            }
        }

        //mostrar el contenido
        System.out.println("");
        for(int f = 0; f < 3; f++)
        {
            for(int c = 0; c < 3; c++)
            {
                System.out.print(animales[f][c] + "\t");
            }
            System.out.print("\n");
        }
    }
}
