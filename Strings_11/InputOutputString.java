import java.util.*;
public class InputOutputString{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    String favsinger;
    String favnumber;

   // favsinger = sc.next(); //will only print written before space and space everything will get ignore
   // System.out.println(favsinger);

    favsinger = sc.nextLine();
    System.out.println(favsinger);

    favnumber = sc.nextLine(); //if i give input 5 6 7 only 5 will print here but i print in nextline 5 6  7  same 5 6  7 will print
    System.out.println(favnumber);
    }
}