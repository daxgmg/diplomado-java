public class EjercicioProfesion {
    public static void main(String[] args) {
        Medico med = new Medico("Dr. Ramírez", 20);
        Ingeniero ing = new Ingeniero("Ing. Torres", 15);

        System.out.println("=== MÉDICO ===");
        System.out.println("Nombre: " + med.nombre);
        System.out.println("Sueldo: $" + med.calcularSueldo());

        System.out.println("\n=== INGENIERO ===");
        System.out.println("Nombre: " + ing.nombre);
        System.out.println("Sueldo: $" + ing.calcularSueldo());
    }
}

interface Profesion {
    double calcularSueldo();
}

class Medico implements Profesion {
    public String nombre;
    private int pacientesAtendidos;

    public Medico(String nombre, int pacientesAtendidos) {
        this.nombre = nombre;
        this.pacientesAtendidos = pacientesAtendidos;
    }

    @Override
    public double calcularSueldo() {
        return pacientesAtendidos * 50.0;
    }
}

class Ingeniero implements Profesion {
    public String nombre;
    private int proyectosCompletados;

    public Ingeniero(String nombre, int proyectosCompletados) {
        this.nombre = nombre;
        this.proyectosCompletados = proyectosCompletados;
    }

    @Override
    public double calcularSueldo() {
        return proyectosCompletados * 200.0;
    }
}