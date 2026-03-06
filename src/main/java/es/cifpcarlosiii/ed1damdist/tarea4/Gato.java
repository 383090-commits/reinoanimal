package es.cifpcarlosiii.ed1damdist.tarea4;

public class Gato extends Mamifero {

    private int pelos;


    public Gato() {
    }

    public Gato(String nombre) {
        super(nombre);
    }

    public Gato(String nombre, int pelos) {
        super(nombre);
        this.pelos = pelos;
    }

    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

    public int getPelos() {
        return pelos;
    }

    public void setPelos(int pelos) {
        this.pelos = pelos;
    }
}
