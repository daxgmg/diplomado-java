public class JuegoAnimalesNivel2 {
    public static void main(String[] args)
    {
        // Nivel 1
        Nivel1 n1 = new Nivel1();
        n1.imprimePreguntas();
        System.out.println("//***************MARCADOR*************\\");
        System.out.println("Nivel 1 - Puntaje: " + n1.puntaje);

        // Nivel 2
        Nivel2 n2 = new Nivel2();
        n2.imprimePreguntas();
        System.out.println("//***************MARCADOR*************\\");
        System.out.println("Nivel 2 - Puntaje: " + n2.puntaje);

        // Total
        int total = n1.puntaje + n2.puntaje;
        System.out.println("Puntaje total acumulado: " + total);
    }
}