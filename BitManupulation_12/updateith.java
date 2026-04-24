import java.util.*;
public class updateith{
    public static int setith(int n , int i){
        int bitmask = 1<<i;

        return n | bitmask;
    }

    public static int clearith(int n , int i ){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int update(int n , int i , int newbit){
     /*   if(newbit == 0){
            return clearith(n , i);
        }
        else{
            return setith(n,i);
        }
        */

       int newn = clearith(n,i);
       int bitmask = newbit<<i;
       return newn | bitmask;
    }

    public static void main(String args[]){
        System.out.println(update(10,2,1));
    }
}