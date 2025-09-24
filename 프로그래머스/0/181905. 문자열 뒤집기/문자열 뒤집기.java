import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String tmp1 = "";
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string.substring(s, e+1));
        sb.reverse();
        tmp1 = sb.toString();

        sb.delete(0, sb.length());
        sb.append(my_string);
        sb.delete(s, e+1);
        sb.insert(s, tmp1);
            
        answer = sb.toString();
        

        return answer;
    }
}