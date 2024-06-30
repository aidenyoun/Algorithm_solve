import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double[] ans = new double[4];
        ans[0] = (a / c) + (b / d);
        ans[1] = (c / d) + (a / b);
        ans[2] = (d / b) + (c / a);
        ans[3] = (b / a) + (d / c);
        
        double max = ans[0];
        int answer = 0;
        
        for (int i = 1; i < 4; i++) {
            if (max < ans[i]) {
                max = ans[i];
                answer = i;
            }
        }
        System.out.printf("%d", answer);

        }
    }
