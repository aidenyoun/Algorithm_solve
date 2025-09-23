import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> al = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            al.add(my_string.substring(i));
        }
        Collections.sort(al);
        
        return al.stream().toArray(String[]::new);
    }
}