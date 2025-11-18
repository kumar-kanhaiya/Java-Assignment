package KunalKushwahaAssignment.Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1324 {
    public static void main(String[] args) {
        String s = "CONTEST IS COMING";
        String[] ans = s.trim().split(" ");

        System.out.println(Arrays.toString(ans));
        System.out.println(printVertically(s));

    }

    public static List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String[] arr = s.split(" ");
//        trimHai(arr);

        int maxLength = maxLengthString(arr);
        int i = 0;
        while(i< maxLength){
            String check = "";
            for (int j = 0; j < arr.length ; j++) {

                if(i > arr[j].length()-1){
                    check += " ";

                }
                else{
                    check += arr[j].charAt(i);


                }
                if(j == maxLength && i == arr[j].length()-1){
                    break;
                }
            }
            int end = check.length() -1;
            while(end >= 0 && check.charAt(end) == ' '){
                end--;
            }
            check = check.substring(0,end+1);
            ans.add(check);
            i++;

        }

        return  ans;
    }

    public static int maxLengthString(String[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans , arr[i].length());
        }
        return ans ;
    }

    public static void removeSpace(String[] arr){
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = arr[i].substring(1);
        }

    }

}
