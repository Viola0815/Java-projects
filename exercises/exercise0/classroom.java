public class classroom {
    String roomNumber;
    String roomCapacity;
    String roomType;
    String location;
    Boolean windows;
    String availabilityTime;
    Boolean whiteboard;
    Boolean emergencyExit;
    public classroom(String roomNumber, String roomCapacity, String roomType, String location, Boolean windows,
            String availabilityTime, Boolean whiteboard, Boolean emergencyExit) {
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.roomType = roomType;
        this.location = location;
        this.windows = windows;
        this.availabilityTime = availabilityTime;
        this.whiteboard = whiteboard;
        this.emergencyExit = emergencyExit;
        System.out.println("below are some basic information about classroom:");
    }
public void showinfo(){
    System.out.println("class room's room number is "+roomNumber);  
}
public void showinfo1(){
    System.out.println("it is a "+roomType+" of room");  
}
public void showinfo2(){
    System.out.println("located at "+location);  
}
}
