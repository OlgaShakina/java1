package src;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        countDog++;
    }
    private static int countDog = 0;


    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не умеет плавать больше 10 м.");
        }
    }
    public static int getCountDog() {
        return countDog;
    }
}