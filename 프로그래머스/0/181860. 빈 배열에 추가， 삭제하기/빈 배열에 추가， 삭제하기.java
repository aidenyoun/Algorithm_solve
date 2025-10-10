import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> al = new ArrayList<>();
        int cnt = 0;
        for (boolean i : flag) {
            if ( i == true) {
                for (int k = 0; k < arr[cnt] * 2; k++) {
                    al.add(arr[cnt]);
                }
                cnt++;
            }
            else {
                for (int k = 0; k < arr[cnt]; k++) {
                    al.remove(al.size() - 1);
                }
                cnt++;
            }
        }
        
        return al.stream().mapToInt(j->j).toArray();
    }
}