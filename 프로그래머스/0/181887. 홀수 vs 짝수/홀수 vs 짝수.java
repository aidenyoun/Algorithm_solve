
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i <num_list.length; i++) {
            if ((i+1) % 2 == 0) {
                tmp1 += num_list[i];
            }
            else if ((i+1) % 2 > 0) {
                tmp2 += num_list[i];
            }
        }
        
        if (tmp1 > tmp2) answer = tmp1;
        else answer = tmp2;
        
        
        return answer;
    }
}