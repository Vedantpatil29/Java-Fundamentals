import java.util.*;
public class q3_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter week number");
        int weeknum = sc.nextInt();

        switch(weeknum){

            case 1 : System.out.println("monday");
            break ;

            case 2 : System.out.println("tuesday");
            break ;

            case 3 : System.out.println("wednesday");
            break ;

            case 4 : System.out.println("thus");
            break ;

            case 5 : System.out.println("fri");
            break ;

            case 6 : System.out.println("sat");
            break ;

            default : System.out.println("sun");
        }

    }
}