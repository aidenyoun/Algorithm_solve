import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String numStr = String.valueOf(i);
            
            boolean isValid = true;

            for (char ch : numStr.toCharArray()) {
                if (ch != '0' && ch != '5') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        } else {
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}