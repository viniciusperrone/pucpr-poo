public class Rectangle {
    float height;
    float width;

    float calculatePerimeter() {
        float perimeter;

        perimeter = 2 * height + 2 * width;

        return perimeter;
    }

    void printData() {
        float perimeter;

        perimeter = calculatePerimeter();

        System.out.println("Retângulo: ");
        System.out.println("- Altura: " + height);
        System.out.println("- Largura: " + width);
        System.out.println("- Perímetro: " + perimeter);

    }

    public static void main(String [] args) {
        System.out.println("Mundo dos retângulos");

        Rectangle rectangle1;

        rectangle1 = new Rectangle();

        rectangle1.height = 10;
        rectangle1.width = 20;

        rectangle1.printData();
    }
}
