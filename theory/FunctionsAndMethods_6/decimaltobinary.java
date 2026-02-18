import java.util.*;
public class decimaltobinary{
    public static void dec_num(int dec_num){
        int my_num = dec_num;
        int power = 0;
        int bin_num = 0;

        while(dec_num>0){
            int rem = dec_num % 2;
            bin_num = bin_num + (rem * (int)Math.pow(10 , power));
            power++;
            dec_num = dec_num/2;
        }
        System.out.println("the binary form of a decimal number " + my_num + " is =  " + bin_num);

    }
    public static void main(String args[]){
         dec_num(9);
    }
}