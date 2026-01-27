// by parameters means no of parametersss

import java.util.*;
public class overl_byparameters{
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(4,5));
        System.out.println(sum(4,3,2));


    }
}