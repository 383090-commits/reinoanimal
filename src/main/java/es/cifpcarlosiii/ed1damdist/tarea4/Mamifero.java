package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase Mamifero  hereda de Animal
 * Los mamiferos tienen reproduccion vivipara
 */
public class Mamifero extends Animal {

    // Constructor vacio
    public Mamifero() {
    }

    // Constructor con nombre
    public Mamifero(String nombre) {
        super(nombre);
    }

    // sobreescribir reproducir para los mamiferos
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}