import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int tmp1 = 0;
        int tmp2 = 0;
        List<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            for (int k = intervals[i][0]; k < intervals[i][1] + 1; k++) {
                al.add(arr[k]);
            }
        }
        
        return al.stream().mapToInt(m->m).toArray();
    }
}