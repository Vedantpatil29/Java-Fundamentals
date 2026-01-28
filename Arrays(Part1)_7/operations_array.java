import java.util.*;
public class operations_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

         int marks[] = new int[50];  //creating array

         System.out.println(marks.length);  //code to find length of array
 
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();  //input in array
         marks[2] = sc.nextInt();

         System.out.println(marks[0]);  
           System.out.println(marks[1]);   //output in array
             System.out.println(marks[2]);


             marks[2] = 99;   //update array

               System.out.println(marks[2]);

               int percentage = (marks[0] + marks[1] + marks[2]) / 3 ;

               System.out.println("percentage is = " + percentage + "%");


    }
}