import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String ans = "";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLowerCase(ch)) {
                ans += Character.toUpperCase(ch);
            }
            else ans += Character.toLowerCase(ch);
        }
        System.out.println(ans);
    }
}