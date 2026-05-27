
public class Ejemplo1Herencia {
    public static void main(String[] args){
        Alumno al = new Alumno(
                "Luis", "Erazo", 20, "Masculino", "Caluco", "911", "Grupo 1", "DS");

        Profesor pr = new Profesor(
                "Gerber", "González", 30, "Masculino", "Sonzacate", "913", 800,
                "00000000-1", "0000-000000-000-1", "Desarrollo de software");

        //imprimir en la consola los datos del objeto al
        System.out.println("/***************ALUMNO***************\\");
        al.mostrarInfAlumno();

        //imprimir en la consola los datos del objeto pr
        System.out.println("");
        System.out.println("/***************PROFESOR***************\\");
        pr.mostrarInfProfesor();
    }
}

class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String genero;
    protected String direccion;
    protected String telefono;

    public Persona(){}

    public Persona(String pNombre, String pApellido, int pEdad, String pGenero,
                   String pDireccion, String pTelefono){
        nombre = pNombre;
        apellido = pApellido;
        edad = pEdad;
        genero = pGenero;
        direccion = pDireccion;
        telefono = pTelefono;
    }

    public String saludoPersona(){
        return "Este texto viene desde la clase Persona";
    }
}

class Alumno extends Persona {
    private String seccion;
    private String carrera;

    public Alumno(){}

    public Alumno(String pNombre, String pApellido, int pEdad, String pGenero,
                  String pDireccion, String pTelefono, String pSeccion,
                  String pCarrera){
        super(pNombre, pApellido, pEdad, pGenero, pDireccion, pTelefono);
        seccion = pSeccion;
        carrera = pCarrera;
    }

    public String saludoAlumno(){
        return "Este texto viene desde la clase Alumno";
    }

    public void mostrarInfAlumno(){
        System.out.println("Nombre del Alumno: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Sección: " + seccion);
        System.out.println("Carrera: " + carrera);
    }
}

class Profesor extends Persona {
    private double sueldo;
    private String dui;
    private String nit;
    private String especialidad;

    public Profesor(){}

    public Profesor(String pNombre, String pApellido, int pEdad, String pGenero,
                    String pDireccion, String pTelefono, double pSueldo, String pDui,
                    String pNit, String pEspecialidad){
        super(pNombre, pApellido, pEdad, pGenero, pDireccion, pTelefono);
        sueldo = pSueldo;
        dui = pDui;
        nit = pNit;
        especialidad = pEspecialidad;
    }

    public String saludoProfesor(){
        return "Este texto viene desde la clase Profesor";
    }

    public void mostrarInfProfesor(){
        System.out.println("Nombre del Alumno: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("DUI: " + dui);
        System.out.println("NIT: " + nit);
        System.out.println("Especialidad: " + especialidad);
    }
}