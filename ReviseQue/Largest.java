import java.util.*;
public class Largest{
    public static int largest(int a , int b){

        if(a>b){
            return a;
        }
        
    return b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the largest number among " + a + "and " + b + "is =" + largest(a,b));
    }
}