public class Ejemplo1Abstraccion {

    public static void main(String[] args) {
        //una clase abstracta no se puede instanciar
        //SerVivo ser = new SerVivo
        PersonaAbstracta per = new PersonaAbstracta();
        System.out.println(per.alimentarse("adulto"));
        System.out.println(per.reporducirse("adulto"));
        System.out.println(per.envejecer(""));
        System.out.println(per.morir("adulto"));
    }
}

abstract class SerVivo {
    public abstract String alimentarse(String pSer);
    public abstract String reporducirse(String pSer);
    public abstract int envejecer(String pSer);
    public abstract String morir(String pSer);
}

class PersonaAbstracta extends SerVivo {

    @Override
    public String alimentarse(String pSer) {
        return pSer + " ingiere alimentos";
    }

    @Override
    public String reporducirse(String pSer) {
        return pSer + " se reproduce en forma sexual";
    }

    @Override
    public int envejecer(String pSer) {
        return 60;
    }

    @Override
    public String morir(String pSer) {
        return pSer + " muere de multiples formas";
    }
}