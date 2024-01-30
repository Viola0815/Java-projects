import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationShape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0, 4.0);
        Rectangle rectangle = new Rectangle(6.0, 7.0);
        Circle circle = new Circle(3.0);
        Square square = new Square(4.0);

        try {
            FileOutputStream fileout= new FileOutputStream("Shape.ser");
            ObjectOutputStream objectout= new ObjectOutputStream(fileout);
            objectout.writeObject(triangle);
            objectout.writeObject(rectangle);
            objectout.writeObject(circle);
            objectout.writeObject(square);
            objectout.close();
            fileout.close();
            System.out.println("These objects have been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
