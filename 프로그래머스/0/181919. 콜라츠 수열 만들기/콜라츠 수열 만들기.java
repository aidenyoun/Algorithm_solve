import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] answer1 = {};
        int tmp1 = n;
        
        while (true) {
            if (tmp1 == 1) {
                answer.add(tmp1);
                break;} 
            else if (tmp1 % 2 == 0) {
                answer.add(tmp1);
                tmp1 /= 2;
            }
            else{
                answer.add(tmp1);
                tmp1 = (3 * tmp1 + 1);
            }
        }
        answer1 = answer.stream()
                     .mapToInt(i -> i)
                     .toArray();
        return answer1;
    }
}