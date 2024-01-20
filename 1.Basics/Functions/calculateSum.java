import java.util.Scanner;
public class calculateSum {
    public static void calSum(int a, int b){ // parameters or formal parameters
        System.out.println("Sum is: "+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        calSum(a, b); // arguments or local parameters

    }
}
