import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> al = new ArrayList<>();
        for (int i : arr) {
            al.add(i);
        }
        
        for (int i = 0; i < query.length; i++) {
            int idx = query[i];
            if (i == 0 || i % 2 == 0) {
                al.subList(idx + 1, al.size()).clear();
            }
            else {
                al.subList(0, idx).clear();
            }
        }
        
        return al.stream().mapToInt(m->m).toArray();
    }
}