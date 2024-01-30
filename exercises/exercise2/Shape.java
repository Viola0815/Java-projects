public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void printInfo(){
        System.out.println("Shape Information:");
    }
}
class Triangle extends Shape {
    public double height;
    public double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return  height * base *0.5;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * base;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This Triangle 's base = " + base + ", Height = " + height);

    }
}


class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void displayInfo() {
        super.printInfo();
        System.out.println("This Rectangle's Length = " + length + ", Width = " + width);
    }
}


class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This circle's radius = " + radius);
    }
}


class Square extends Shape {
    public double sideLength;
    public Square(double sideLength) {
        this.sideLength=sideLength;
    }
@Override
    public double calculateArea() {
        return sideLength*sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength*4;
    }
    @Override
    public void displayInfo() {
        super.printInfo();
        System.out.println("This square's side Length = " + sideLength);
    }
}