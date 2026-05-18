import java.util.Scanner;

public class Ejemplo1Vectores {
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);
        String[] personas = new String[3];

        System.out.println("Escriba el primer nombre");
        personas[0] = ent.nextLine();
        System.out.println("Escriba el segundo nombre");
        personas[1] = ent.nextLine();
        System.out.println("Escriba el tercer nombre");
        personas[2] = ent.nextLine();

        System.out.println("");
        System.out.println("Contenido del vector: " + personas[0] + ", " +
                            personas[1] + ", " + personas[2]);
    }
}
