import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, resul = 0;
        boolean error = false;
        char op;

        System.out.println("Escriba el primer número");
        num1 = entrada.nextDouble();

        System.out.println("Escriba el segundo número");
        num2 = entrada.nextDouble();

        System.out.println("Escriba signo de la operación");
        op = entrada.next().charAt(0);

        switch(op)
        {
            case '+':
                resul = num1 + num2;
                break;
            case '-':
                resul = num1 - num2;
                break;
            case '*':
                resul = num1 * num2;
                break;
            case '/':
                resul = num1 / num2;
                break;
            case '%':
                resul = num1 % num2;
                break;
            default:
                error = true;
                System.out.println("Error. Operación inválida");
        }

        if(!error)
        {
            System.out.println("");
            System.out.println("El resultado de la operación es: " + resul);
        }
    }
}
