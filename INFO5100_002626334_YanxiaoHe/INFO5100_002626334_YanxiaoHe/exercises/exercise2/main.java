public class main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 2);
        Shape rectangle = new Rectangle(6, 8);
        Shape circle = new Circle(3.14);
        Shape square = new Square(4.2);

        Shape[] shapes = {triangle, rectangle, circle, square};

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
