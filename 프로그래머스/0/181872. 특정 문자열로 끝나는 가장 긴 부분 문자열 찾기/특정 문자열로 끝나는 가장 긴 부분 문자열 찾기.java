class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int tmp1 = myString.indexOf(pat);
        int tmp2 = myString.lastIndexOf(pat);
        
        if (tmp1 == tmp2) {
            answer = myString.substring(0, tmp1+(pat.length()));    
        }
        else {
            answer = myString.substring(0,tmp2+(pat.length()));
        }
        
        return answer;
    }
}