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

    public static int findMinDifference(List<String> timePoints) {

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

    public static void sortTheList(List<String> timePoints){
        for (int i = 0; i < timePoints.size() ; i++) {
            if(i+1 < timePoints.size()){
                if(timePoints.get(i).charAt(0) != timePoints.get(i+1).charAt(0) ||
                timePoints.get(i).charAt(1) != timePoints.get(i+1).charAt(1)){
                    int first = Integer.parseInt("" + timePoints.get(i).charAt(0) + timePoints.get(i).charAt(1));
                    int second = Integer.parseInt("" + timePoints.get(i+1).charAt(0) + timePoints.get(i+1).charAt(1));
                    if(first> second){
                        String temp = timePoints.get(i);

                    }
                }
            }
        }
    }
}
