import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string);
        
        answer = sb.substring(0, n);
        
        
        return answer;
    }
}