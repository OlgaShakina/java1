package src;

public class Cat extends Animal {
    private boolean fullness;
    private static int countCat = 0;
    private static int foodInBowl = 0;

    public Cat(String name) {
        super(name);
        fullness = false;
        countCat++;
    }

    public static void addFoodInBowl(int quantity) {
        foodInBowl += quantity;
        System.out.println("Добавлено " + quantity + " еды в миску. Теперь в миске: " + foodInBowl);
    }

    public void eat(int quantity) {
        if (quantity <= foodInBowl) {
            foodInBowl -= quantity;
            fullness = true;
            System.out.println(name + " поел(а) " + quantity + " еды. Теперь в миске: " + foodInBowl);
        } else {
            System.out.println(name + " не может поесть, в миске недостаточно еды.");
        }
    }

    public void infoFullness() {
        if (fullness) {
            System.out.println(name + " сыт(а).");
        } else {
            System.out.println(name + " голоден(а).");
        }
    }

    public static int getCountCat() {
        return countCat;
    }

    public static int getFoodInBowl() {
        return foodInBowl;
    }
}
