import java.util.Scanner;

/**
 * 문자열
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        for (long a = 1; a <= i; a++) {
            String str = sc.next();
            System.out.printf("%c", str.charAt(0));
            System.out.printf("%c\n", str.charAt(str.length()-1));
        }
    }
    
}