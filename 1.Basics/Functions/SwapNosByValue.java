import java.util.Scanner;
public class SwapNosByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        System.out.println("a = "+a+" b = "+b);
        temp = b;
        b=a;
        a=temp;
        System.out.println("a = "+a+" b = "+b);
    }
}
