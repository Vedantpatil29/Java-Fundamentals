import java.util.*;
public class q1average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("To find average of three numbers");
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        System.out.println("enter 3rd number");
        int c = sc.nextInt();
        System.out.println("average is");
        int average = (a+b+c)/3;
        System.out.print(average);
    }
}