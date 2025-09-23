class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int tmp = 0;

        for (int i = 0; i < number.length(); i++) {
            tmp += ((int)number.charAt(i) - '0');
        }
        
        answer = tmp % 9;
        
        return answer;
    }
}