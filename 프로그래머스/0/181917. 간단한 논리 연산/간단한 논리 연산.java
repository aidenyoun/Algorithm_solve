class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        if ((x1 || x2) == true && (x3 || x4) == false) {
            answer = false;
        }
        if ((x1 || x2) == false && (x3 || x4) == true) {
            answer = false;
        }        
        else if ((x1 || x2) == false && (x3 || x4) == false) {
            answer = false;
        }
        
        
        return answer;
        
        
    }
}