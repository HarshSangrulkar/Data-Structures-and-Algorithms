import java.util.Scanner;
public class skip10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);

        do{
            int i = sc.nextInt();
            if(i%10==0){
                continue;
                
            }
            System.out.println(i);
        }while(true);
    }
}
