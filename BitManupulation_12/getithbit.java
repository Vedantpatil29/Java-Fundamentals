import java.util.*;
public class getithbit{

    public static int getithbit(int n  , int i){
        int bitmask = 1<<i;

        if((n & bitmask)!=0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String args[]){
        System.out.println(getithbit(10,3));
    }
}