import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input int: ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Rect a = new Rect();
            System.out.println(a);
        }
    }
}