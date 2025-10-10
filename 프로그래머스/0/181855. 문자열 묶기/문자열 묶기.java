import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] counts = new int[31];
        for (String str : strArr) {
            int len = str.length();
            counts[len]++;
        }
        int maxCount = 0;
        for (int count : counts) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}