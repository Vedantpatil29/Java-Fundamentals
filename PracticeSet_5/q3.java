//palindrome question impppppppppppp

import java.util.*;
public class q3{
    public static boolean palindrome(int n){
        int reverse = 0;
        int my_num = n;

        while(n>0){
            int last_digit = n%10;
            reverse = reverse * 10 + (last_digit);
            n = n/10;
        }
        return my_num == reverse;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(palindrome(num)){
            System.out.println("the palindrome of a num " + num + "exists" );
        }
        else{
            System.out.println("the palindrome of a num  " + num + "  do not exists");
        }
    }
}