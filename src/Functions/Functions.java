package Functions;
//

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println(isPrime(13));


    }
    // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    // method 1
    public static int maximumNumber(int x , int y , int z){
        if(x>y && x>z){
            return x;
        }
        else if(y>x && y>z){
            return y;
        }
        else{
            return z;
        }
    }
    // method -2
    public static int maximumNumberMethod2(int x , int y , int z){
        int max = 0;
        if(max < x){
            max = x;
        }
        if(max < y){
            max = y ;

        }
        if(max <z ){
            max = z;
        }
        return max;
    }

    // Define a program to find out whether a given number is even or odd.
    public static boolean isEven(int number){
        boolean check = false;
        if(number%2 == 0){
            check = true;
        }
        return check;
    }

    //A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    public static void isEligible(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("Yeh!! You are eligible for voting ");
        }
        else{
            System.out.println("Oh! You are not eligible for voting !!");
        }
    }
    //Write a program to print the sum of two numbers entered by user by defining your own method.
    public static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your first number :  ");
        int first = input.nextInt();
        System.out.print("Please enter your second number : ");
        int second = input.nextInt();
        return first+ second;
    }

    //Define a method that returns the product of two numbers entered by user.
    public static int product(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your first number :  ");
        int first = input.nextInt();
        System.out.print("Please enter your second number : ");
        int second = input.nextInt();
        return first*second;
    }

    //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public static void AreaOfCircle(int radius){
        float circumference = (float) (2 * 3.14 * radius) ;
        float area = (float) (3.14*radius*radius);
        System.out.println("Circumference : " + circumference);
        System.out.println("Area : " + area);
    }

    // Define a method to find out if a number is prime or not.
    public static boolean isPrime(int number ){
        boolean check = true;
        for (int i = 2; i*i < number ; i++) {
            if(number%i == 0){
                check = false;
                break;
            }
        }
        return check;
    }

    //Write a program that will ask the user to enter his/her marks (out of 100).
    // Define a method that will display grades according to the marks entered as below:
    public static void grade(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number out of 100 ");
        int number = input.nextInt();
        if(number >=91 && number<=100){
            System.out.println("Grade - AA");
        }
        else if (number>=81 && number<=90){
            System.out.println("Grade - AB");
        }
        else if (number>=71 && number<=80){
            System.out.println("Grade - BB");
        }
        else if (number>=61 && number<=70){
            System.out.println("Grade - BC");
        }
        else if (number>=51 && number<=60){
            System.out.println("Grade - CD");
        }
        else if (number>=41 && number<=50){
            System.out.println("Grade - DD");
        }
        else{
            System.out.println("Fail!!");
        }
    }

    // Write a program to print the factorial of a number by defining a method named 'Factorial'
    // factorial using recursion
    public static int Factorial(int number ){
        if(number == 1){
            return 1;
        }
        return number * Factorial(number - 1);
    }

    // Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static boolean isPalindrome (int number ){
        int realNumber = number;
        int demo = 0;
        while(number >0){
            int rem = number%10;
            demo = demo*10 + rem;
            number /=10;
        }
        if(realNumber == demo){
            return true;
        }
        else{
            return false;
        }
    }
    // Write a function that returns all prime numbers between two given numbers.

}
