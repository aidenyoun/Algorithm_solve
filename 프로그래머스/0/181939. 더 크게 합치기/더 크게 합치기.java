class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ref1 = String.valueOf(a) + String.valueOf(b);
        String ref2 = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.parseInt(ref1) > Integer.parseInt(ref2)) {
            answer = Integer.parseInt(ref1);
        }
        else answer = Integer.parseInt(ref2);
        
        
        return answer;
    }
}