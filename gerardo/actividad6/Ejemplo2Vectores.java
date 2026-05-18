import java.util.Scanner;

public class Ejemplo2Vectores {
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);
        String[] ciudades = new String[10];

        //llenar el vector
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Escriba el nombre de una ciudad [" + i + "]");
            ciudades[i] = ent.nextLine();
        }

        //mostrar el contenido
        System.out.println("");
        for(int i = 0; i < 10; i++)
        {
            System.out.print("[" + i + "]" + ciudades[i] + ", ");
        }
        System.out.println();
    }
}
