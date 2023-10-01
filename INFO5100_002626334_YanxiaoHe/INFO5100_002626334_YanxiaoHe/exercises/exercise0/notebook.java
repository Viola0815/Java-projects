public class notebook {
int numberOfPages;
String color;
String price;
boolean designOnTheFirstPage;
boolean bookmarkContent;
String weight;
boolean pageNumberOnpage;
boolean penHolder;

public notebook(int numberOfPages, String color, String price, boolean designOnTheFirstPage, boolean bookmarkContent,
        String weight, boolean pageNumberOnpage,boolean penHolder) {
    this.numberOfPages = numberOfPages;
    this.color = color;
    this.price = price;
    this.designOnTheFirstPage = designOnTheFirstPage;
    this.bookmarkContent = bookmarkContent;
    this.weight = weight;
    this.pageNumberOnpage = pageNumberOnpage;
    this.penHolder = penHolder;
    System.out.println("below are some basic information about my notebook:");
}
public void showinfo(){
    System.out.println("my notebook has "+numberOfPages+" pages");
}
public void showinfo1(){
    System.out.println("my notebook is "+color);
}
public void showinfo2(){
    System.out.println("my note's weight is "+weight);
}

}
