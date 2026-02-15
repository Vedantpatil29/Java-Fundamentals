import java.util.*;
public class q2_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter temp of your body");

        Double temp = sc.nextDouble();

        if(temp >= 100){
            System.out.println("you have fever with temp " + temp);
        }
        else{
            System.out.println("you dont have fever");
        }


    }
}