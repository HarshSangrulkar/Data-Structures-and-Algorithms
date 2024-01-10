public class ReverseANumber {
    public static void main(String[] args) {
        /*
        you want the last digit = %10
        you want to remove the last digit = /10

        132%10 = 2
        132/10 = 13
        */
        int n = 10899;
        while(n>0){
            int LastDigit = n%10;
            System.out.print(LastDigit+" ");
            n=n/10;
        }
    }
}
