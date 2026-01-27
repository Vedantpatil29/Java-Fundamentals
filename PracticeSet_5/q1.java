import java.util.*;
public class q1{
    public static double avg(int num1 , int num2 , int num3){
        double avg = (num1 + num2 + num3)/3.0f;
        return avg;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers to find average of them");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("the average of 3 numbers " + a+  " " + b + "and " + c +"is =" + avg(a,b,c));
    }
}