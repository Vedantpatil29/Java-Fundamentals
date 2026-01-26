import java.util.*;
public class BinomialCoeff{
    public static int Factorial(int n){
       int Factorial = 1;
       for(int i = 1 ; i<=n ; i++){
        Factorial = Factorial * i;
        
       }
       return Factorial;
    }

    public static int bino(int n , int r ){
        int fact_1 = Factorial(n);
        int fact_2 = Factorial(r);
        int fact_3 = Factorial(n-r);

        int bc = fact_1 / (fact_2 * fact_3);
        return bc;

    }

    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
       int a = bino(n,r);
        System.out.println(a);

    }

}