package Conditional_Loops;

import java.util.Scanner;

public class conditionalAndLoops {

    public static void main(String[] args) {
        AreaOfCircle(5);
        System.out.println();
        System.out.println(fibonacciSeriesUsingRecursion(10));
        System.out.println("\n" + SubtractProductAndSum(234));

    }
    // function for finding Area of a circle
    public static void AreaOfCircle(int radius){
        float area = (float)(3.14 * radius * radius );
        System.out.printf("Area of a Circle is %.2f" , area);
    }
    // function for finding Area of Triangle
    public static void AreaOfTriangle(float Base , float height ){
        float area = (float)0.5* Base * height ;
        System.out.printf("Area of Triangle is %.2f" , area);
    }
    // function for finding Area of Rectangle
    public static void AreaOfRectangle(float length , float breadth ){
        float area = length * breadth ;
        System.out.printf("Area of Rectangle is %.2f" , area);
    }
    // function for finding Area of parallelogram
    public static void AreaOfParallelogram(float base , float height ){
        float area = (float) base * height;
        System.out.printf("Area of Parallelogram is %.2f",area);
    }
    // function for finding Area of Rhombus
    public static void AreaOfRhombus(float base , float height ){
        float area = (float) base * height;
        System.out.printf("Area of Rhombus is %.2f",area);
    }
    // function for printing fibonacci Series
    // using while loop
    public static void fibonacciSeries(int number ){
        int first = 0 ;
        int second = 1 ;
        if(number > 0) {
            System.out.print(first + " ");
            System.out.print(second + " ");
        }
        while(first + second <= number){
            int third = first + second ;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
    // using recursion in this program we use recursion for finding the resultant number in the fibonacciSeries at given index
    public static int fibonacciSeriesUsingRecursion(int number ){
        if(number <=1 ){
            return number;
        }
        return fibonacciSeriesUsingRecursion(number - 1) + fibonacciSeriesUsingRecursion(number - 2 );
    }
    // function for Subtract the product and sum of the digit of an integer (leetcode problem - 1281)
    public static int SubtractProductAndSum(int number ){
        int product = 1 ;
        int sum = 0;
        while(number >0 ){
            int rem = number%10;
            sum += rem ;
            product *= rem ;
            number /=10;
        }
        return product - sum ;
    }

    // function for input the number and print all the factors of that number
    public static void AllFactorOfNumber(int number ){
        System.out.print("The All factor of " + number + " are given as :  ");
        for (int i = 2; i < number ; i++) {
            if(number% i == 0){
                System.out.print(i + " , ");
            }
        }
    }

    // function for print sum of all natural Number
    public static int sumOfAllNaturalNumber(){
        int sum = 0 ;
        int max = 0;
        Scanner input = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Welcome to the Sum of All Natural Number Generator \nEnter your number and Enter 0 for exit ");
            System.out.print("Enter your number : ");
            number = input.nextInt();
            sum += number;
            if(number > max){
                max = number ;
            }
        }while(number != 0 );
        System.out.println("maximum number : " + max);
        return sum ;
    }
    // function for finding Factorial
    // using while loop
    public static int Factorial(int number ){
        int product = 1 ;
        while(number>0){
            product *= number;
            number -- ;
        }
        return product;
    }
    // using recursion ;
    public static int FactorialUsingRecursion(int number ){
        if(number == 1){
            return 1 ;
        }
        return number*FactorialUsingRecursion(number -1 );
    }
    // function for Calculate Electricity Bill Program
    public static float ElectricityBill(float ConsumedWatt , float rate ){
        float ans = ConsumedWatt * rate ;
        return ans;
    }


}
