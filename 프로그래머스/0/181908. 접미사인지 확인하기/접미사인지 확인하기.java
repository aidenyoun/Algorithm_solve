import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            al.add(my_string.substring(i));
        }
        
        if (al.contains(is_suffix)) answer = 1;
        
        return answer;
    }
}