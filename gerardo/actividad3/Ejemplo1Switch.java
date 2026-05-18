import java.util.Scanner;

public class Ejemplo1Switch {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;
        String dia = "";

        System.out.println("Escriba un número entero entre 1 y 7");
        num = entrada.nextInt();

        switch(num)
        {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miércoles";
                break;
            case 5:
                dia = "Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                System.out.println("Error");
        }

        if(!dia.equals(""))
        {
            System.out.println("");
            System.out.println("El día de la semana que corresponde es: " + dia);
        }
    }
}
