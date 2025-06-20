package StriversSheet.Step1LearnTheBasics.Recusion;

// recursion 

public class factorial {
    public static void main(String[] args) {
        System.out.printf("factorial of %d is %d " , 5 , fact(5));

    }
    public static int fact(int number ){
        if(number == 1 ){
            return 1;
        }
        return number* fact(number - 1);
    }
}
