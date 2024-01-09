import java.util.*;

public class LargestOfThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("greatest num is "+a);
            }
            else{
                System.out.println("greatest num is "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("greatest num is "+b);
            }
            else{
                System.out.println("greatest num is "+c);
            }
        }
    }
}
