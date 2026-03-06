package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase Perro  hereda de Mamifero
 * El perro ladra + gruñe
 */
public class Perro extends Mamifero {

    // Constructor vacio
    public Perro() {
    }

    // Constructor con nombre
    public Perro(String nombre) {
        super(nombre);
    }

    // El perro duerme segun el ejercicio
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    // Metodo propio del perro
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    // Otro metodo propio
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }
}
