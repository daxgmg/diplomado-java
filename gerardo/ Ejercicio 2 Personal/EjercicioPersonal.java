public class EjercicioPersonal {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan Pérez", 160);
        emp.Registrar();
        System.out.println("Sueldo: $" + emp.calcularSueldo());
    }
}

abstract class PersonalAbstracto {
    protected String nombre;

    public abstract void Registrar();
    public abstract double calcularSueldo();
}

class Empleado extends PersonalAbstracto {
    private int horasTrabajadas;

    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void Registrar() {
        System.out.println("Empleado registrado: " + nombre);
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * 3.75;
    }
}