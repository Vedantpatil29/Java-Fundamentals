import java.util.*;
public class charAtFunction{

    public static void printelements(String str){

        for(int i = 0 ; i<str.length() ; i++){

            System.out.print(str.charAt(i) + " ");


        }
        System.out.println("");
    }

    
    public static void main(String args[]){
        String str = "Vedant Popat Patil";
        printelements(str);

    }
 
}