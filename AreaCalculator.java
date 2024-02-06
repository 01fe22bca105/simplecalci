import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Square");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = Scanner.nextInt();

        switch (choice) {
            case 1:
                calculateTriangleArea();
                break;
            case 2:
                calculateRectangleArea();
                break;
            case 3:
                calculateCircleArea();
                break;
            case 4:
                calculateSquareArea();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void calculateTriangleArea() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter base length of the triangle: ");
        double base = Scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = Scanner.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }

    public static void calculateRectangleArea() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = Scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = Scanner.nextDouble();

        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculateCircleArea() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = Scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public static void calculateSquareArea() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter side length of the square: ");
        double side = Scanner.nextDouble();

        double area = side * side;
        System.out.println("Area of the square: " + area);
    }
}