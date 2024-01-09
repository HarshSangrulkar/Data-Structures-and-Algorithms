import java.util.*;

public class LargestOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("greatest num is"+a);
        }
        else{
            System.out.println("greatest num is"+b);
        }
    }
}
