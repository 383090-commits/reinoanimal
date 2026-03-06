package es.cifpcarlosiii.ed1damdist.tarea4;

public class Principal {

    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/

        Animal animal = new Animal("Gallopedro");

        Mamifero mamifero = new Mamifero("Ballena");

        Perro pompon = new Perro("Pompon");

        Gato nube = new Gato("Nube", 4);

        animal = nube;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = pompon;
        array[3] = nube;

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

        // Ejemplos de uso de toString() heredado
        System.out.println("Nombre del perro: " + pompon.toString());
        System.out.println("Nombre del gato: " + nube.toString());
        System.out.println("Nombre del mamífero: " + mamifero.toString());
        System.out.println("Nombre del animal: " + animal.getNombre());
    }
}
