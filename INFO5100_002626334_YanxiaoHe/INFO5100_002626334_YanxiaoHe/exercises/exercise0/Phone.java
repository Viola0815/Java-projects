public class Phone {
    //properties
        String brand;
        String color;
        int price;
        String size;
        String model;
        String operatingSystem;
        int StorageCapacity;
        int IDNum;

      
    //constructor
        public Phone(String brand, String color, int price, String size, String model, String operatingSystem,int StorageCapacity, int IDNum) {
            this.brand = brand;
            this.color = color;
            this.price = price;
            this.size = size;
            this.model = model;
            this.operatingSystem = operatingSystem;
            this.StorageCapacity=StorageCapacity;
            this.IDNum = IDNum;
            System.out.println("below are some basic information about my phone:");
        
        
        }
    //three methods
        public void ShowInfo(){
            System.out.println("my phone's brand is"+" "+brand);
        }

        public void showInfo1(){
            System.out.println("the price is"+" "+price);
        }
        public void showInfo2(){
            System.out.println("and it is"+" "+color);
        }
       
    //two nested class
        public static class SIMcardSlots{
            boolean eSIM;
            boolean physicalSIM;

            public SIMcardSlots(boolean eSIM, boolean physicalSIM ){
                String answer="";
                if(eSIM==true){
                    answer=" ";
                }else if(eSIM==false){
                    answer="not";
                }
    
               System.out.println("it is"+" "+answer+" "+"eSIM accepted");
            }

        }

        public static class Accessories{
            boolean charger;
            
        
        public Accessories(boolean charger){
            String answer="";
                if(charger==true){
                    answer=" ";
                }else if(charger==false){
                    answer=" "+"does not"+" ";
                }
                System.out.println("it"+answer+"come with charger");
           
        }
    }
}