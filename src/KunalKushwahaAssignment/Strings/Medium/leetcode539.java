package KunalKushwahaAssignment.Strings.Medium;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leetcode539 {
    static void main() {
        List<String> timePoints = new ArrayList<>(
                List.of( "23:59", "00:00")
        );

        System.out.println(findMinDifference(timePoints));

    }

    public static int findMinDifference1(List<String> timePoints) {

        ArrayList<String> list = new ArrayList<>(timePoints);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        list.sort(Comparator.comparing(
                t -> LocalTime.parse(t , formatter)
        ));

        if(list.size() < 1){
            return 0;
        }

        int first = Integer.parseInt(""+ list.get(0).charAt(3) + list.get(0).charAt(4));
        int second = Integer.parseInt(""+ list.get(1).charAt(3) + list.get(1).charAt(4));
        if(first == 0 ){
         first = 60;
         if(second == 0){
             second = 60;
         }
         return first - second;
        }
        if(second == 0){
            second = 60;
        }
        return second - first;
    }

    // correct approach
    public static int findMinDifference(List<String> timePoints){

        List<String> list = new ArrayList<>(timePoints);
        int size = list.size();
        int[] minutes = new int[size];

        for (int i = 0; i <size ; i++) {
            String current = list.get(i);
            int hour = Integer.parseInt(current.substring(0,2));
            int minute = Integer.parseInt(current.substring(3,5));
            minutes[i] = hour*60 + minute;
        }
        Arrays.sort(minutes);
        // now we have to calculate the minimum minutes difference
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i <size ; i++) {
            minDiff = Math.min(minDiff , minutes[i] - minutes[i-1]);
        }
        //compare the last and first element
        minDiff = Math.min(
                minDiff,
                24*60 + minutes[0] - minutes[size - 1]
        );

        return minDiff;
    }
}
