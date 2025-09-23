class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder tmp1 = new StringBuilder();
        StringBuilder tmp2 = new StringBuilder();
        tmp1.append(my_string);
        String answer = "";
        
        for (int i = 0; i < queries.length; i++) {
            tmp2.append(tmp1.substring(queries[i][0], queries[i][1]+1));
            tmp2.reverse();
            tmp1.replace(queries[i][0], queries[i][1]+1, tmp2.toString());
            tmp2.setLength(0);
        }
        answer = tmp1.toString();
        return answer;
    }
}
//queries.length