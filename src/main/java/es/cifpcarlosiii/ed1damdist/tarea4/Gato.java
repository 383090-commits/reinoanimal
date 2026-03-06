package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase Gato hereda de Mamifero
 * El gato maulla + tiene pelos
 */
public class Gato extends Mamifero {

    // Atributo privado para los pelos
    private int pelos;

    // Constructor vacio
    public Gato() {
    }

    // Constructor solo con nombre
    public Gato(String nombre) {
        super(nombre);
    }

    // Constructor con nombre y pelos
    public Gato(String nombre, int pelos) {
        super(nombre);
        this.pelos = pelos;
    }

    // Getter de pelos
    public int getPelos() {
        return pelos;
    }

    // Setter de pelos
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    // El gato duerme mucho
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    // Metodo propio del gato
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }
}