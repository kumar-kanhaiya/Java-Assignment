package JAVACHALLENGE100Days.Day4;

public class NumberIsPerfect {
    public static void main(String[] args) {
    int number = 28;
    int ans = 0;
        for (int i = 1; i < number ; i++) {
            if(number%i == 0){
                ans += i;
            }
        }
        if(ans == number){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
