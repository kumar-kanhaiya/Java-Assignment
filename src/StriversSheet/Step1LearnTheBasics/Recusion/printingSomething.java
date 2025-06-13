package StriversSheet.Step1LearnTheBasics.Recusion;

public class printingSomething {
    public static void main(String[] args) {
        System.out.println(printingNumber(1));

    }


    public static int printingNumber(int number) {
        if (number == 15) {
            return 15;
        }
        System.out.print(number + " , ");
        return printingNumber(number + 1);
    }
}
