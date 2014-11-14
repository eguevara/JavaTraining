package com.eguevara.sandbox;

/**
 * Created by erickguevara on 10/23/14.
 */
public class EnumTest {

    private enum Animal {
        DOG("V"), CAT("Tom"), BIRD("Tweety");

        private String name;

        public String getName() {
            return name;
        }
        Animal(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Animal animal = Animal.CAT;

        switch (animal) {

            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case BIRD:
                System.out.println("BIRD");
                break;
        }

        System.out.println(Animal.DOG.name());
        System.out.println(Animal.valueOf(Animal.DOG.name()));
        System.out.println(Animal.valueOf("DOG"));

        Animal a2 = Animal.valueOf("DOG");
        System.out.println(a2);

        System.out.println(Animal.DOG.getName());

    }
}
