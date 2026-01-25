import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n==2){
            System.out.println("is prime");
        }
        else{
            
        boolean is_prime = true;

        for(int i = 2 ; i<=n-1 ; i++){
            if(n%i == 0){
                is_prime = false;
            }

           
        }
          
          if(is_prime == true){
            System.out.println("is prime");
          }

          else{
            System.out.println("not prime");
          }
        

        }

    }
}