import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:System.out.println("pizza");
                
                break;
            case 2:System.out.println("burger");
            break;
            case 3: System.out.println("dosa");
            break;
            default:System.out.println("idli");
                break;
        }
    }
}
