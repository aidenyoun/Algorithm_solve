import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double c[] = new double[cnt];

        for (int i = 0; i < cnt; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            c[i] = a - b;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%.1f\n", Math.abs(c[i]));
            }
        }
    }
