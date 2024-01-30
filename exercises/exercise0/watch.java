public class watch {
    String brand;
    String color;
    String price;
    String weight;
    String shape;
    String dimensions;
    boolean luxury;
    boolean waterProof;
    
public watch(String brand, String color, String price, String weight, String shape, String dimensions,
            boolean luxury, boolean waterProof) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.dimensions = dimensions;
        this.luxury = luxury;
        this.waterProof = waterProof;
        System.out.println("below are some basic information about my watch:");
    }
public void showinfo(){
    System.out.println("my watch's brand is "+brand);
}
public void showinfo1(){
    System.out.println("my watch's color "+color);
}
public void showinfo2(){
    System.out.println("my watch's price is "+price);
}

}
