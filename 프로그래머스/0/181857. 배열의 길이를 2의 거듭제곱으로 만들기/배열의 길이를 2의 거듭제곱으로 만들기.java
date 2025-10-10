import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int targetLength = 1;
        while (targetLength < arr.length) {
            targetLength *= 2;
        }

        return Arrays.copyOf(arr, targetLength);
    }
}