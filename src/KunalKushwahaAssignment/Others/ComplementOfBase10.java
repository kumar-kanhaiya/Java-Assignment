package KunalKushwahaAssignment.Others;

public class ComplementOfBase10 {
    static void main() {
        System.out.println(bitwiseComplement(7));

    }
    public static int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String newStr = binary.replace("1","0");
        String finalStr = newStr.replace("0","1");
        System.out.println(finalStr);
        return Integer.parseInt(finalStr,2)-n;
    }

    // second approach
    public int bitwiseComplement2(int n) {

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
