import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> al = new ArrayList<>();
        for (int i = n-1; i < num_list.length; i++) {
            al.add(num_list[i]);
        }
        
        return al.stream().mapToInt(k->k).toArray();
    }
}