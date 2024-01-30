public class laptop {
    String brand;
    String color;
    String model;
    String operatingSystem;
    String weight;
    Boolean touchscreen;
    String screenSize;
    Boolean wifiConnection;


public laptop(String brand, String color, String model, String operatingSystem, String weight, boolean touchscreen, String screenSize, boolean wifiConnection) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.touchscreen = touchscreen;
        this.screenSize = screenSize;
        this.wifiConnection = wifiConnection;
        System.out.println("below are some basic information about my laptop:");
    }
public void ShowInfo(){
    System.out.println("my laptop's brand is "+brand);
}
public void showInfo1(){
    System.out.println("my laptop's color is "+color);
}
public void showInfo2(){
    System.out.println("my laptop's model is "+model);
}

}