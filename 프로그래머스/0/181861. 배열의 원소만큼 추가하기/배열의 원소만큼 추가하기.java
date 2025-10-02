import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> al = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                al.add(i);
            }
        }
        
        return al.stream().mapToInt(k->k).toArray();
    }
}