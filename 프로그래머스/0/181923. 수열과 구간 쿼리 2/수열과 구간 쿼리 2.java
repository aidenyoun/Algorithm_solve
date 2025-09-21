class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int[] tmp = new int[queries.length];
        
        for (int j = 0; j < queries.length; j++) { // 1차원 배열 돌림
            for (int k = queries[j][0]; k <= queries[j][1]; k++) { //s <= k <= e
                
                if (answer[j] == 0 && arr[k] > queries[j][2]) {
                    answer[j] = arr[k];
                }
                else if (answer[j] != 0 && arr[k] > queries[j][2]) {
                    if (arr[k] < answer[j]) answer[j] = arr[k];
                }
            }
            if (answer[j] == 0) answer[j] = -1;
        }
        return answer;
    }
}