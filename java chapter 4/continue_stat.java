import java.util.*;
public class continue_stat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter a number");
            int num = sc.nextInt();

          if(num % 10 == 0){
            continue;
          }
          System.out.println(num);
        
        }while(true);

        
    }
}