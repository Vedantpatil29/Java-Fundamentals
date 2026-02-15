import java.util.*;
public class q1{
    public static boolean repeat(int numbers[]){
        int n = numbers.length;

        for(int i = 0 ; i<n ; i++){
           

            for(int j = i+1 ; j<n ; j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int numbers[] = {1,1,6,7,8};

        System.out.println(repeat(numbers));
    }

    
}
