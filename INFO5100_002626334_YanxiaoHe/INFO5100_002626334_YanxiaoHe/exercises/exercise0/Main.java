public class Main {
    public static void main(String[] args) {
        Phone myphone= new Phone("Apple", "blue", 1000, "6.1", "iphone12", "IOS", 256, 000001);
        myphone.ShowInfo();
        myphone.showInfo1();
        myphone.showInfo2();
        Phone myphone1= new Phone("Apple", "black", 900, "6.1", "iphone13", "IOS", 256, 000002);
        myphone1.ShowInfo();
        myphone1.showInfo1();
        myphone1.showInfo2();
        Phone myphone2= new Phone("Apple", "white", 900, "6.1", "iphone13", "IOS", 256, 000003);
        myphone2.ShowInfo();
        myphone2.showInfo1();
        myphone2.showInfo2();
        Phone.SIMcardSlots simSlots = new Phone.SIMcardSlots(false, true);
        Phone.Accessories accessories= new Phone.Accessories(true);
        System.out.println("------------------------");

        laptop myLaptop= new laptop("Apple", "sliver", "MacBook Air", "macOS", "2.8lbs", false,"13 inches", true);
        myLaptop.ShowInfo();
        myLaptop.showInfo1();
        myLaptop.showInfo2();
        laptop myLaptop1= new laptop("Apple", "sliver", "MacBook Pro", "macOS", "3lbs", false,"13 inches", true);
        myLaptop1.ShowInfo();
        myLaptop1.showInfo1();
        myLaptop1.showInfo2();
        laptop myLaptop2= new laptop("Apple", "pink", "MacBook Pro", "macOS", "3lbs", false,"13 inches", true);
        myLaptop2.ShowInfo();
        myLaptop2.showInfo1();
        myLaptop2.showInfo2();
        System.out.println("------------------------");
       
        backpack myBackpack= new backpack("Nike", "white", "150", "Canvas", "2lbs", "Adjustable Straps", false, "male");
        myBackpack.ShowInfo();
        myBackpack.showInfo1();
        myBackpack.showInfo2();
        backpack myBackpack1= new backpack("Adidas", "black", "100", "Canvas", "1.5lbs", "Adjustable Straps", false, "male");
        myBackpack1.ShowInfo();
        myBackpack1.showInfo1();
        myBackpack1.showInfo2();
        backpack myBackpack2= new backpack("Nike", "white", "129", "Nylon", "1.2lbs", "Adjustable Straps", true, "female");
        myBackpack.ShowInfo();
        myBackpack.showInfo1();
        myBackpack.showInfo2();
        System.out.println("------------------------");

        beverage myBeverage=new beverage("coke", "iced", "2", true, "origin", "300", 500, true);
        myBeverage.showinfo();
        myBeverage.showinfo1();
        myBeverage.showinfo2();

        beverage myBeverage1=new beverage("tea", "hot", "2", false, "origin", "0", 600, true);
        myBeverage1.showinfo();
        myBeverage1.showinfo1();
        myBeverage1.showinfo2();

        beverage myBeverage2=new beverage("orange juice", "iced", "5", true, "orange", "200", 600, false);
        myBeverage2.showinfo();
        myBeverage2.showinfo1();
        myBeverage2.showinfo2();
        System.out.println("------------------------");

        watch myWatch=new watch("apple", "white", "500", "0.5lb", "square", "41mm", false, true);
        myWatch.showinfo();
        myWatch.showinfo1();
        myWatch.showinfo2();

        watch myWatch1=new watch("Rolex", "sliver", "20000", "0.8lb", "square", "45mm", true, true);
        myWatch1.showinfo();
        myWatch1.showinfo1();
        myWatch1.showinfo2();

        watch myWatch2=new watch("apple", "blk", "200", "0.5lb", "square", "45mm", false, true);
        myWatch2.showinfo();
        myWatch2.showinfo1();
        myWatch2.showinfo2();
        System.out.println("------------------------");

        notebook myNotebook= new notebook(200, "pink", "5.00", true, false, "0.3lb", false, false);
        myNotebook.showinfo();
        myNotebook.showinfo1();
        myNotebook.showinfo2();
        notebook myNotebook1= new notebook(100, "red", "3.00", true, false, "0.2lb", false, false);
        myNotebook1.showinfo();
        myNotebook1.showinfo1();
        myNotebook1.showinfo2();
        notebook myNotebook2= new notebook(200, "pink", "5.00", false, true, "0.3lb", true, true);
        myNotebook2.showinfo();
        myNotebook2.showinfo1();
        myNotebook2.showinfo2();
        System.out.println("------------------------");

        lunchbox myLunchbox= new lunchbox("white", "large", "20", true, true, "high", true, true);
        myLunchbox.showinfo();
        myLunchbox.showinfo1();
        myLunchbox.showinfo2();
        lunchbox myLunchbox1= new lunchbox("white", "large", "22", true, true, "high", true, true);
        myLunchbox1.showinfo();
        myLunchbox1.showinfo1();
        myLunchbox1.showinfo2();
        lunchbox myLunchbox2= new lunchbox("white", "medium", "15", true, true, "high", true, true);
        myLunchbox2.showinfo();
        myLunchbox2.showinfo1();
        myLunchbox2.showinfo2();
        System.out.println("------------------------");

        Student student= new Student("Viola", "F", 23, 00000001, "100", "swimming", "CHN", "1100 1st");
        student.showinfo();
        student.showinfo1();
        student.showinfo2();
        Student student1=new Student("Amy", "F", 20, 00000002, "90", "tennis", "USA", "1100 2st");
        student1.showinfo();
        student1.showinfo1();
        student1.showinfo2();
        Student student2=new Student("Jack", "M", 25, 00000003, "80", "basketball", "USA", "1100 3st");
        student2.showinfo();
        student2.showinfo1();
        student2.showinfo2();
        System.out.println("------------------------");

        book book=new book("Learning Java", "200", "01/01/2013", "English", "50", "educational", "Java Professor", true);
        book.showinfo();
        book.showinfo1();
        book.showinfo2();
        book book1=new book("Learning html", "200", "02/01/2013", "English", "45", "educational", "html Professor", true);
        book1.showinfo();
        book1.showinfo1();
        book1.showinfo2();
        book book2=new book("Learning Python", "250", "02/01/2013", "English", "45", "educational", "html Professor", true);
        book2.showinfo();
        book2.showinfo1();
        book2.showinfo2();
        System.out.println("------------------------");

        classroom classroom=new classroom("901", "50", "lecture type", "9 floor", true, "Mon,Tues,Fri", true, true);
        classroom.showinfo();
        classroom.showinfo1();
        classroom.showinfo2();
        classroom classroom1=new classroom("902", "50", "lab type", "9 floor", true, "Mon,Tues,Fri", true, true);
        classroom1.showinfo();
        classroom1.showinfo1();
        classroom1.showinfo2();
        classroom classroom2=new classroom("805", "50", "lecture type", "8 floor", true, "Mon,Tues,Fri", true, true);
        classroom2.showinfo();
        classroom2.showinfo1();
        classroom2.showinfo2();
    }   

}
