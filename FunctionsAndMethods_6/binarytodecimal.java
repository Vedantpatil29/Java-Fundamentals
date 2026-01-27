import java.util.*;
public class binarytodecimal{
    public static void bin_num(int bin_num){
        int my_num = bin_num;
        int power = 0;
        int dec = 0;
        while(bin_num>0){
            int ld = bin_num%10;
            dec = dec + (ld * (int)Math.pow(2 , power));
            power ++;
            bin_num = bin_num / 10;
        }
        System.out.println("the decimal form of binary number " + my_num + "is = " + dec);



    }

    public static void main(String args[]){
        bin_num(101);
    }
}