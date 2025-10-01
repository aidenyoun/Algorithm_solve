import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> al = new ArrayList<>();
        char ch = ' ';
        int cnt = 0;
        for (int i = 0; i < myString.length(); i++) {
            ch = myString.charAt(i);
            if (ch == 'x') {
                al.add(cnt);
                cnt = 0;   
            }
            else if (ch != 'x') cnt++;
            if ( i == myString.length()-1) {
                al.add(cnt);
            }
        }
        return al.stream().mapToInt(k->k).toArray();
    }
}