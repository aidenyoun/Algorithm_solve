import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        
        List<String> resultList = new ArrayList<>();
        for (String s : parts) {
            if (!s.isEmpty()) {
                resultList.add(s);
            }
        }
        Collections.sort(resultList);
        
        return resultList.toArray(new String[0]);
    }
}