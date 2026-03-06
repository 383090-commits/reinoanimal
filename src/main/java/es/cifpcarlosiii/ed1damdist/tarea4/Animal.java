package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase Animal - es la clase padre de todos los animales
 */
public class Animal {

    // Atributo pvt para nombre
    private String nombre;

    // Constructor vacio
    public Animal() {
    }

    // Constructor con nombre
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos de animal
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    // toString que devuelve el nombre
    @Override
    public String toString() {
        return this.nombre;
    }
}