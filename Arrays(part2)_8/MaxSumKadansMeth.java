import java.util.*;
public class MaxSumKadansMeth{
    public static void kadanssum(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i = 0 ; i<numbers.length ; i++){
            currsum = currsum + numbers[i];

            if(currsum<0){
                currsum = 0;
            }

            maxsum = Math.max(currsum , maxsum);

        }

        System.out.println("the max sum of the subarray is =  " + maxsum);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanssum(numbers);
    }
}