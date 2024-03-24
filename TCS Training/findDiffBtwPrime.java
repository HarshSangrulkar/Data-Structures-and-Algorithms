
import java.util.*;
public class findDiffBtwPrime {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int outputs[] = new int[n];
        for(int t=0;t<n;t++){
            int ip1=sc.nextInt();
            int ip2=sc.nextInt();
            int minPrime=0;
            int maxPrime=-1;
            for(int i=ip1;i<=ip2;i++){
                if(isPrime(i)){
                    minPrime = i;
                    break;
                }
            }
            for(int i=ip2;i>=ip1;i--){
                if(isPrime(i)){
                    maxPrime = i;
                    break;
                }
            }
            outputs[t]=maxPrime-minPrime;
        }
        for(int i=0;i<n;i++){
            System.out.println(outputs[i]);
        }
    }
        
}
