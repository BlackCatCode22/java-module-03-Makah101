package myanimals;

public class Animal {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;

        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCatCount()); //could also call from myCat.getCatCount but this is discouraged because it is global and not individual.

        Dog myDog = new Dog();
        myDog.name = "Spot";

        Dog myDog2 = new Dog();
        myDog2.name = "Rex";

        myDog2.bark();
        myDog.bark();

        int numOfAnimals = Cat.getCatCount() + Dog.getDogCount();
        System.out.println("there are " + numOfAnimals + " animals.");

    }

}

// if var is class level or shared level it should be static