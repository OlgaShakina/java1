package src;

public class Park {
    private String name;
    private Attraction[] attractions;
    private int attractionCount;

    public Park(String name, int capacity) {
        this.name = name;
        this.attractions = new Attraction[capacity];
        this.attractionCount = 0;
    }

    public void addAttraction(String name, String operatingHours, int price) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount] = new Attraction(name, operatingHours, price);
            attractionCount++;
        } else {
            System.out.println("Нет места для добавления аттракциона.");
        }
    }

    public void showAttractions() {
        System.out.println("Аттракционы в парке " + name + ":");
        for (int i = 0; i < attractionCount; i++) {
            System.out.println(attractions[i]);
        }
    }

    private class Attraction {
        private String name;
        private String operatingHours;
        private int price;

        public Attraction(String name, String operatingHours, int price) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + operatingHours + ", Стоимость: " + price + " руб.";
        }
    }

    public static void main(String[] args) {
        Park amusementPark = new Park("Парк Сказка", 5);

        amusementPark.addAttraction("Американские горки", "10:00 - 22:00", 450);
        amusementPark.addAttraction("Колесо обозрения", "10:00 - 23:00", 450);
        amusementPark.addAttraction("Поездка на паровозике", "9:00 - 20:00", 250);
        amusementPark.addAttraction("Лабиринт", "10:00 - 21:00", 250);
        amusementPark.addAttraction("Самолетики", "9:00 - 19:00", 350);

        amusementPark.showAttractions();
    }
}