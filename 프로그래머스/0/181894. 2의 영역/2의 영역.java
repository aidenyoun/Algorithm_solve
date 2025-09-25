import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> al = new ArrayList<>();
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                al.add(i);
            }
        }
        if (al.size() == 0) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[Collections.max(al) - Collections.min(al) + 1];
        int cnt = 0;
        for (int i = Collections.min(al); i < Collections.max(al) + 1; i++) {
            answer[cnt] = arr[i];
            cnt ++;
        }
        
        return answer;
    }
}