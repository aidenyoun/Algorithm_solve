import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> al = new ArrayList<>();
        int[] answer = {};
        
        for (int i = k; i <= n; i += k) {
            al.add(i);
        }
        
        return al.stream().mapToInt(m->m).toArray();
    }
}