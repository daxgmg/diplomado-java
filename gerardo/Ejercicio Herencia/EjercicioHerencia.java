public class EjercicioHerencia {
    public static void main(String[] args) {
        Futbolista f = new Futbolista(1, "Carlos", "Pérez", 25, 10, "Delantera");
        Entrenador e = new Entrenador(2, "Miguel", "López", 45, "FEF-001");
        Masajista m = new Masajista(3, "Ana", "García", 35, "Fisioterapia", 8);

        System.out.println("=== FUTBOLISTA ===");
        f.mostrarInfo();
        System.out.println("\n=== ENTRENADOR ===");
        e.mostrarInfo();
        System.out.println("\n=== MASAJISTA ===");
        m.mostrarInfo();
    }
}

class Personal {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Personal(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre + " se está concentrando");
    }

    public void viajar() {
        System.out.println(nombre + " está viajando");
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
    }
}

class Futbolista extends Personal {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad,
                      int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(nombre + " está jugando un partido");
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Demarcación: " + demarcacion);
    }
}

class Entrenador extends Personal {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad,
                      String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " está dirigiendo el partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo el entrenamiento");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("ID Federación: " + idFederacion);
    }
}

class Masajista extends Personal {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad,
                     String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " está dando un masaje");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Titulación: " + titulacion);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }
}