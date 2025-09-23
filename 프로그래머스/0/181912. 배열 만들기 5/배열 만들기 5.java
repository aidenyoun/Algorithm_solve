import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> ar = new ArrayList<>();
        String tmp1 = "";
        
        for (int i = 0; i < intStrs.length; i++) {
            tmp1 = intStrs[i].substring(s, s+l);
            if (Integer.parseInt(tmp1) > k) {
                ar.add(Integer.parseInt(tmp1));
            }
        }
        int[] answer = ar.stream().mapToInt(j->j).toArray();
        return answer;
    }
}