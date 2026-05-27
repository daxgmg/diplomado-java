public class Animal {
    public static void main(String[] args) {
        AnimalClase obj = new AnimalClase();
        obj.setNombre("León");
        obj.setOrden("Carnívora");
        obj.setExtremidades(4);

        System.out.println("Nombre: " + obj.getNombre());
        System.out.println("Orden: " + obj.getOrden());
        System.out.println("Extremidades: " + obj.getExtremidades());
    }
}

class AnimalClase {
    private String nombre;
    private String orden;
    private int extremidades;

    public String getNombre() { return nombre; }
    public String getOrden() { return orden; }
    public int getExtremidades() { return extremidades; }

    public void setNombre(String pNombre) { nombre = pNombre; }
    public void setOrden(String pOrden) { orden = pOrden; }
    public void setExtremidades(int pExtremidades) { extremidades = pExtremidades; }
}