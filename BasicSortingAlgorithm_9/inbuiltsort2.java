/*
import java.util.*;
public class inbuiltsort2{
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());    method 1

        for(Integer i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}*/

import java.util.*;
public class inbuiltsort2{
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,0,3,Collections.reverseOrder());    //method 2

        for(Integer i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}