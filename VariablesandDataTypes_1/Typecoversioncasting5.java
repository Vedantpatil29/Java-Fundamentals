import java.util.*;
public class Typecoversioncasting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  

      //type coversion

        //long a = 25;
        //int b = a; // error ayega as long>int

        int a = 25;
        long b = a; //no error 
        System.out.println(b);
     //type casting 

       //long a = 10;
       //int b = a; //error as we seen above

       float c = 25.34f;
       int d = (int)c;
       System.out.println(d); // now data will loose as after decimal values will automatically remove that is loss of data

       //characters can convert into numbers

       char ch1 = 'a';
       char ch2 = 'd';
       int num1 = ch1;
       int num2 = ch2;
       System.out.println(num1);
       System.out.println(num2);

    }

}
