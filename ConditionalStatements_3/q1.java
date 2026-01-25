import java.util.*;
public class q1{
    public static void main(String args[]){
        int a = 2 , b = 5;

        if(a>b){
           System.out.println("the largest number is" + a);
        }
        else if(b>a){
            System.out.println("the largest number is" + b);
        }
        else if (a==b){
            System.out.println("both equal");
        }
    }
}