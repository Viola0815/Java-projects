public class beverage {
    String name;
    String temperature;
    String price;
    boolean sugarContent;
    String flavor;
    String calorie;
    int ml;
    boolean caffeineContent;
    
    public beverage(String name, String temperature, String price, boolean sugarContent, String flavor, String calorie,
            int ml, boolean caffeineContent) {
        this.name = name;
        this.temperature = temperature;
        this.price = price;
        this.sugarContent = sugarContent;
        this.flavor = flavor;
        this.calorie = calorie;
        this.ml = ml;
        this.caffeineContent = caffeineContent;
        System.out.println("below are some basic information about my beverage:");
    }
public void showinfo(){
    System.out.println("my beverage's name is "+name);
}
public void showinfo1(){
    System.out.println("my beverage's is "+temperature);
}
public void showinfo2(){
    System.out.println("my beverage's calorie is "+calorie);
}
}
