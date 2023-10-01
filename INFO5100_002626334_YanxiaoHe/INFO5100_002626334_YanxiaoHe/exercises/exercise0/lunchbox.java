public class lunchbox {
   String color;
   String capacity;
   String price;
   boolean MicrowaveSafe;
   boolean dishwasherSafe;
   String sealingPerformanceLevel;
   boolean freezerSafe;
   boolean reusable;
public lunchbox(String color, String capacity, String price, boolean microwaveSafe, boolean dishwasherSafe,
        String sealingPerformanceLevel, boolean freezerSafe, boolean reusable) {
    this.color = color;
    this.capacity = capacity;
    this.price = price;
    MicrowaveSafe = microwaveSafe;
    this.dishwasherSafe = dishwasherSafe;
    this.sealingPerformanceLevel = sealingPerformanceLevel;
    this.freezerSafe = freezerSafe;
    this.reusable = reusable;
    System.out.println("below are some basic information about my lunchbox:");
} 
public void showinfo(){
    System.out.println("my lunchbox's capacity is "+capacity);
}
public void showinfo1(){
    System.out.println("my lunchbox's color "+color);
}
public void showinfo2(){
    System.out.println("my lunchbox's price is "+price);
}
}
