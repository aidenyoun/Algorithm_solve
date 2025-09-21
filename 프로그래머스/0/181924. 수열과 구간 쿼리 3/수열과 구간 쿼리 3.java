class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length -1];
        
        for (int i = 0; i < queries.length; i++) {
            int tmp1 = queries[i][0];
            int tmp2 = queries[i][1];
            int tmp3 = arr[tmp1];
            arr[tmp1] = arr[tmp2];
            arr[tmp2] = tmp3;
        }
        answer = arr.clone();
        
        return answer;
    }
}