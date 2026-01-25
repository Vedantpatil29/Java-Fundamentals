import java.util.*;
public class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the income");
        float income = sc.nextFloat();
        float tax;

        if(income>5.0 && income<10.0){
            tax = income * 0.20f;
           
        }
        else if (income>=10.0){
            tax = income * 0.30f;
        }
        else{
            tax = 0;
        }

        System.out.println("YOUR TAX IS " + tax);
    }
}