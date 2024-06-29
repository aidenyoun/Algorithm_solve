import java.util.Scanner;;

/**
 * 이_별은_무슨_색일까
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        if (i >= 620) System.out.printf("Red");
        else if (i >= 590) System.out.printf("Orange");
        else if (i >= 570) System.out.printf("Yellow");
        else if (i >= 495) System.out.printf("Green");
        else if (i >= 450) System.out.printf("Blue");
        else if (i >= 425) System.out.printf("Indigo");
        else if (i >= 380) System.out.printf("Violet");

    }
}