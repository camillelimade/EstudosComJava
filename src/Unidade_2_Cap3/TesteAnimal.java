package Unidade_2_Cap3;

import java.util.ArrayList;

public class TesteAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Gato("Nina", 12, "Viralata", "Tricolor"));
        animals.add(new Gato("Fumaça", 4, "Gato Russo", "Cinza"));
        animals.add(new Cachorro("Sandy", 7, "Pincher", "Preto"));
        animals.add(new Cachorro("Tiana", 10, "Viralata", "Caramelo"));
        for (Animal animal : animals) {
            animal.fazerSom();
        }

    }
}
