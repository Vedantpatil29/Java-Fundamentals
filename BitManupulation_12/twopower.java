import java.util.*;
public class twopower{
    public static void twopowerbit(int n ){
        int b = n-1;
        int bitmask = n & n-1;

        if(bitmask == 0){
            System.out.println("yes two power");
        }
        else{
            System.out.println("not two power");
        }

    }
    public static void main(String args[]){
        twopowerbit(9);
    }
}