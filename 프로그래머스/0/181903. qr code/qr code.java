class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        int tmp1 = code.length(); // 11 -1
        int idx = 0;
        
        while (true) {
            if(idx == tmp1) {
                break;
            }
            if (idx == 0 && r == 0) {
                answer += code.toString().charAt(0);
            }
            else if (idx % q  == r) {
                answer += code.toString().charAt(idx);            
            }
            idx++;

        }
        
        return answer;
    }
}