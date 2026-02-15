package KunalKushwahaAssignment.Recursion.easy;

public class SpecialTypeOfFibonacci {
    static void main() {
        System.out.println(fib(0));

    }

    public static int fib(int n){
        // base condition
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return (n-1) ^ (n-2);
    }
}
