class Solution {
    public String solution(String myString) {
        String lowerCaseString = myString.toLowerCase();
        
        String answer = lowerCaseString.replace('a', 'A');
        
        return answer;
    }
}