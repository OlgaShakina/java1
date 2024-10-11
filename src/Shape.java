package src;

interface Shape {
    double calculateArea();
    double calculatePerimeter();

    String getFillColor();
    String getBorderColor();

    default String getPerimeterDescription() {
        return "Периметр: " + calculatePerimeter();
    }
}
