import java.util.*;
public class Reverse{
    public static void reverse(int numbers[]){
        int first = 0 , last = numbers.length-1;

        while(first<last){ //here if we do first <= last no need same number will get no need
           int temp = numbers[last];
           numbers[last] = numbers[first];
           numbers[first] = temp;

           first++;
           last--;         //as array is refercene value so change made in reverse func will consider in main fn too

        }

    }

        public static void main(String args[]){

            int numbers[] = {2,4,6,8,10};
            reverse(numbers);

           for(int i = 0; i<numbers.length ; i++){

            System.out.print(numbers[i] + " ");
           }

           

        }
    
}