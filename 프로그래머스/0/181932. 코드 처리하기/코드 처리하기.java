class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char ch = ' ';
        
        for (int i = 0; i < code.length(); i++) {
            ch = code.charAt(i);
            if (mode == 0) {
                if (ch == '1') {
                    mode = 1;
                }
                else {
                    if (i % 2 == 0) {
                        answer += ch;
                    }
                }
            }
            else if (mode == 1) {
                if (ch == '1') {
                    mode = 0;
                }                
                else {
                    if (i % 2 > 0) {
                        answer += ch;
                    }
                }
            }
        }
        if (answer == "") {
            return "EMPTY";
        }
        else return answer;
    }
}