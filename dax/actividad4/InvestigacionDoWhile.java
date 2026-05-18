/**
 * ACTIVIDAD 4 - Investigación: Do While vs While
 *
 * DIFERENCIAS ENTRE WHILE Y DO WHILE:
 *
 * WHILE:
 *  - Evalúa la condición ANTES de ejecutar el bloque de código.
 *  - Si la condición es falsa desde el inicio, el bloque NUNCA se ejecuta.
 *  - Sintaxis:
 *      while (condición) {
 *          // código
 *      }
 *
 * DO WHILE:
 *  - Ejecuta el bloque de código AL MENOS UNA VEZ, y LUEGO evalúa la condición.
 *  - Aunque la condición sea falsa desde el inicio, el bloque se ejecuta una vez.
 *  - Sintaxis:
 *      do {
 *          // código
 *      } while (condición);
 *
 * ¿CUÁNDO USAR CADA UNA?
 *  - Usa WHILE cuando no sabes si el bloque debe ejecutarse (puede que 0 veces).
 *  - Usa DO WHILE cuando el bloque SIEMPRE debe ejecutarse al menos una vez
 *    (por ejemplo, mostrar un menú al usuario).
 */

public class InvestigacionDoWhile {
    public static void main(String[] args) {

        System.out.println("=== DEMOSTRACIÓN: WHILE vs DO WHILE ===\n");

        // Ejemplo con WHILE - condición falsa desde el inicio
        System.out.println("--- Ejemplo WHILE (condición falsa al inicio) ---");
        int i = 10;
        while (i < 5) {
            System.out.println("Este mensaje NUNCA se muestra con While");
        }
        System.out.println("El bloque While no se ejecutó porque 10 < 5 es falso.\n");

        // Ejemplo con DO WHILE - siempre ejecuta al menos una vez
        System.out.println("--- Ejemplo DO WHILE (condición falsa al inicio) ---");
        int j = 10;
        do {
            System.out.println("Este mensaje SÍ se muestra con Do While (se ejecuta al menos 1 vez)");
        } while (j < 5);
        System.out.println("El bloque Do While se ejecutó UNA VEZ aunque 10 < 5 es falso.\n");

        // Ejemplo práctico: menú con Do While
        System.out.println("--- Ejemplo práctico: contador del 1 al 5 con Do While ---");
        int contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);
    }
}
 
