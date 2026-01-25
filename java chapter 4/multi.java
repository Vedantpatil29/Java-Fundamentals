import java.util.*;
public class multi{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your number");
            int num = sc.nextInt();
           if(num % 10 ==0){
            break;
           }

           System.out.println("your number is not multiple of 10");
        }while(true);

        System.out.println("your number is multiple of 10");
    }
}