import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> counts = new HashMap<>();
        int[] dice = {a, b, c, d};
        for (int num : dice) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(counts.keySet());

        if (keys.size() == 1) {
            int p = keys.get(0);
            return 1111 * p;

        } else if (keys.size() == 2) {
            int p = keys.get(0);
            int q = keys.get(1);

            if (counts.get(p) == 3 || counts.get(q) == 3) {
                int p_val = (counts.get(p) == 3) ? p : q;
                int q_val = (counts.get(p) == 1) ? p : q;
                return (int) Math.pow(10 * p_val + q_val, 2);
            } else {
                return (p + q) * Math.abs(p - q);
            }

        } else if (keys.size() == 3) {
            int result = 1;
            for (int key : keys) {
                if (counts.get(key) == 1) {
                    result *= key;
                }
            }
            return result;

        } else {
            return Math.min(a, Math.min(b, Math.min(c, d)));
        }
    }
}