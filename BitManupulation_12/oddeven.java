import java.util.*;
public class oddeven{

    public static void checkevenodd(int n){
        int bitmask = 1;

        if((n & bitmask)== 1){
            System.out.println(n + "= odd");
        }
        else{
            System.out.println(n + "= even");
        }
    }
    public static void main(String args[]){
        checkevenodd(3);
        checkevenodd(4);
        checkevenodd(0);


    }
}