package src;

public class Main_1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Маруся");

        dog1.run(150);
        dog1.swim(5);

        cat1.run(100);
        cat1.swim(0);
        cat2.run(250);

        Cat.addFoodInBowl(20);


        cat1.eat(10);
        cat2.eat(15);
        cat1.eat(15);

        cat1.infoFullness();
        cat2.infoFullness();

        System.out.println("Общее количество животных: " + Animal.getCountAnimal());
        System.out.println("Общее количество котов: " + Cat.getCountCat());
        System.out.println("Общее количество собак: " + Dog.getCountDog());


        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println(shape.getPerimeterDescription());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границ: " + shape.getBorderColor());
        System.out.println();
    }
}

