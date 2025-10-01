import java.util.*;
class Solution {
    public int solution(String binomial) {
        List<String> al = new ArrayList<>(Arrays.asList(binomial.split(" ")));
        int a = Integer.parseInt(al.get(0));
        String op = al.get(1);
        int b = Integer.parseInt(al.get(2));
        
        int answer = 0;
        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }
        
        
        return answer;
    }
}