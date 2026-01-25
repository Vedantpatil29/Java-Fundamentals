import java.util.*;
public class q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        int a = sc.nextInt();

        if((a%2)==0){
            System.out.println("number " + a + " is even"); //see the space in como is included after number i kept space so that space is not ignored and then give + sign
        else {
            System.out.println("number " + a + " is odd");
        }

    }
}