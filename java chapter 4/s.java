import java.util.*;
public class s{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

         int numi = sc.nextInt();
         int i = 1;

         while((numi%10) != 0){
            if(numi%10 == 0){
                break;
            }

            System.out.println("number is not multiple of 10");
            System.out.println("enter the number again");
            i++;
             numi = sc.nextInt();
         }

         System.out.println("number is multiple of 10");

    }
}