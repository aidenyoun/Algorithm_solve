import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();
        long ans = 0;
        
        if ( t == a ) ans += 1;
        if ( t == b ) ans += 1;
        if ( t == c ) ans += 1;
        if ( t == d ) ans += 1;
        if ( t == e ) ans += 1;
        
        System.out.printf("%d", ans);
    }
}