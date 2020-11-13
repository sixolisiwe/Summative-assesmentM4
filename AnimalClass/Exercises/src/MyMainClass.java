class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: oink oink");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: woof woof");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}