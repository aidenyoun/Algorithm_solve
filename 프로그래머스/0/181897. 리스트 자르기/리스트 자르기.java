import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> al = new ArrayList<>();
        
        if (n == 1) {
            for (int i = 0; i < slicer[1] + 1; i++) {
                al.add(num_list[i]);
            }
        }
        else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                al.add(num_list[i]);
            }
        }
        else if (n == 3) {
            for (int i = slicer[0]; i < slicer[1]+1; i++) {
                al.add(num_list[i]);
            }            
        }
        else if (n == 4) {
            for (int i = slicer[0]; i < slicer[1]+1; i += slicer[2]) {
                al.add(num_list[i]);
            }
        }
        
        return al.stream().mapToInt(k->k).toArray();
    }
}