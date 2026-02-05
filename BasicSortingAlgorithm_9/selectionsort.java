import java.util.*;
public class selectionsort{
    public static void selectionsort(int arr[]){
        for (int i = 0 ; i<arr.length-1 ; i++){
            int minvalueposition = i;

            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[minvalueposition] > arr[j]){
                    minvalueposition = j;
                }
            }
            int temp = arr[minvalueposition];
            arr[minvalueposition] = arr[i];
            arr[i] = temp;


        }
    }

    public static void printarr(int arr[]){
          for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");
          }
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionsort(arr);
        printarr(arr);
    }
}