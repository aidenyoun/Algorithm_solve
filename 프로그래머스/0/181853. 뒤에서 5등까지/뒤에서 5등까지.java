import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> al = new ArrayList<>();
        for (int i : num_list) {
            al.add(i);
        }
        al.sort(null);
        while (al.size() > 5) {
            al.remove(al.size() - 1);
        }
        return al.stream().mapToInt(k->k).toArray();
    }
}