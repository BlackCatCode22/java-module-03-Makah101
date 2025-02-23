package myanimals;

public class Cat {
    public static final int MAX_LIVES = 9;

    //var for keeping track of cats created.
    private static int catCount = 0;

    //cat data for Cat instances
    String name;
    int age;
    int livesRemaining;

    public void meow() {
        System.out.println("Meow");
    }

    //increments catCount when new cat is created.
    public Cat(){
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    //method for asking for the cat count var.
    public static int getCatCount() {
        return catCount;
    }
}
