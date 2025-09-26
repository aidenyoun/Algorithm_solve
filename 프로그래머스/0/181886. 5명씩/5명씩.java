import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> al = new ArrayList<>();
        
        
        for (int i = 0; i < names.length; i += 5) {
            al.add(names[i]);
        }
        
        return al.stream().toArray(String[]::new);
    }
}