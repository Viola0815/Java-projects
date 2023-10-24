import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationShape {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("Shape.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Triangle deserializedTriangle = (Triangle) objectIn.readObject();
            Rectangle deserializedRectangle = (Rectangle) objectIn.readObject();
            Circle deserializedCircle = (Circle) objectIn.readObject();
            Square deserializedSquare = (Square) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            System.out.println("There objects have been deserialized");
            System.out.println("Deserialized Triangle Area: " + deserializedTriangle.calculateArea());
            System.out.println("Deserialized Rectangle Area: " + deserializedRectangle.calculateArea());
            System.out.println("Deserialized Circle Area: " + deserializedCircle.calculateArea());
            System.out.println("Deserialized Square Area: " + deserializedSquare.calculateArea());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
