import java.util.*;
public class printprimeinrange{

    public static boolean prime(int n){
        if (n == 2 ){
            return true;
        }
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
            

        }
        return true;
    }
    public static void checkall(int a){
        for(int i = 2 ; i<=a ; i++){
          if(prime(i)){   //if(prime(i)==true) //you can write in this way too ,, but if will work only when he got value true if false it will not execute
            System.out.print(i + " ");

          }
           
        }
        }
    
    public static void main(String args[]){
        checkall(33);

    }
}

