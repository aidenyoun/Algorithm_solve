import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        double i = (double)b / 2;
        if (a >= i) System.out.printf("E");
        else System.out.printf("H");

    }
}