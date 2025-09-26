import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> al = new ArrayList<>();
        
        
        for (int i = 0; i < num_list.length; i += n) {
            al.add(num_list[i]);
        }
        
        return al.stream().mapToInt(m->m).toArray();
        
        
    }
}