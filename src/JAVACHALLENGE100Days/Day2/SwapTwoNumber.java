package JAVACHALLENGE100Days.Day2;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 10 ;
        // swap two number without using any third variables
        // it is done by arithmetic operator .
        System.out.printf("before swaping a = %d and b = %d\n" , a , b);
        a = a +b ;
        b = a - b;
        a = a - b;
        System.out.printf("After swapping a = %d and b = %d", a,b);

    }
}
