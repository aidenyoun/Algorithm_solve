import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayList<Integer> stk1 = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (stk1.size() == 0) {
                stk1.add(arr[i]);
                i++;                
            }
            else if (stk1.get(stk1.size()-1) < arr[i]) {
                stk1.add(arr[i]);
                i++;
            }
            else if (stk1.get(stk1.size()-1) >= arr[i]) {
                stk1.remove(stk1.size()-1);
            }
        }
        stk = stk1.stream().mapToInt(k -> k).toArray();
        return stk;
    }
}