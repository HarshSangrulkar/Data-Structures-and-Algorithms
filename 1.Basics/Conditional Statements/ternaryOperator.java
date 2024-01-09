import java.util.*;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //()?x:y
        String oddEven = ((num%2)==0)?"even":"odd";
        System.out.println(oddEven);

    }
}
