package StriversSheet.Step1LearnTheBasics.Recusion;

public class printNto1 {
    public static void main(String[] args) {
        printing1ToN(1,12);

    }
    public static void printing1ToN(int number , int target){
        if(number > target){
            return ;
        }
        printing1ToN(number +1 , target);
        System.out.println(number);

    }
}
