import java.util.*;
public class Parameters{

    /* part 1 (way 1 to write sum using parameters )
    public static void calculatesum(){ //we gave parameters a and b
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of input numbers is = " + sum);

    }
    public static void main(String args[]){  //note hamesha main function pahele run hota hain fir main fn jo bolega wahi cheesh pahali hoti hain
        calculatesum();
    }

    part 2 ;;;;(2nd way to write)

   public static void calculatesum(int a , int b){ 
       int sum = a + b;
      System.out.println("the sum of the number is = " + sum);

   }
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      calculatesum(a , b);

      part 3 (3rd method)
      public static void calculatesum(int num1 , int num2){  //here a value is send to num1 and b value send to num2
       int sum = num1 + num2;
      System.out.println("the sum of the number is = " + sum);

   }
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      calculatesum(a , b);

      */

     public static int calculatesum(int num1 , int num2){  
       int sum = num1 + num2;
       return sum;   //that means sum will return back to main fn and the last statment will print
      

   }
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a + b;
      calculatesum(a , b);
      System.out.println("the sum of the number is = " + sum);



   }
    
}