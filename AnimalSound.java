public class AnimalSound {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for (Animal animal : animals){
            animal.makeSound();
        }

    }

}

abstract class Animal{
    public void makeSound(){
        System.out.println("This animal makes sound!");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog: Barks");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow");
    }
}

class Cow extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cow: Moo");
    }
}
