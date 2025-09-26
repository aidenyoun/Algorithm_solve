import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> al = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            al.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            al.add(num_list[i]);
        }
        
        return al.stream().mapToInt(m->m).toArray();
    }
}