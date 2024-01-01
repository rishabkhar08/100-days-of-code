import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItems {
    public static void main(String[] args) {
        
        List<List<String>> items1 = new ArrayList<>();
        items1.add(new ArrayList<>(Arrays.asList("phone", "blue", "pixel")));
        items1.add(new ArrayList<>(Arrays.asList("computer", "silver", "lenovo")));
        items1.add(new ArrayList<>(Arrays.asList("phone", "gold", "iphone")));
        String ruleKey1 = "color";
        String ruleValue1 = "silver";
        System.out.println(CountMatches(items1, ruleKey1, ruleValue1)); // Output: 1

        List<List<String>> items2 = new ArrayList<>();
        items2.add(new ArrayList<>(Arrays.asList("phone", "blue", "pixel")));
        items2.add(new ArrayList<>(Arrays.asList("computer", "silver", "phone")));
        items2.add(new ArrayList<>(Arrays.asList("phone", "gold", "iphone")));
        String ruleKey2 = "type";
        String ruleValue2 = "phone";
        System.out.println(CountMatches(items2, ruleKey2, ruleValue2)); // Output: 2
    }

    public static int CountMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue))
                count++;

        }

        return count;
    }
}
