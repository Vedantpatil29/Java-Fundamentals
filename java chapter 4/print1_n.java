import java.util.*;
public class print1_n{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();
        int r = 1;


        while(r<=n){
            System.out.println(r);
            r++;
        }

    }
}