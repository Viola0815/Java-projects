public class book {
    String nameOfBook;
    String pageNumbers;
    String publicationDate;
    String language;
    String price;
    String category;
    String author;
    boolean eBookLink;
    public book(String nameOfBook, String pageNumbers, String publicationDate, String language, String price,
            String category, String author, boolean eBookLink) {
        this.nameOfBook = nameOfBook;
        this.pageNumbers = pageNumbers;
        this.publicationDate = publicationDate;
        this.language = language;
        this.price = price;
        this.category = category;
        this.author = author;
        this.eBookLink = eBookLink;
        System.out.println("below are some basic information about book:");
    }
public void showinfo(){
    System.out.println("book's name is "+nameOfBook);  
}
public void showinfo1(){
    System.out.println("book's page number is "+pageNumbers);  
}
public void showinfo2(){
    System.out.println("boos's language is "+language);  
}
}
