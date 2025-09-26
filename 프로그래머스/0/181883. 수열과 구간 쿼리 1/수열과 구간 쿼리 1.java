class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < queries.length; i++) {
            tmp1 = queries[i][0];
            tmp2 = queries[i][1];
            
            for (int j = tmp1; j < tmp2 + 1; j++) {
                answer[j] += 1;
            }
            
        }
        
        return answer;
    }
}