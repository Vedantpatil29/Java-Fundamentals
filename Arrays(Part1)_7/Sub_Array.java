import java.util.*;
public class Sub_Array{
    public static void subarr(int numbers[]){
        int total_subarray = 0;
        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;

            for(int j = i ; j<numbers.length ; j++){
                int end = j;                              //inner loop runs completely first

                for(int k = start ; k<=end ; k++){
                    System.out.print(numbers[k] + " ");
                    total_subarray++;
                    
                }
                System.out.println(" ");
                
            }
            System.out.println(" ");
        }
        System.out.println("the total sub array possible for array is =  " + total_subarray);
       
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};
        subarr(numbers);
    }
}