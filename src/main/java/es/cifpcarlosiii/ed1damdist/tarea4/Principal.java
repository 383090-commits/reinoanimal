package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase Principal - aqui esta el main
 * creo los objetos y se prueban
 */
public class Principal {

    // Metodo main - punto de entrada
    public static void main(String[] args) {

        // Crear los objetos con nombres
        Animal animal = new Animal("Gallopedro");
        Mamifero mamifero = new Mamifero("Ballena");
        Perro pompon = new Perro("Pompon");
        Gato nube = new Gato("Nube", 4);

        // Pruebo de polimorfismo
        animal = nube;
        Gato g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        // Array de animales
        Animal array[] = new Animal[4];
        array[0] = animal;
        array[1] = mamifero;
        array[2] = pompon;
        array[3] = nube;

        // Recorrer el array
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");
                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");
                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

        // pruebo el toString
        System.out.println("Nombre del perro: " + pompon.toString());
        System.out.println("Nombre del gato: " + nube.toString());
        System.out.println("Nombre del mamifero: " + mamifero.toString());
        System.out.println("Nombre del animal: " + animal.getNombre());
    }
}
