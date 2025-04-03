
class Animal {

    String soundOfAnimal() {
        return "Animal {}: Generalize Of animal sound";
    }
}

class Dog extends Animal {

    @Override
    String soundOfAnimal() {
        return "Dog {}: Dog bark sound";
    }
}

class Cat extends Animal {

    @Override
    String soundOfAnimal() {
        return "Cat {}: Cat meow sound";
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        System.out.println("Start code:");
        System.out.println(a1.soundOfAnimal());

        Animal a2 = new Dog();
        System.out.println("a2.soundOfAnimal() = " + a2.soundOfAnimal());

        Animal a3 = new Cat();

        System.out.println("a3.soundOfAnimal() = " + a3.soundOfAnimal());

    }
}
