import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]");
        List<String> resultList = new ArrayList<>();
        
        for (String s : parts) {
            if (!s.isEmpty()) {
                resultList.add(s);
            }
        }

        if (resultList.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return resultList.toArray(new String[0]);
        }
    }
}