import java.util.*;
public class q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks till 100");

        float marks = sc.nextFloat();

        if(marks >= 33){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
    }
}