package KunalKushwahaAssignment.Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode539 {
    static void main() {
        List<String> check = List.of("23:59","00:00");
        List<String> result = new ArrayList<>();

        for (String s : check) {
            String[] parts = s.split(",");
            result.addAll(Arrays.asList(parts));
        }

        String[] arr = result.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

    }

    public static int findMinDifference(List<String> timePoints) {
//        char[] s = timePoints.toString().toCharArray();
        List<String> result = new ArrayList<>();

        for (String s : timePoints) {
            String[] parts = s.split(",");
            result.addAll(Arrays.asList(parts));
        }

        String[] arr = result.toArray(new String[0]);
        return 0;
    }
}
