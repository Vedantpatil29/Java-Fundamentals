import java.util.*;
public class q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks");
        int marks = sc.nextInt();
        String reportcard = marks >= 33 ? "passed" : "failed";

        System.out.println(reportcard);

    }
}