import java.util.*;
public class q2{
    public static boolean even(int n){
       int  my_num = n;
        if(n%2==0){
            return true;
        }

        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        if(even(num)){  //it means num will send to even to check whether its even or not if even it will return true value then only if command will run  if false then if command will not run
            System.out.println("number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}