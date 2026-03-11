package KunalKushwahaAssignment.Others;

public class NumberComplement {
    static void main() {
        int n = 10;
        System.out.println(numberComplement(n));

    }
    public static int numberComplement(int n) {

        if(n==0)  return 1;

        String s=Integer.toBinaryString(n);

        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch=='0')  sb.append('1');

            else  sb.append('0');
        }

        String res=sb.toString();

        return Integer.parseInt(res,2);

    }
}
