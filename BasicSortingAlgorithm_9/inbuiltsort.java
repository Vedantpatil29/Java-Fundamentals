/*import java.util.Arrays;
public class inbuiltsort{
        public static void main (String args[]){
        int arr [] = { 5,4,1,3,2};
        Arrays.sort(arr);                         method 1 for inbuilt sorting
      for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + "  ");
      }

    
    }
}*/

import java.util.Arrays;
public class inbuiltsort{
        public static void main (String args[]){
        int arr [] = { 5,4,1,3,2};
        Arrays.sort(arr , 0 ,3); 

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");           //method 2 for sorting 
                                                  
        }


        }
}       