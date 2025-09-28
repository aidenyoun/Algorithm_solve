class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int tmp = 0;
        int cnt = 0;
        
        int totalOperations = 0;
        
        for (int num : num_list) {

            while (num != 1) {
                
                if (num % 2 == 0) {
                    num /= 2;
                }
                else if (num % 2 > 0) {
                    num = (num - 1) / 2;
                }
                totalOperations++;
            }
        }
        
        return totalOperations;
    }
}