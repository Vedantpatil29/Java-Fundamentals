import java.util.*;
public class Factorial{
    public static int fact(int num){
        int factorial = 1;
        for(int i = 1 ; i<=num ; i++){
            factorial = factorial * i;
        }
        return factorial;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(fact(n));
        }
    }

