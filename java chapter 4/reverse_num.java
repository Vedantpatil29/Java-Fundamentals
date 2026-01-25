import java.util.*;
public class reverse_num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 45693;
        
        
        while(n>0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n/10;

        }

    }
}