import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st numbers");

        int a = sc.nextInt();

        System.out.println("enter 2nd numbers");

        int b = sc.nextInt();

       System.out.println("enter operator");
        char operator = sc.next().charAt(0);  //meaning of this line later on

        switch(operator){

            case '+': System.out.println(a+b);
            break ;

            case '-' : System.out.println(a-b);
            break ;

            case '*' : System.out.println(a*b);
            break ;

            case '/' : System.out.println(a/b);
            break ;

            default : System.out.println(a%b);
        }
    }
}