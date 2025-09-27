package KunalKushwahaAssignment.Strings.Easy;

import java.util.Arrays;
import java.util.List;

public class Problem1773 {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("phone,blue,pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        System.out.println(countMatches(list,"type","phone"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type")){
                if(items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
            if(ruleKey.equals("color")){
                if(items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
            if(ruleKey.equals("name")){
                if(items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
