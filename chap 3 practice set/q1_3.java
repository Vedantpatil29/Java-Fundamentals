import java.util.*;
public class q1_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        int num = sc.nextInt();

        if(num > 0){
            System.out.println("the number is postive");
        }

        else if(num < 0){
            System.out.println("number is negative");

        }
    }
}