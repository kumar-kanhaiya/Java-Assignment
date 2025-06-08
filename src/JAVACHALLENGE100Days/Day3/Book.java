package JAVACHALLENGE100Days.Day3;

public class Book {
    String title ;
    String author;
    float price;

    public Book(String title , String author , float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics" , "John" , 985.56f);
        Book b2 = new Book("Basic of C", "Racket" , 1250.00f);
        Book b3 = new Book("Java DSA " , "krishna" , 2500.00f);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
