package JAVACHALLENGE100Days.Day4;

public class Movie {
    String title;
    float rating ;
    int year ;
    public Movie(String title , float rating , int year ){
        this.title = title;
        this.rating = rating;
        this.year = year;

    }
    public int getYear(){
        return year;
    }
    public static void main(String[] args) {
        Movie first = new Movie("Inception " , 8.8f , 2010);
        int year = first.getYear();
        if(2025 - year > 10){
            System.out.println("Older than 10 year ");
        }
        else{
            System.out.println("Not older than 10 year ");
        }
    }
}
