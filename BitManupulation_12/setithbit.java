import java.util.*;
public class setithbit{

    public static int setithbit(int n , int i ){
        int bitmark = 1<<i;
        return n | bitmark;
    }

    public static void main(String args[]){
        System.out.println(setithbit(10,2));
    }
}