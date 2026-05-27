import java.util.Scanner;

public class Nivel2 {
    public int puntaje;
    private String respuesta;
    private final Scanner ent;

    public Nivel2(){
        puntaje = 0;
        ent = new Scanner(System.in);
    }

    private void verificar(String correcta) {
        if(respuesta.equalsIgnoreCase(correcta)){
            System.out.println("¡Correcto! Haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + correcta);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    public void imprimePreguntas() {
        System.out.println("¿Cuál es el animal más grande del mundo?");
        respuesta = ent.nextLine();
        verificar("ballena azul");

        System.out.println("¿Qué animal es conocido como el rey de la selva?");
        respuesta = ent.nextLine();
        verificar("leon");

        System.out.println("¿Qué animal tiene trompa larga?");
        respuesta = ent.nextLine();
        verificar("elefante");

        System.out.println("¿Qué animal tiene rayas negras y naranjas?");
        respuesta = ent.nextLine();
        verificar("tigre");
    }
}