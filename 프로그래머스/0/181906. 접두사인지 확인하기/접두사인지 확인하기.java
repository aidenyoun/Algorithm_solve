import java.util.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        
        for (int i = 0; i < my_string.length(); i++) {
            if (is_prefix.equals(sb.substring(0,i+1))) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}