import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> al = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                al.add(todo_list[i]);
            }
        }
        
        
        return al.stream().toArray(String[]::new);
    }
}