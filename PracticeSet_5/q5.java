import java.util.*;
public class q5{
    public static int sumofdigit(int num){
        int my_num = num;
        int sum = 0;
        int last_digit = 0;
        while(num>0){
            last_digit = num %10;
            sum = sum + last_digit;
            num = num/10;
        }
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum of the digits of number " + n + " is  " +sumofdigit(n));


    }
}