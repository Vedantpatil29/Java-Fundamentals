import java.util.*;
public class Linear_Search{
    public static int linearsearch(int numb[] , int key){
        for(int i = 0 ; i < numb.length ; i++){
            if(numb[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
      //  String menu[] = {"dosa" , "samosa"};
        int key = 22;
        int numb[] = {1,33,44,55,22};
        int index = linearsearch(numb , key);

        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("the key = " + key + "is in index =  " + index);
        }
    }
}