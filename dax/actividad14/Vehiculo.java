public class Vehiculo {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        Barco barco = new Barco();
        Avion avion = new Avion();

        auto.desplazarse();
        barco.desplazarse();
        avion.desplazarse();
    }
}

class VehiculoBase {
    String nombre;
    int velocidad;

    public void desplazarse() {
        System.out.println("El vehículo se desplaza");
    }
}

class Automovil extends VehiculoBase {
    @Override
    public void desplazarse() {
        System.out.println("El automóvil se desplaza por la carretera");
    }
}

class Barco extends VehiculoBase {
    @Override
    public void desplazarse() {
        System.out.println("El barco se desplaza por el agua");
    }
}

class Avion extends VehiculoBase {
    @Override
    public void desplazarse() {
        System.out.println("El avión se desplaza por el aire");
    }
}