public class backpack {
    String brand;
    String color;
    String price;
    String material;
    String weight;
    String strapType;
    boolean waterProof;
    String genderSuitability;
    
    public backpack(String brand, String color, String price, String material, String weight, String strapType,
            boolean waterProof, String genderSuitability) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.weight = weight;
        this.strapType = strapType;
        this.waterProof = waterProof;
        this.genderSuitability = genderSuitability;
        System.out.println("below are some basic information about my backpack:");
    }
public void ShowInfo(){
    System.out.println("my backpack's brand is "+brand);
}
public void showInfo1(){
    System.out.println("my backpack's color is "+color);
}
public void showInfo2(){
    System.out.println("my backpack's price is "+price);
}

}
