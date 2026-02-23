import java.util.*;
public class key{
    public static void key(int numbers[] , int key){

        for(int i =0 ; i<numbers.length ; i++){
            if(numbers[i] == key){
                System.out.println("found at index =  " + i);
            }
        }

        System.out.println("key not founddd!!!!!");




    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int numbers[] = {4,7,8,9,10};
        int key = 9;
        key(numbers , key);
    }
}