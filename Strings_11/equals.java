import java.util.*;
public class equals{

    public static void main(String args[]){

        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if(s1.equals(s2)){
            System.out.println("both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }


         if(s1.equals(s3)){
            System.out.println("both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
}