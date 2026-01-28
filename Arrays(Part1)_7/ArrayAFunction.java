import java.util.*;
public class ArrayAFunction{
    public static void update(int marks[ ], int nonchangeable){
         nonchangeable = 10;  //if you add int nonchange then error allready declared above
        for(int i = 0 ; i<marks.length ; i++){
            marks[i] = marks[i] + 1;
        }

    }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            int nonchangeable = 5;

            int marks[] = {97,98,99};
            update(marks , nonchangeable);

            System.out.println(nonchangeable);

            for(int i = 0 ; i<marks.length ; i++){
                System.out.println(marks[i]);
            }

            System.out.println(" ");
        }
    }
