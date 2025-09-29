import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        List<String> al = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0 || i == 0) {
                al.add(strArr[i].toLowerCase());
            }
            else al.add(strArr[i].toUpperCase());
        }
        
        
        return al.stream().toArray(String[]::new);
    }
}