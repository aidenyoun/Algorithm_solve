import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> al = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (al.size() == 0) {
                al.add(arr[i]);
                i++;
            }
            else if(al.size() > 0 && al.get(al.size()-1) == arr[i]) {
                al.remove(al.size()-1);
                i++;
            }
            else if(al.size() > 0 && al.get(al.size()-1) != arr[i]) {
                al.add(arr[i]);
                i++;
            }
        }
        if (al.size() == 0) {
            al.add(-1);
        }
        return al.stream().mapToInt(j->j).toArray();
    }
}