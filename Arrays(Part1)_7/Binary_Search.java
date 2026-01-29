import java.util.*;
public class Binary_Search{
    public static int binarysearch(int numbers[], int key){
        int start = 0 , end = numbers.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(numbers[mid]==key){
                return mid;   //here hum return kr rahe hai index not number
            }

            if(numbers[mid] < key){
                start = mid+1;
            }
            if(numbers[mid] > key){
                end = mid - 1;
            }


        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 6;
        int ans = binarysearch(numbers , key);

        if(ans == -1){
            System.out.println("not found");
        }

        else{
            System.out.println(ans);

        }
    }
}