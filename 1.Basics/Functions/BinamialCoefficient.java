public class BinamialCoefficient {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int binamialCoeff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr = fact(n-r);
        int binamialCoeff = n_fact/(r_fact*nmr);
        return binamialCoeff;
    }
    public static void main(String[] args) {
        int n=5;
        int r=3;
        System.out.println(binamialCoeff(n, r));
        
    }
}
