import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> al = new ArrayList<>();
        int tmp1 = k;
        for (int i : arr) {
            if (tmp1 == 0) {
                break;
            }
            if (al.contains(i) == false) {
                al.add(i);
                tmp1--;
            }
        }
        while(al.size() < k) {
            al.add(-1);
        }

        return al.stream().mapToInt(j->j).toArray();
    }
}