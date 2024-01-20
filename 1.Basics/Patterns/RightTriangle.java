import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("inverted triangle 1");
        for(int i=0;i<n;i++){
            for(int j = i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("inverted triangle 2");
        for(int i=0;i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("right triangle");
        for(int i=0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("half pyramid");
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
