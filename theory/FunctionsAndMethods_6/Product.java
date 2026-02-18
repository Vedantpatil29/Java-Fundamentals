import java.util.*;
public class Product{
    public static int calculateproduct(int num1 , int num2){
        int pro = num1 * num2;
        return pro;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = calculateproduct(a , b);
        
        System.out.println("the product of 2 number " + a  + "and " + b + "is = " + prod);
    }
}