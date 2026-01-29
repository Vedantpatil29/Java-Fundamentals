import java.util.*;
public class Largest{
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
                
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
          
        }
          System.out.println("smallest number in array is =  " + smallest);
          return largest; //wrong eka time par ek ki value return ho sakti hai therefore idhar hi print karenge
           
        
    }

    public static void main(String args[]){
        int numbers[] = {45,56,78,99};
       int maximum = largest(numbers);
       System.out.println("largest number in an array is = " + maximum);
    }
}