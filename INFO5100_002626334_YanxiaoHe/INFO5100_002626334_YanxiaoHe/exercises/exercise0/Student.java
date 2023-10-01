public class Student {
   String name;
   String gender;
   int age;
   int id;
   String grade;
   String hobby;
   String nationality;
   String address;
public Student(String name, String gender, int age, int id, String grade, String hobby, String nationality,
        String address) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.id = id;
    this.grade = grade;
    this.hobby = hobby;
    this.nationality = nationality;
    this.address = address;
    System.out.println("below are some basic information about student:");
}
public void showinfo(){
    System.out.println("student's name is "+name);  
}
public void showinfo1(){
    System.out.println("student's age is "+age);  
}
public void showinfo2(){
    System.out.println("student's gender is "+gender);  
}
}
