import java.util.*;
public class MaxSumPrefixMeth{
    public static void Prefixmeth(int numbers[]){

        int prefix[] = new int[numbers.length];
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        prefix[0] = numbers[0];

        for(int i = 1; i<prefix.length ; i++){   //for creating prefix array
            prefix[i] = prefix[i-1] + numbers[i];  
        }

        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;

            for(int j = i ; j<numbers.length ; j++){
                int end = j;

                currsum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currsum>maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String args[]){
        int numbers[]  = {1 , -2 , 6 ,-1 , 3 };
        Prefixmeth(numbers);

        
    }
}