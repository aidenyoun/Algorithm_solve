class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ref1 = String.valueOf(a) + String.valueOf(b);
        
        if (Integer.parseInt(ref1) > 2*a*b) {
            answer = Integer.parseInt(ref1);
        }
        else if (Integer.parseInt(ref1) < 2*a*b) answer = 2*a*b;
        else answer = Integer.parseInt(ref1);
        
        return answer;
    }
}