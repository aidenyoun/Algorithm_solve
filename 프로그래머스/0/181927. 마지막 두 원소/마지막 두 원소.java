class Solution {
    public int[] solution(int[] num_list) {
        int tmp = num_list.length - 1; // 3 -> 2
        int answer[] = new int[tmp + 2]; // 3 -> 4
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        
        if (num_list[tmp] > num_list[tmp-1]) {
            answer[tmp + 1] = num_list[tmp] - num_list[tmp-1];
        }
        else answer[tmp + 1] = num_list[tmp] * 2;
        
        return answer;
    }
}